package org.streams.example6;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Specialist> specialists = Arrays.asList(
                new Specialist("Deepika",new BigDecimal(5000)  ,Specialty.ENGINEER),
                new Specialist("Bhargav",new BigDecimal(3000)  ,Specialty.DEVOPS),
                new Specialist("Ashok",new BigDecimal(10000)  ,Specialty.MANAGER)
        );
        Implementation imp = new Implementation();
        System.out.println(imp.filterBySpecialty(specialists));
        System.out.println(imp.sortSpecialistByName(specialists));
    }
}
