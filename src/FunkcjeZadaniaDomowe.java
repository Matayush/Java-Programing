public class FunkcjeZadaniaDomowe {
//Napisz funkcję, która zwróci true, jeżeli pierwszy argument jest podzielny przez drugi. Inaczej zwracam false.
//Napisz funkcję, która niczego nie zwraca, a jej zadaniem jest wyświetlenie:
// sumy, różnice, iloczyn, iloraz podanych argumentów.
// Zrób zabezpieczenie, kiedy drugi argument jest równy 0 (nie wolno dzielić przez zero). :slightly_smiling_face:

    // zadanie 1
    static boolean onebytwo(int x, int y) {
        return x % y == 0;

    }
    // zadanie 2
    static void cal(int a, int b) {
        if (b == 0) {
            System.out.println("Nie można dzielić przez 0");
        } else {
            System.out.println("Suma a i b wynosi:" + (a + b));
            System.out.println("Róznica a - b wynosi: " + (a - b));
            System.out.println("Iloraz a * b wynosi: " + a * b);
            System.out.println("Iloczyn a/b wynosi: " + a / b);

        }
    }
    public static void main(String[] args) {
     boolean c1 = onebytwo(10 ,5);
        boolean c2 = onebytwo(55 ,5);
        System.out.println(onebytwo(10, 5));
        System.out.println(c1);
        System.out.println(c2);

        cal(2, 0 );
    }
}
