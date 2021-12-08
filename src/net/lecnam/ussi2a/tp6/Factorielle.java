package net.lecnam.ussi2a.tp6;

import java.io.IOException;

public class Factorielle {
    public Factorielle(){}


    public long calcul_fact(long l){
        long temp = 1;
        for(long i=1; i<=l; i++){
            temp = temp * i;
        }
        return temp;
    }

    public long calcul(String val) throws IOException, FactorialNegativeArgumentException, FactorialTooLargeArgumentException{

        Long l = 0l;

        if (val==null){
            throw new IOException("Le paramètre val est null");
        }
        try {
            l = Long.parseLong(val);
        }catch (NumberFormatException e) {
            throw new IOException("Le parametre n'est pas un nombre");
        }
        if (l < 0){
            throw new FactorialNegativeArgumentException(l);
        }
        if (l > 20){
            throw new FactorialTooLargeArgumentException(l);
        }
        return calcul_fact(l);

    }

}
