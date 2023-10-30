public class ZadanieSumowanieWartosci {
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                suma = suma + i;
                System.out.println(suma);
            } else {
                System.out.println("Liczba niepodzielna przez 3 i 7");
            }
        }System.out.println("To jest końcowy wynik: "+ suma);


        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                sum += i;
            }
        }
        System.out.println("Suma liczb od 0 do 100, które są podzielne przez 3 i 7 wynosi: " + sum);
    }
}