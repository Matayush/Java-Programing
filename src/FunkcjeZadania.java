/*
1. Napisz funkcję, która wyświetli sumę dwóch podanych liczb. Nic nie zwraca.
2. Napisać funkcję, która obliczy i zwróci NWD dwóch podanych liczb jako argumenty.
3. Napisać funkcję, która wyświetli liczby parzyste z podanego zakresu. Zakres podajemy jako argumenty
    funkcji. Nic nie zwracamy
4. Napisać funkcję, która zwróci True jeżeli podana liczba jako argument jest
    podzielna przez 3, 5 i 10. W przeciwnym razie zwraca false.
    Następnie wykorzystać tę funkcję jako warunek if napisany w mainie.
 */

import java.security.KeyStore;

public class FunkcjeZadania {
    // zadanie 1
    static void printTotal(double a, double b) {
        System.out.println(a + b);
    }

    // zadanie 2

    static int printNWD(int liczba_jeden, int liczba_dwa) {
        // NWD to 6.
        while (liczba_jeden != liczba_dwa) {
            if (liczba_jeden > liczba_dwa) {
                liczba_jeden = liczba_jeden - liczba_dwa;
            } else {
                liczba_dwa = liczba_dwa - liczba_jeden;
            }

        }
        return liczba_jeden;
    }
    //zadanie 3
    // Napisać funkcję, która wyświetli liczby parzyste z podanego zakresu. Zakres podajemy jako argumenty
    //    funkcji. Nic nie zwracamy
    static void even(int start, int end){
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
    //zadanie 4 Napisać funkcję, która zwróci True jeżeli podana liczba jako argument jest
    //    podzielna przez 3, 5 i 10. W przeciwnym razie zwraca false.
    //    Następnie wykorzystać tę funkcję jako warunek if napisany w mainie.
    static boolean correctValue( int v) {
        return v % 3 == 0 && v % 5 == 0 && v % 10 == 0;
    }


    public static void main(String[] args) {

        printTotal(5, 10);
        printTotal( 82, 93.5);
        System.out.println(printNWD(3, 12));
        System.out.println(printNWD(12, 18));
        System.out.println(printNWD(100, 110));
        System.out.println();
        even(0, 5);
        even(11, 13);
        System.out.println();
        System.out.println(correctValue(30));
        if (correctValue(20)) {
            System.out.println("Podana liczba jest podzielna przez 3, 5 i 10");
        } else {
            System.out.println("Podana liczna NIE jest podzielna przez 3, 5 lub 10");
        }



    }
}
