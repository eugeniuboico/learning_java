package org.example.Homework.hw18.e2;


public class CnpValidator{

    public static void validateCnp(String cnp) throws InvalidCnpException{
        if (cnp == null) {
            throw new InvalidCnpException("CNP can not be null!");
        }
        if (cnp.length() != 13) {
            throw new InvalidCnpException("CNP must have 13 digits");
        }
    }
}
