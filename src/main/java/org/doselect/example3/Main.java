package org.doselect.example3;

public class Main {
    public static void main(String[] args) throws Exception {
        Problem p = new Problem(41,"Exception");
        Checker c = new Checker();
        String s = c.checkProblem(p);
        String t = c.approveProblem(p);
        System.out.println(s);
        System.out.println(t);
    }
}
