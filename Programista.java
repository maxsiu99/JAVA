package Zadania;

public class Programista {

    //A
    private String imie;
    private String nazwisko;
    private String jezyk;
    private Double zarobki;


     //C
    public Programista(String podajImie, String podajNazwisko, String podajJezyk, Double podajZarobki){
        imie = podajImie;
        nazwisko = podajNazwisko;
        jezyk = podajJezyk;
        zarobki = podajZarobki;
    }


    //B
    public String pobierzImie(){
        return imie;
    }
    public String pobierzNazwisko(){
        return nazwisko;
    }
    public String pobierzJezyk(){
        return jezyk;
    }
    public Double pobierzZarobki(){
        return zarobki;
    }

}
