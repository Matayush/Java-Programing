public class PetlaFor {
    public static void main(String[] args) {
        // info o (start; warunek; krok)
        for ( int i = 0; i <= 15; i++ ) { // i++ == i = i + 1
            System.out.println(i);
        }
        for (int p = 10; p <=50; p = p + 2 ) {
            if (p >= 10 && p % 2 == 0) { // to samo rozwiazanie tego samego problemu ktory juz wyżej jest rozwiązany
                System.out.println(p);
            }
        }
    }
}
