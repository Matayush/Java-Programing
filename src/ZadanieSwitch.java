/*
        3. Program posiada 5 zmienne:
        double amount = ... // Ilość pieniędzy w PLN
        double converterEUR = 4.42 // Wartość w PLN 1 EURO
        double converterUSD = 4.01 // Wartość w PLN 1 USD
        double converterYEN = 0.028 // Wartość w PLN 1 YEN
        String currency = "EUR" | "USD" | "YEN"

        Nastęnie program podaje wynik amount/currency
        przy czym posiadamy switch, który pozwoli nam wybrać walutę.
        jeżeli podamy błędną walutę - dostaniemy komunikat "Nie rozpoznano waluty."
*/
public class ZadanieSwitch {
public static void main(String[] args) {
        double amount = 100; // Ilość pieniędzy w PLN
        double converterEUR = 4.42; // Wartość w PLN 1 EURO
        double converterUSD = 4.01; // Wartość w PLN 1 USD
        double converterYEN = 0.028; // Wartość w PLN 1 YEN
        String currency = "RUB";

        switch (currency) {
            case "EUR":
                System.out.println(amount/converterEUR);
                break;
            case "USD":
                System.out.println(amount/converterUSD);
                break;
            case "YEN":
                System.out.println(amount/converterYEN);
                break;
            default:
                System.out.println("Nie rozpoznano waluty.");
        }
    }
}
