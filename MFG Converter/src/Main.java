import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double eurUsd = 1.18;
        double eurGbp = 0.86;
        double eurBtc = 0.000025;
        double eurEth = 0.035;
        double eurSol = 15.88;

        double usdEur = 0.85;
        double usdGbp = 0.73;
        double usdBtc = 0.000021;
        double usdEth = 0.03;
        double usdSol = 13.5;

        double gbpEur = 1.16;
        double gbpUsd = 1.37;
        double gbpBtc = 0.000032;
        double gbpEth = 0.044;
        double gbpSol = 20.76;

        double btcEur = 54000;
        double btcUsd = 62000;
        double btcGbp = 31000;
        double btcEth = 22;
        double btcSol = 1050000;

        double ethEur = 3500;
        double ethUsd = 4000;
        double ethGbp = 3000;
        double ethBtc = 0.05;
        double ethSol = 500;

        double solEur = 35;
        double solUsd = 40;
        double solGbp = 30;
        double solBtc = 0.000037;
        double solEth = 0.2;

        Scanner Scan = new Scanner(System.in);
        int InResult = Scan.nextInt();
        String fromChoice = Scan.nextLine();


        System.out.println("Maak een keuze aub..");
        System.out.println("1. US Dollar  2. GB Pond  3. Bitcoin  4.Ethereum  5. Solana");


        switch(InResult){
            case 1:
                System.out.println("Please enter US Dollar amount..");
                String usd = Scan.nextLine();


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
                double curate = euro * eurSol;





        }
        //vanaf hier om coverter vragen
        Scanner Scan2 = new Scanner(System.in);
        int InResult2 = Scan2.nextInt();
        String toChoice = Scan2.nextLine();

       switch(InResult){
             case 1:
            System.out.println("Wat is het Euro bedrag ?");
            double euro = Scan.nextInt();
            double curate = euro * eurUsd;
            String theAmountEur = "Euro =";
            String theAmountUsd = "US Dollar";

            System.out.println (euro + " " + theAmountEur + " " +  curate + " " +  theAmountUsd);
            break;
        }

        switch(InResult){
            case 2:
            System.out.println("Wat is het Euro bedrag ?");
            double euro = Scan.nextInt();
            double curate = euro * eurGbp;
            String theAmountEur = "Euro =";
            String theAmountGbp = "GB Pounds";

            System.out.println (euro + " " + theAmountEur + " " +  curate + " " +  theAmountGbp);
            break;
        }

        switch(InResult){
            case 3:
            System.out.println("Wat is het Euro bedrag ?");
            double euro = Scan.nextInt();
            double curate = euro * eurBtc;
            String theAmountEur = "Euro =";
            String theAmountBit = "Bitcoin";

            System.out.println (euro + " " + theAmountEur + " " +  curate + " " +  theAmountBit);
            break;
        }

        switch(InResult){
            case 4:
            System.out.println("Wat is het Euro bedrag ?");
            double euro = Scan.nextInt();
            double curate = euro * eurEth;
            String theAmountEur = "Euro =";
            String theAmountEth = "Ethereum";


            System.out.println (euro + " " + theAmountEur + " " +  curate + " " +  theAmountEth);
            break;
        }

        switch(InResult){
            case 5:
            System.out.println("Wat is het Euro bedrag ?");
            double euro = Scan.nextInt();
            double curate = euro * eurSol;
            String theAmountEur = "Euro =";
            String theAmountSol = "Solana";


            System.out.println (euro + " " + theAmountEur + " " +  curate + " " +  theAmountSol);

        }

        Scan.close();
        Scan2.close();

        }
    }