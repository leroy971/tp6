package net.lecnam.ussi2a.tp6;

public class FactorialTooLargeArgumentException extends Exception{

    public FactorialTooLargeArgumentException(long val){
        super("Le nombre val est trop grande : "+val);
    }
}
