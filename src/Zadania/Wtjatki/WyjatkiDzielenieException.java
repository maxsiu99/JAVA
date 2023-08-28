package Zadania.Wtjatki;

public class WyjatkiDzielenieException extends Exception{

    public WyjatkiDzielenieException(){           //konstruktor
        super("Nie wolno dzielić przez 0!");      //wywołanie z klasy nadrzędnej
    }

}
