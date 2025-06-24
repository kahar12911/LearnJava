package org.stringBuilder;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        sb.append("Deepika");
        sb.insert(0,"My ");
        sb.insert(3,"name ");
        System.out.println(sb);
        System.out.println(sb.getClass());
        sb.insert(0, true);
        sb.insert(0,new char[5]);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.toString().getClass() +" String hashcode "+ sb.toString().hashCode() +" StringBUilder hashcode "+sb.hashCode());
        System.out.println(sb.toString().toLowerCase() +" " + sb.toString().hashCode() + " Lowercase hashcode: "+ sb.toString().toLowerCase().hashCode());
        System.out.println(" Different HashCode for each toString() operation , Every time new Object has been created. "+sb.toString().toUpperCase().hashCode());
        sb.reverse();
        System.out.println(sb);



    }
}
