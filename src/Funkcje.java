public class Funkcje {
    // Funkcje implementujemy nad main
    // static potem infomacja jakiego rodzaju dane beda zwracane, jeśli żadne dane nie będa zwracane to dajemy void
    static void printText(String txt) {
        System.out.println("Wyswietlam: " + txt);
    }

    // funkcja przyjmuje dwa arguemnty podstawa i potega
    // zwraca podstawa^potega jezeli potega jest parzysta, a przeciwnym razie -1
    static int powerEven(int podstawa, int potega) {
        if (potega % 2 == 0) {
            int result = 1;
            for (int i = 0; i <= potega; i++) {
                if (i != 0) {
                    result = result * podstawa;
                }
            }

            return result;
        } else {
            return -1;

        }
    }


    public static void main(String[] args) {
        String a = "A";
        String b = "B";
        printText(a);
        printText(b);
        printText("ABC");

        int t1 = powerEven(3, 2);
        int t2 = powerEven(2, 1);
        int t3 = powerEven(4, 3);
        System.out.println(powerEven(5, 2));
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        }
    }


