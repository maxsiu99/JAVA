package Pętle;

public class breakContinue {
    public static void main(String[] args) {
        int zmienna;
        for (zmienna =1; zmienna <= 20; zmienna++){
            System.out.println("przed continue "+ zmienna);
              if (zmienna == 18){
                  continue;
              }
            System.out.println("zmienna "+ zmienna);
        }

        for (zmienna=1; zmienna <=20; zmienna++){
            if (zmienna ==18){
                break;
            }
            System.out.println("zmienna w 2 pętli " + zmienna);

        }

        for (zmienna=1; ; zmienna++){
            if (zmienna == 100){
                break;
            }
            System.out.println("trzeci for " + zmienna);
        }
    }
}
