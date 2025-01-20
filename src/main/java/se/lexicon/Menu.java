package se.lexicon;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Menu {


    public static void MenuStart() {
        LocalDate dateAsofNow = LocalDate.now();

        System.out.println("Conversion app\n");
        System.out.println("Time " +  dateAsofNow);

        System.out.println("1. Convert SEK to EUR");
        System.out.println("2. Convert SEK to USD");
        System.out.println("3. Convert EUR to SEK");
        System.out.println("4. Convert USD to SEK\n");
        System.out.println("5. EXIT");

            try {

        Scanner input = new Scanner(System.in);
                int option = input.nextInt();


            if (false)
            throw new RuntimeException("Not a valid amount");
        switch (option) {

            case 1:
                System.out.println(" Enter SEK amount for conversion to EUR\n"+ dateAsofNow);
                double SekToEur = input.nextDouble();
                System.out.println(SekToEur + " SEK gives you " + Conversion.ExchangeRateSekToEur(SekToEur) + " Eur  \n"+ dateAsofNow);
                break;
            case 2:
                System.out.println(" Enter SEK amount for conversion to USD  \n" + dateAsofNow);
                double SekToUsd = input.nextDouble();
                System.out.println(SekToUsd + " SEK gives you " + Conversion.ExchangeRateSekToUsd(SekToUsd) + " Usd  \n" + dateAsofNow);
                break;
            case 3:
                System.out.println(" Enter EUR amount for conversion to SEK  \n" + dateAsofNow);
                double EurToSek = input.nextDouble();
                System.out.println(EurToSek + " EUR gives you " + Conversion.ExchangeRateEurToSek(EurToSek) + " SEK  \n" + dateAsofNow);
                break;
            case 4:
                System.out.println(" Enter USD amount for conversion to SEK  \n" + dateAsofNow);
                double UsdToSek = input.nextDouble();
                System.out.println(UsdToSek + " USD gives you " + Conversion.ExchangeRateUsdToSek(UsdToSek) + " SEK  \n" + dateAsofNow);
                break;
            case 0:
                System.out.println(" Enter 5 to leave the currency converter");
                System.exit(5);
                System.out.println(" Exiting program...\n" + dateAsofNow);
                break;
            default:
                System.out.println("Not a valid input, please try again  " + dateAsofNow);
                break;

        }
            } catch (Exception e) {
                System.out.println("Not a valid input, please try again");

            }
    }

}



