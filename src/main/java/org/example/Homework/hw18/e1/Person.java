package org.example.Homework.hw18.e1;

public class Person {
    private int age;

    public void setAge(int age) {

        if (age < 18 || age > 65) {
            throw new IllegalArgumentException("Accepted age is from 18 to 65");
        }else {
            this.age = age;
        }
    }
    public int getAge() {
        return age;
    }
}
