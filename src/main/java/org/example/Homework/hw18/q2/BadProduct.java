package org.example.Homework.hw18.q2;

import java.util.Objects;

public class BadProduct {
    private String code;
    private String name;

    public BadProduct(String code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BadProduct other = (BadProduct) o;
        return Objects.equals(code, other.code);
    }

    @Override
    public String toString() {
        return code + " " + name;
    }
}
