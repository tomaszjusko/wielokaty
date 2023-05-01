package pl.bootcamp.java.wielokaty.figury;

import java.util.ArrayList;
import java.util.Scanner;

public class TworzenieFigur {

    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> listaLiczb = new ArrayList<>();

    public int[] tworzenieBokow() {

        System.out.println("podaj dlugosci bokow oddzielone spacjami, wprowadz \"stop\" aby zakonczyc figure");

        while (scanner.hasNextInt()) {
            listaLiczb.add(scanner.nextInt());
        }

        int[] tablica = new int[listaLiczb.size() + 1];
        for (int i = 1; i < listaLiczb.size() + 1; i++) {
            tablica[i] = listaLiczb.get(i - 1);
        }
       tablica[0] = listaLiczb.size();

        int sum = 0;
        for (int i = 1; i< tablica.length; i++){
            sum += tablica[i];
        }
        for (int i = 1; i< tablica.length; i++){
            if (tablica[i] > sum - tablica[i] && tablica.length != 2){
                tablica[0] = 0;
                break;
            }
        }
        return tablica;
    }

}
