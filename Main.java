import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       int [] tomb = new int[100];
       for(int i = 0; i < 50; i++){

           tomb[i] = (int)( Math.random()*(101) )-50;
       }
       for(int i = 0; i < 50; i++) {
           System.out.println(tomb[i]);
       }

       //1. feladat:

        int szum = 0;
       for(int i = 0; i < tomb.length; i++){
           szum += tomb[i];
       }
        System.out.println("A tomb elemeinek osszege: " + szum);


       //2. feladat:









/*
        File test = new File("src/test.txt");

        try{

            Scanner sc  = new Scanner(System.in);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }


            FileWriter writer = new FileWriter(test);
            writer.write("Elso sor \n");
            writer.write("masodik sor\n");
            writer.close();


        }


        catch(FileNotFoundException e){
            System.out.println("File not found\n");
            e.printStackTrace();
        }


        catch(Exception e) {
            System.out.println(e.getMessage());
        }


        Auto kocsi = new Auto("Honda", "Civic", 140);
        Auto kocsi2 = new Auto("Trabant", 26);
        Auto kocsi3 = new Auto("Fiat", "Seicento", 49);
        Auto kocsi4 = new Auto("Toyota","Corolla",80);


        System.out.println(kocsi.getMarka());
        System.out.println(kocsi.getTipus());
        System.out.println(kocsi.getCount());
        System.out.println(kocsi2.getMarka());
        System.out.println(kocsi2.getTipus());
        System.out.println(kocsi);
        System.out.println(kocsi3);

        List<Auto> kocsik = new ArrayList<>();

        kocsik.add(kocsi);
        kocsik.add(kocsi2);
        kocsik.add(kocsi3);

        Collections.sort(kocsik);

        System.out.println(kocsik);


*/
    }

}
