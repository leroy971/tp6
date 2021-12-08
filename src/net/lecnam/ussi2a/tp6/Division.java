package net.lecnam.ussi2a.tp6;

import java.io.IOException;

public class Division {

    public Division(){
    }


    // Ne traite pas les exception.
    public double division1(int a, int b){
        return(a/b);
    }


    // Traite l'exception / par 0, mais doit retourner un double.
    public Double division2(int a, int b){
        try {
            return (double)(a/b);
        }
        catch (Exception ArithmeticException){
            System.out.println("On ne peut pas diviser par 0 !!");
        }
        return null;
    }


    // Traite l'exception / par 0, et arrete la fonction (IOException) --> N'est pas obliger de retourner un double.
    public double division3(int a, int b) throws IOException{
        try {
            return (double)(a/b);
        }
        catch (ArithmeticException e){
            throw new IOException();
        }
    }

    public double division3bis(int a, int b) throws IOException{
        if (b==0){
            throw new IOException();

        }else{
            return(a/b);
        }
    }

}
