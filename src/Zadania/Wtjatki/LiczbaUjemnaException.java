package Zadania.Wtjatki;

public class LiczbaUjemnaException extends RuntimeException{    //extends RuntimeException - dziedziczenie po wyjątku typu uncheck

    public LiczbaUjemnaException(){
        super("Promień nie może być ujemny");
    }

}
