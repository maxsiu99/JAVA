package Zadania.KlasyDziedziczenie;

public class Pracownik extends Osoba{

    protected String stanowisko;
    protected String nazwaFirmy;

    public Pracownik(String imie, String nazwisko, String stanowisko, String nazwaFirmy){

        super(imie, nazwisko);
        this.stanowisko = stanowisko;
        this.nazwaFirmy = nazwaFirmy;

    }

    @Override
    public void przedstawSie() {
        System.out.println("Jestem "+ imie +" "+ nazwisko +" i pracuję w firmie "+nazwaFirmy + " na stanowisku " + stanowisko);
    }
}
