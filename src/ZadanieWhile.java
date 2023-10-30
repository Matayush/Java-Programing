public class ZadanieWhile {
    /* 4. Za pomocą pętli while wyświetlić wszystkie liczby podzielne przez 3 z przedziału <0, 60>.
5. Za pomocą pętli while wyświetlić wszystkie potęgi liczby 3 od 0 do 10.
*6. Za pomocą pętli while obliczyć silnię liczby n.
!= - ROZNE OD 0
*/
    public static void main(String[] args) {
        int i = 0;
        while (i <= 60) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
            i++;
        }
        int pot = 0;
        int f = 1;
        while (pot <= 10) {
            System.out.println(f);
            f = f * 3;
            pot++;
        }
        int n = 5;
        int iloczyn = 1;
        while (n > 1) {
            iloczyn = iloczyn * n;
            n = n - 1;
        }
        System.out.println("Silnia wynosi " + iloczyn);

    }
}
