package org.exceptions;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ThrowDemo {
    public void divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        System.out.println(a / b);
    }

    public static void main(String[] args) {
        ThrowDemo throwDemo = new ThrowDemo();
        throwDemo.divide(5,5);
        throwDemo.divide(6,0);

    }
}
