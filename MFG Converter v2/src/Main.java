import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        //scanner voor gebruikers invoer
        Scanner userInput = new Scanner(System.in);

        //String-Array met valuta benamingen + een double-Array met conversie ratios
        String[] currencies = {"Euro", "US Dollar", "GB Pond", "Bitcoin", "Ethereum", "Solana"};
        double[][] conversionRates = {
                {1.0, 0.85, 0.86, 0.000025, 0.035, 15.88}, // EUR
                {0.85, 1.0, 0.73, 0.000021, 0.03, 13.5}, // USD
                {0.86, 1.37, 1.0, 0.000032, 0.044, 20.76}, // GBP
                {54000, 62000, 31000, 1.0, 22, 1050000}, // BTC
                {3500, 4000, 3000, 0.05, 1.0, 500}, // ETH
                {35, 40, 30, 0.000037, 0.2, 1.0} // SOL
        };

        double chosenAmount = 0.0;
        double[] chosenConversionRates = null;
        double[] chosenConversionRates2 = null;

        //vraag : Welke valuta wilt u omrekenen ?

        System.out.println("Vanaf welke valuta wilt u omrekenen ?");

        //begin van buitenste loop

        while (true) {
            // for loop om een valuta te selecteren
            for (int i = 0; i < currencies.length; i++) {
                System.out.println((i + 1) + ". " + currencies[i]);
            }

            // Scanner labelen met int variable om een waarde aan te kunnen koppelen
            int userChoice;

            try {
                userChoice = userInput.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Geen geldige invoer. Voer aub een geldig getal in.");
                userInput.next(); // Clear the invalid input
                continue;
            }

            // interne loop voor ongeldige invoer
            if (userChoice < 1 || userChoice > currencies.length) {
                System.out.println("Geen geldige invoer. Selecteer a.u.b. een valuta (1-6)..");
                continue;


            }
            if (userChoice == currencies.length) {
                chosenConversionRates = conversionRates[userChoice-1];
                userInput.nextInt();
                break;
            }
//In de volgende loop word er gevraagd naar welke valuta er omgerekend kan worden

            while (true) {
                // for loop om een valuta te selecteren
                System.out.println("Naar welke valuta wilt u omrekenen ?");


                try {
                    userChoice = userInput.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Geen geldige invoer. Voer aub een geldig getal in.");
                    userInput.next(); // Clear the invalid input
                    continue;
                }

                // interne loop voor ongeldige invoer
                if (userChoice < 1 || userChoice > currencies.length) {
                    System.out.println("Geen geldige invoer. Selecteer a.u.b. een valuta (1-6)..");
                    continue;


                }
                if (userChoice == currencies.length) {
                    chosenConversionRates2 = conversionRates[userChoice - 1];
                    userInput.nextInt();
                    break;
                }

//In deze loop zal er gevraagd worden om het bedrag dat omgerekend zal worden

                while (true) {
                    // for loop om een valuta te selecteren
                    System.out.println("Wat is het bedrag ?");


                    try {
                        userChoice = userInput.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("Geen geldige invoer. Voer aub een geldig bedrag in (alleen cijfers)..");
                        userInput.next(); // Clear the invalid input
                        continue;
                    }

                        chosenAmount = userChoice;
                        userInput.nextDouble();
                        break;
                }

            }
        }
                double convertedAmount = (chosenAmount * chosenConversionRates[0]) / chosenConversionRates2[0];
                System.out.println("userChoice = " + convertedAmount);
    }
}
