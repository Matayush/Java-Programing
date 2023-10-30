public class ZadaniaNaZajeciach2 {
//Napisać program który obliczy sumę n elementów ciągu harmonicznego.
//    ciąg harmoniczny: 1 + 1/2 + 1/3 + 1/4 + 1/5 + .... + 1/n
    static void ciagHarmoniczny(int n) {
        double result = 0.0;
        for (int i = 1; i <= n; i++) {
            result = result + 1.0 / i;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        int n = 95;
        int x = 2;
        double ciag = 1;
        while (n >= x) {
            ciag = ciag + 1.0 / x;
            x = x + 1;
        }
        System.out.println("Suma elementów wynosi: " + ciag);


            ciagHarmoniczny(2);
            ciagHarmoniczny(3);
            ciagHarmoniczny(95);
}
}

