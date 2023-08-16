package Zadania;

import java.util.Arrays;

public class KlasyTablica {
    private int[] tablica;

    public KlasyTablica(int[] podajTablice){
        tablica = podajTablice;
    }

    public int suma(){
        int suma = 0;
        for(int i = 0; i< tablica.length; i ++){
            suma = suma + tablica[i];
        }
        return suma;
    }

   public  int srednia(){
        int srednia =  suma() / tablica.length;
        return srednia;
    }

    public int min() {
        int min = Integer.MAX_VALUE;
        for (int i= 0; i< tablica.length; i++){
            if (tablica[i] < min ){
                min = tablica[i];
            }
        }
        return min;
    }

   public int max(){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i< tablica.length; i ++) {
            if (tablica[i] > max) {
                max = tablica[i];
            }
        }
        return max;
    }




}
