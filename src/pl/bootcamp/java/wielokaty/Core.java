package pl.bootcamp.java.wielokaty;

import pl.bootcamp.java.wielokaty.figury.Figura;
import pl.bootcamp.java.wielokaty.figury.TworzenieFigur;
import pl.bootcamp.java.wielokaty.figury.czworokaty.Czworokat;
import pl.bootcamp.java.wielokaty.figury.czworokaty.Kwadrat;
import pl.bootcamp.java.wielokaty.figury.czworokaty.Prostokat;
import pl.bootcamp.java.wielokaty.figury.kolo.Kolo;
import pl.bootcamp.java.wielokaty.figury.pieciokaty.Pieciokat;
import pl.bootcamp.java.wielokaty.figury.pieciokaty.PieciokatForemny;
import pl.bootcamp.java.wielokaty.figury.szesciokaty.Szesciokat;
import pl.bootcamp.java.wielokaty.figury.szesciokaty.SzesciokatForemny;
import pl.bootcamp.java.wielokaty.figury.trojkaty.Trojkat;
import pl.bootcamp.java.wielokaty.figury.trojkaty.TrojkatRownoBoczny;
import pl.bootcamp.java.wielokaty.figury.trojkaty.TrojkatRownoRamienny;

import java.util.Scanner;

public class Core {
public static void start(){
    System.out.println("Podaj ile figur chcesz stworzyc");
    Scanner scanner = new Scanner(System.in);
    int ilosc = scanner.nextInt();

    int[][] tabBokow = new int[ilosc][];


    for (int i = 0; i < tabBokow.length; i++){
        TworzenieFigur tworzenieFigur = new TworzenieFigur();
        tabBokow[i] = tworzenieFigur.tworzenieBokow();
    }

    Figura[] figura = new Figura[ilosc];
    for (int i = 0; i< figura.length; i++){
        switch (tabBokow[i][0]){
            case 0:
                break;
            case 1:
                figura[i] = new Kolo(tabBokow[i][1]);
                break;
            case 3:
                if (tabBokow[i][1] == tabBokow[i][2] && tabBokow[i][2] == tabBokow[i][3]){
                    figura[i] = new TrojkatRownoBoczny(tabBokow[i][1]);
                } else if (tabBokow[i][1] == tabBokow[i][2] && tabBokow[i][2] != tabBokow[i][3]){
                    figura[i] = new TrojkatRownoRamienny(tabBokow[i][1],tabBokow[i][3]);
                }else if (tabBokow[i][1] != tabBokow[i][2] && tabBokow[i][2] == tabBokow[i][3]){
                    figura[i] = new TrojkatRownoRamienny(tabBokow[i][2],tabBokow[i][1]);
                }else if(tabBokow[i][1] == tabBokow[i][3] && tabBokow[i][2] != tabBokow[i][3]) {
                    figura[i] = new TrojkatRownoRamienny(tabBokow[i][1],tabBokow[i][2]);
                }else {
                    figura[i] = new Trojkat(tabBokow[i][1],
                            tabBokow[i][2], tabBokow[i][3]);
                }
                break;
            case 4:
                if (tabBokow[i][1] == tabBokow[i][2] &&
                        tabBokow[i][2] == tabBokow[i][3] &&
                        tabBokow[i][3] == tabBokow[i][4]){
                    figura[i] = new Kwadrat(tabBokow[i][1]);
                }else if (tabBokow[i][1] == tabBokow[i][2] && tabBokow[i][3] == tabBokow[i][4] ){
                    figura[i] = new Prostokat(tabBokow[i][1], tabBokow[i][3]);
                }else if (tabBokow[i][1] == tabBokow[i][3] && tabBokow[i][2] == tabBokow[i][4] ){
                    figura[i] = new Prostokat(tabBokow[i][1], tabBokow[i][2]);
                }else if (tabBokow[i][1] == tabBokow[i][4] && tabBokow[i][2] == tabBokow[i][3] ){
                    figura[i] = new Prostokat(tabBokow[i][1], tabBokow[i][2]);
                }else {
                    figura[i] = new Czworokat(tabBokow[i][1], tabBokow[i][2],
                            tabBokow[i][3], tabBokow[i][4]);
                }
                break;
            case 5:
                if(tabBokow[i][1] == tabBokow[i][2] &&
                        tabBokow[i][2] == tabBokow[i][3] &&
                        tabBokow[i][3] == tabBokow[i][4] &&
                        tabBokow[i][4] == tabBokow[i][5]){
                    figura[i] = new PieciokatForemny(tabBokow[i][1]);
                }else {
                    figura[i] = new Pieciokat(tabBokow[i][1], tabBokow[i][2],
                            tabBokow[i][3], tabBokow[i][4], tabBokow[i][5]);
                }
                break;
            case 6:
                if(tabBokow[i][1] == tabBokow[i][2] &&
                        tabBokow[i][2] == tabBokow[i][3] &&
                        tabBokow[i][3] == tabBokow[i][4] &&
                        tabBokow[i][4] == tabBokow[i][5] &&
                        tabBokow[i][5] == tabBokow[i][6]){
                    figura[i] = new SzesciokatForemny(tabBokow[i][1]);
                }else {
                    figura[i] = new Szesciokat(tabBokow[i][1], tabBokow[i][2],
                            tabBokow[i][3], tabBokow[i][4], tabBokow[i][5], tabBokow[i][6]);
                }
                break;
            default:
                System.out.println("Podales nieprawidlowa liczbe bokow");
                break;
        }
    }


    for (int i=0; i< figura.length; i++) {
        if (tabBokow[i][0] == 0) {
            System.out.print("Z podanych boków nie da się stworzyć wielokąta");
            System.out.println();
        }else if(tabBokow[i][0] == 1){
            StringBuilder stringBuilder = new StringBuilder();
            System.out.print(stringBuilder
                    .append(figura[i].printClassName())
                    .append(" promien - ")
                    .append(figura[i].podajBoki())
                    .append(" - obwod: ")
                    .append(figura[i].liczObwod())
                    .append(" pole: ")
                    .append(figura[i].liczPole())
                    .toString());
            System.out.println();
        }else {
            StringBuilder stringBuilder = new StringBuilder();
            System.out.print(stringBuilder
                    .append(figura[i].printClassName())
                    .append(" boki - ")
                    .append(figura[i].podajBoki())
                    .append(" - obwod: ")
                    .append(figura[i].liczObwod())
                    .append(" pole: ")
                    .append((figura[i].liczPole() != 0) ? figura[i].liczPole() : "brak")
                    .toString());
            System.out.println();
        }
    }
}
}
