import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] currencies = {"EUR", "USD", "GBP", "BTC", "ETH", "SOL"};
        double[][] conversionRates = {
                {1.18, 0.85, 0.86, 0.000025, 0.035, 15.88}, // EUR
                {0.85, 1.0, 0.73, 0.000021, 0.03, 13.5}, // USD
                {0.86, 1.37, 1.0, 0.000032, 0.044, 20.76}, // GBP
                {54000, 62000, 31000, 1.0, 22, 1050000}, // BTC
                {3500, 4000, 3000, 0.05, 1.0, 500}, // ETH
                {35, 40, 30, 0.000037, 0.2, 1.0} // SOL
        };

        System.out.println("Maak een keuze aub..");
        System.out.println("1. US Dollar  2. GB Pond  3. Bitcoin  4.Ethereum  5. Solana");

        Scanner Scan = new Scanner(System.in);
        int InResult = Scan.nextInt();


        switch(InResult){
            case 1:
                System.out.println("Please enter US Dollar amount..");
                int usdAmount = InResult;


                break;
        }

        switch(InResult){
            case 2:
                double gbp = Scan.nextInt();




                break;
        }

        switch(InResult){
            case 3:
                double btc = Scan.nextInt();




                break;
        }

        switch(InResult){
            case 4:
                double eth = Scan.nextInt();





                break;
        }

        switch(InResult){
            case 5:
                double euro = Scan.nextInt();






        }
        //vanaf hier om coverter vragen
        Scanner Scan2 = new Scanner(System.in);
        int InResult2 = Scan2.nextInt();
        String toChoice = Scan2.nextLine();

        switch(InResult){
            case 1:
                System.out.println("Wat is het Euro bedrag ?");
                double euro = Scan.nextInt();
                String theAmountEur = "Euro =";
                String theAmountUsd = "US Dollar";

                System.out.println (euro + " " + theAmountEur + " " +  " " +  theAmountUsd);
                break;
        }

        switch(InResult){
            case 2:
                System.out.println("Wat is het Euro bedrag ?");
                double euro = Scan.nextInt();
                String theAmountEur = "Euro =";
                String theAmountGbp = "GB Pounds";

                System.out.println (euro + " " + theAmountEur + " " +   " " +  theAmountGbp);
                break;
        }

        switch(InResult){
            case 3:
                System.out.println("Wat is het Euro bedrag ?");
                double euro = Scan.nextInt();
                String theAmountEur = "Euro =";
                String theAmountBit = "Bitcoin";

                System.out.println (euro + " " + theAmountEur + " " +   " " +  theAmountBit);
                break;
        }

        switch(InResult){
            case 4:
                System.out.println("Wat is het Euro bedrag ?");
                double euro = Scan.nextInt();
                String theAmountEur = "Euro =";
                String theAmountEth = "Ethereum";


                System.out.println (euro + " " + theAmountEur + " " +   " " +  theAmountEth);
                break;
        }

        switch(InResult){
            case 5:
                System.out.println("Wat is het Euro bedrag ?");
                double euro = Scan.nextInt();
                String theAmountEur = "Euro =";
                String theAmountSol = "Solana";


                System.out.println (euro + " " + theAmountEur + " " +   " " +  theAmountSol);

        }

        Scan.close();
        Scan2.close();

    }
}