package org.generics;

public class MultiboundGeneric < T extends MultiBoundParent & Interface1 & Interface2> {

    // here we can have only one concrete class and many interfaces
    // this bound should cover all the class and interfaces in parent class,

}
