package se.lexicon;


public class Conversion {

    public static double ExchangeRateSekToEur(double SekToEur) {
        double EurResult = SekToEur * 0.087;
        return EurResult;
    }

    public static double ExchangeRateSekToUsd(double SekToUsd){
        double UsdResult = SekToUsd * 0.089;
        return UsdResult;
    }

     public static double ExchangeRateEurToSek(double EurToSek){
         double EurToSekResult = EurToSek * 11.5;
         return EurToSekResult;
    }

     public static double ExchangeRateUsdToSek(double UsdToSek) {
         double UsdToSekResult = UsdToSek * 11.19;
         return UsdToSekResult;
    }



}


