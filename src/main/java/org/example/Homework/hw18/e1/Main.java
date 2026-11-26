package org.example.Homework.hw18.e1;


public class Main extends Person{

    static public void main(String[] args) {
        Person p = new Person();
        int[] testAges = {17, 18, 65, 66};

        for(int age : testAges) {
            try {
                p.setAge(age);
                System.out.println(age + " is okey, age set to " + p.getAge());
            } catch (IllegalArgumentException e) {
                System.out.println(age + " error " + e.getMessage());
            }
        }
    }
}
