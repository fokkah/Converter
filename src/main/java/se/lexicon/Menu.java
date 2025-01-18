package se.lexicon;


import java.util.Scanner;

public class Menu {


    public static void MenuStart() {

        System.out.println("Conversion app\n");

        System.out.println("1. Convert SEK to EUR");
        System.out.println("2. Convert SEK to USD");
        System.out.println("3. Convert EUR to SEK");
        System.out.println("4. Convert USD to SEK\n");
        System.out.println("5. EXIT");
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();
        //double eur = input.nextDouble();
        //double usd = input.nextDouble();

        switch (option) {
            case 1:
                System.out.println("Enter SEK amount for conversion to EUR");
                double sek = input.nextDouble();
                System.out.println(sek + " SEK gives you " + Conversion.SEKtoEUR(sek) + " Eur");
                //sek = input.nextDouble();TE#ST


        }


    }

}



