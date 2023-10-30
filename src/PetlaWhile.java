public class PetlaWhile {
    public static void main(String[] args) {
        // warunek startowy musi byc zdefiniowany przed petla while
        // krok musi byc zdefiniowany w petli
        // do while w ramach petli podajemy tylko warunek
        // w petli while mozemy uzyc wiecej warunkow na roznych zmiennych
        int n = 0;
        while (n <= 10) {
            System.out.println(n);
            n++;
        }
 /*       int i = 100;
        int j = 10;

        while (i >= 50 && j < 50) {
            if (j % 5 == 0) {
                i = i - 5;
                j = j - 2;
            } else if (i % 10 == 0) {
                j = j - 2;

            }
            System.out.println( i + " " + j);
        }
*/
        // to zadanie mozna rozwiazac tylk ow petli while, nie da sie go zdrobic w petli for, chociazby
        // dlatego, ze tutaj nie da sie przewidziec ilosci krokow i sa tutaj zastosowane dwie zmienne
        int a = 12;
        int b = 18;
        int iteracje = 0;
        //Najwiekszy wspolny dzielnik 6
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
            iteracje++;
        }
        System.out.println("NWD to: " + a + " Ilość iteracji: " + iteracje);
        }
    }

