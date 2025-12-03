package org.doselect.example2;

public class Material {
    private int mass;
    private int temerature;

    public Material(int mass , int temp){
        this.mass = mass;
        this.temerature = temp;
    }

    public String checkMaterial() throws Exception{
        if(mass < 0 ) throw new MaterialException("Mass cannot be negative");
        if(mass==0) throw new MaterialException("Mass cannot be zero");
        return "Valid Material";

    }

    public String flowOfHeat(){
        try{
            String result = checkMaterial();
        }catch (MaterialException e){
            return "Invalid Material";
        }catch (Exception e){
            return "Other exception";
        }
        return "Both in equilibrium";
    }

}
