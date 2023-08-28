package Zadania.Watki;

public class CzasoOdmierzacz implements Runnable{

    @Override
    public void run() {

        //for(int i = 0; i <i+1; i++ )
        int i = 0;
        while (true)
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
            System.out.println("program działa " + i + " sekund");

        }
    }
}
