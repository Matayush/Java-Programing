public class ZadaniaNaZajeciach {
/*
    1. Napisać funkcję, która wyświetli "słupek" z podanego znaku.
    Wysokość słupka oraz znak podajemy jako argumenty.
    np. funkcja("A", 3)
    A
    A
    A
    */
    static void slupek(String a, int i) {
        while (i> 0) {
            i--;
            System.out.println(a);
        }
    }
/*    2. Napisać pętle while co dla parzystych wyświetli napis "OK", a dla nieparzystych "NOT OK".
    Działamy w zakresie <0, 20>

    3. Napisać pętle for, która wyświetli liczby podzielne przez 5 od 90 do 50.

    4. Napisać program, która posiada zmienną do której przypisujemy wartość 1-12.
    Dla 1 mamy wyświetlić Styczeń, dla 2 Luty, dla 3 Marzec itd..
    Dla wartości spoza zakresu podajemy informacje: "Nie rozponano miesiąca"
     */
    static void months(int num) {
        switch (num) {
            case 1:
                System.out.println("Styczeń");
                break;
            case 2:
                System.out.println("Luty");
                break;
            case 3:
                System.out.println("Marzen");
                break;
            case 4:
                System.out.println("Kwiecień");
                break;
            case 5:
                System.out.println("Maj");
                break;
            case 6:
                System.out.println("Czerwiec");
                break;
            case 7:
                System.out.println("Lipiec");
                break;
            case 8:
                System.out.println("Sierpień");
                break;
            case 9:
                System.out.println("Wrzesień");
                break;
            case 10:
                System.out.println("Październik");
                break;
            case 11:
                System.out.println("Listopad");
                break;
            case 12:
                System.out.println("Grudzień");
                break;
            default:
                System.out.println("Nie rozpoznano miesiąca.");
        }
    }

    public static void main(String[] args) {
      slupek("*", 3);
//zadanie 2
       int i = 0;
       while ( i <= 20 ) {
           if (i % 2 == 0) {
               System.out.println("OK");
           } else  {
               System.out.println("NOT OK");
           }
           i++;
       }
// zadanie 3
       for (int x = 90; x >= 50; x--) {
           if (x % 5 == 0) {
               System.out.println(x);
           }
       }
       months(13);

    }

}
