package org.streams.example6;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Implementation {
    List<Specialist> filterBySpecialty(List<Specialist> specialists){
        List<Specialist> sp = specialists.stream().filter(s -> s.getSpecialty() == Specialty.ENGINEER).collect(Collectors.toList());
        return sp;
    }

    List<Specialist> sortSpecialistByName(List<Specialist> specialists){
        List<Specialist> sp = specialists.stream().sorted(Comparator.comparing(Specialist::getName)).collect(Collectors.toList());
        return sp;
    }
}
