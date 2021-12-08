package net.lecnam.ussi2a.tp6;

import java.io.IOException;

public class Main {

    public static void exercice1(int a, int b){
        Division div = new Division();
        System.out.println(div.division1(a, b));
    }

    public static void exercice2(int a, int b){
        Division div = new Division();
        System.out.println(div.division2(a, b));
    }

    public static void exercice3(int a, int b){
        Division div = new Division();
        try {
            double res = div.division3(a, b);
            System.out.println(res);
        }catch(IOException e){
            System.out.println("Division par ZERO !!!");
        }
    }

    public static void main(String[] args) {
        // Division de 10 par 0  --> Error Exception / by zero
        //exercice1(10, 0);
        //exercice2(10, 0);
        exercice3(10, 0);


    }
}
