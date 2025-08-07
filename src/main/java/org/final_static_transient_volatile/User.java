package org.final_static_transient_volatile;

import java.io.Serializable;

public class User implements Serializable {
    final int id;
    String name;
    transient String password;
    static int totalUser = 0;

    public User(int id, String name, String password){
        this.id = id;
        this.name = name;
        this.password = password;
        totalUser++;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", totalUser='"+ totalUser + '\''+
                '}';
    }
}
