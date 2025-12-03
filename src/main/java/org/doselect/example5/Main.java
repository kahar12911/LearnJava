package org.doselect.example5;

public class Main {
    public static void main(String[] args) throws Exception {
        Validator v = new Validator();
        String x = v.checkComment("hello my name is steve");
        String y = v.commentTheString("my comment safe to post");
        System.out.println(x);
        System.out.println(y);
    }

}
