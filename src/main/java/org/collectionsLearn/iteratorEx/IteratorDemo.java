package org.collectionsLearn.iteratorEx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);

        Iterator<String> it = list.iterator();

        while(it.hasNext()){
            String str = it.next();
            if(str.equals("A")){
                //list.remove(str); // STRUCTURAL modification – not allowed here
                // correct way to remove it.remove
                /**
                 ConcurrentModificationException (CME) is not thrown immediately upon modification. It’s thrown only when the iterator detects the modification, and this detection happens inside next() or hasNext().
                 You removed "A" using list.remove(str) after calling next().
                 The list was structurally modified after the iterator was created.
                 But you did not call next() again after modification, so the Iterator never got a chance to detect the modification via expectedModCount
                 */
                //System.out.println("After removal: " + list);
            }
        }
        System.out.println(list);


        List<String> list1 = new ArrayList<>();
        list1.add("D");
        list1.add("E");
        System.out.println("list1 : "+list1);

        Iterator<String> it1 = list1.iterator(); // expectedModCount = 2 (same as modCount)

        String str1 = it1.next(); // OK, A
        list1.remove("D");  // // modCount = 3, but expectedModCount = 2 (no update here)
        String str2 = it1.next(); // triggers checkForComodification -> throws CME

    }
}
