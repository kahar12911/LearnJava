package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Shift+F9 to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Ctrl+F8.
//            System.out.println("i = " + i);
//        }
        Map<Integer,Integer> map = new TreeMap<>();
        int[] nums = {1,3,2,2,5,2,3,7};
        for(int i : nums){
            map.put(i , map.getOrDefault(i, 0 ) + 1);
        }
        System.out.println(map +" "+ map.keySet() +" " + map.values() +" "+ map.entrySet());

        int[] key = new int[map.size()];
        int[] value = new int[map.size()];
        int maxlen = 0;

        int i = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            key[i] = entry.getKey();
            value[i] = entry.getValue();
            i++;
        }

        for(int j = 1 ; j < map.size() ; j++){
            if(key[j] - key[j-1] == 1){
                maxlen = Math.max(maxlen , value[j] + value[j-1]);
            }
        }
        System.out.println(maxlen);

    }
}