package org.example.Homework.hw18.q1;

import java.util.Objects;

public class Donor {
    private String name;
    private String cnp;

    public Donor(String name, String cnp) {
        this.name = name;
        this.cnp = cnp;

    }

    @Override
    public boolean equals(Object o){
        if (this == o) {
            return true;
        }else if (o == null || getClass() != o.getClass()){
            return false;
        }
        Donor other = (Donor) o;
        return Objects.equals(cnp, other.cnp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cnp);
    }

    @Override
    public String toString() {
        return name + cnp;
    }
}
