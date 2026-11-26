package org.example.Homework.hw18.e2;

public class Main {
    public static void main(String[] args) {
        String[] testCnp = {"1234567890123", "12345", "12345678901ab", null};

        for (String cnp : testCnp) {
            try {
                CnpValidator.validateCnp(cnp);
                System.out.println(cnp + " valid");
            } catch (InvalidCnpException e) {
                System.out.println(cnp + " invalid " + e.getMessage());
            }
        }
    }

}
