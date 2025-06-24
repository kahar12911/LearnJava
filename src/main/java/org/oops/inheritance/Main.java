package org.oops.inheritance;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        Parent pc = new Child(); // Upcasting — polymorphism
        //Child cp = new Parent(); // Not Allowed
        System.out.println(parent.name);
        System.out.println(parent.age);
        //System.out.println(parent.spouce); Can only access Parent Data and Behavior
        parent.marry(); // Call Parent marry method
        parent.live();
        //parent.house(); // Only Parent Method/Behavior

        System.out.println(child.spouce);
        System.out.println(child.name); // Child can access both Parent and child attribute
        System.out.println(child.age);
        child.marry(); // Call Child Marry Method
        child.house();
        child.live(); // Call Parent and Child Method Both

        /* reference Object :  Parent , Actual Object : Child
        Reference type determines which fields are accessible at compile-time.
        Actual object type determines which method implementation runs at runtime (polymorphism).
         */
        System.out.println(pc.name);
        System.out.println(pc.age);
        //System.out.println(pc.spouce);
        // reference object is parent , can't call child field/Attribute.
        pc.live();
        // Overridden method → calls Child’s version
        pc.marry(); // Actual object is Child ( right of assignment ), Run child marry

        // Compile-time error — method not in Parent
        //pc.house();

        ((Child)pc).house(); // DownCasting
        // If you downcast without checking and it's not actually a Child:
        // Parent parent = new Parent();
        // Child child = (Child) parent;  //  Will throw ClassCastException at runtime
        // OR
        // Downcasting to access Child-specific method
        if (pc instanceof Child) {  // safe check before downcasting
            Child d = (Child) pc;
            d.house(); // Output: Child is calling house
        }


    }


}
