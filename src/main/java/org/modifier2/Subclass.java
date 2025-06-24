package org.modifier2;

import org.modifiers.Person;


/*A protected member is accessible:
Within the same package
In a subclass, but only through subclass references,
not via superclass instances from another package.
*/

/*
In Java:
Reference type determines which fields are accessible at compile-time.
Actual object type determines which method implementation runs at runtime (polymorphism).
 */
public class Subclass extends Person {
    public static void main(String[] args) {
        Subclass person = new Subclass();
        System.out.println(person.name);
        System.out.println(person.age);

        Person p = new Subclass();
        System.out.println(p.name);
        System.out.println(((Subclass)p).age);
    }
}
