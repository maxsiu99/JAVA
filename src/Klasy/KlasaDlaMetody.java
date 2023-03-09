package Klasy;

public class KlasaDlaMetody {

    // typ Zwracany nazwaMetody (parametry ){
    //  }
    void metodaKtoraNicNieZwraca(){
        System.out.println("wartość z metody ");
    }

    void metodaKtoraPrzyjmujeArgument(int liczba, char pojedynczyznak){
        liczba ++;
        System.out.println("wartość metody z argumentem " + liczba + " " + pojedynczyznak);

    }

    void metodaKolejna(boolean czypokazac, int liczba){
        if(czypokazac == true){
            System.out.println(" liczba" + liczba);
        }else {
            System.out.println("nie wolno pokazać ");
        }

    }

    int dodawanie (int a, int b){
        int wynik = a + b ;
        return wynik;
    }

    double dodajPoPrzecinku(double liczDouble){
        double wynik = liczDouble + 0.55;
        return wynik;

    }

    boolean negacjawartosci(boolean wartosc){
        return !wartosc;
    }

    int zwrocOdWartosciLogicznej (boolean czyZwrocic, int liczba){
        if(czyZwrocic){  //domyślna wartoścć true
            return liczba;
        }else{
            return 0;  // musi coś zostać zwrócone
        }



    }



}
