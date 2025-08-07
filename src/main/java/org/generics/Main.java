package org.generics;

public class Main {

    public static void main(String[] args) {
        Print print = new Print();
        print.setVal(2);
        Object printVal = print.getVal();
        // Either do type casting or do instanceof
        if((int)printVal == 2){
            System.out.println("Integer Type");
        }
        else if(printVal instanceof Integer){
            System.out.println("Int type");
        }
        else if(printVal instanceof String){
            System.out.println("String type");
        }
        else if(printVal instanceof String[]){
            System.out.println("String array type");
        }
        // Multiple if else condition for each type
        // So we need generics here, helps you to avoid type casting or multiple if else block.

        // Using Generics
        PrintGeneric<Integer> generic = new PrintGeneric<>();
        generic.setVal(2);
        Integer genVal = generic.getVal();
        if(genVal == 2){
            System.out.println("Integer Type");
        }
        // No type casting, no multiple if-else loop
        // if we provide a String type in setVal -> gives error -> PrintGeneric<Integer> type
        // if we want to use String make it as String like PrintGeneric<String>

        PrintChild child = new PrintChild();
        child.setVal("hello");
        //child.setVal(1); // error

        // Child class is generic type, no need to define object type while creating class
        // We can define object while creating object

        PrintChildGeneric<String> childgeneric = new PrintChildGeneric<>();
        childgeneric.setVal("Deepiks");

        // multiple generics type
        Pair<String,Integer> pair = new Pair<>();
        pair.put("Deepika",1);

        //raw type:
        // name of generic class or interface without any type argument
        PrintGeneric rawtype = new PrintGeneric<>();
        rawtype.setVal(1);
        rawtype.setVal("Deep");




    }
}

