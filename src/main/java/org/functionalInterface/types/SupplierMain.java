package org.functionalInterface.types;

public class SupplierMain {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> {
            return "Hello, Deepika Kahar";
        };
        String s = supplier.get();
        System.out.println(s);

        Supplier<String> s2 = () -> "One liner , Deepika";
        String t = s2.get();
        System.out.println(t);
    }
}
