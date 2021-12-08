package net.lecnam.ussi2a.tp6;

public class FactorialNegativeArgumentException extends Exception {

    public FactorialNegativeArgumentException(long val){
        super("Le nombre "+val+" est négatif");
    }
}
