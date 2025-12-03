package org;
/*
Immutable DTOs for : Kafka message Models,Rest Response Model, Audit logs
 */


public final class ImmutableClass {
    private final String name;
    private final Integer id;

    // no setter , only getters

    ImmutableClass(String name, Integer id){
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public Integer getId(){
        return this.id;
    }


}
