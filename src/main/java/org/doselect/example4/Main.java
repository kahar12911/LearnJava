package org.doselect.example4;

public class Main {
    public static void main(String[] args) throws Exception {
        Rating rating = new Rating(9,7);
        Validator v = new Validator();
        String s = v.canConsideredForTheAward(rating);
        String t = v.sendInvite(rating);
        s.toLowerCase();
        t.toLowerCase();
        System.out.println(s);
        System.out.println(t);
    }
}
