package Klasy;

public class Metody {
    public static void main(String[] args) {


        KlasaDlaMetody nazwaObiektu = new KlasaDlaMetody();
        nazwaObiektu.metodaKtoraNicNieZwraca();

        KlasaDlaMetody argument = new KlasaDlaMetody();
        argument.metodaKtoraPrzyjmujeArgument(5, '$');
        argument.metodaKolejna(true,100);
        int wynikDodawania = argument.dodawanie(10,5);
        System.out.println("wynik dodawanie "+ wynikDodawania);

        double wynikKolejnejMetody = argument.dodajPoPrzecinku(50.1);
        System.out.println("po przecinku " + wynikKolejnejMetody);

        boolean waroscLogiczna = argument.negacjawartosci(false);
        System.out.println("negacja " + waroscLogiczna);


    }

}
