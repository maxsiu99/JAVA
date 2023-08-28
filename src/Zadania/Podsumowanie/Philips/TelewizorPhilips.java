package Zadania.Podsumowanie.Philips;

import Zadania.Podsumowanie.Telewizor;

public abstract class TelewizorPhilips implements Telewizor {

    private boolean statusWlaczony = false;
    private int obecnyProgram = 3;

    private String id;
    private  int cale;
    protected TelewizorPhilips(String id,int cale){
        this.id = id;
        this.cale = cale;
    }

    public String getId() {
        return id;
    }

    public int getCale(){
        return cale;
    }

    @Override
    public void wlacz() {
        statusWlaczony = true;
        System.out.println("WITAJ");
        emitujSygnalNaEkran();

    }

    @Override
    public void wylacz() {
        statusWlaczony = false;
        System.out.println("CZARNOŚĆ");

    }

    @Override
    public void przelaczProgram(int numer) {
        if (statusWlaczony){
            obecnyProgram = numer;
        }

    }

    private void  emitujSygnalNaEkran(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (statusWlaczony){
                try {
                System.out.println("program " + obecnyProgram);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }}
        }).start();
    }
}
