package org.doselect.example3;

public class Checker {
    String checkProblem(Problem p) throws Exception{
        if(p.credits < 10) throw new ProblemException("Insufficient credits");
        if(p.type == "String") throw new ProblemException("String problem found");
        if(p.type == "Generic") throw new ProblemException("Generic problem found");
        if(p.type == "I/O") throw new ProblemException("I/O problem found");
        return "Exception Problem found";
    }

    public String approveProblem(Problem p){
        try{
            String result = checkProblem(p);
        }catch (ProblemException e){
            return "Not approved";
        }catch (Exception e){
            return "Other Exception";
        }
        return "Problem approved";

    }
}
