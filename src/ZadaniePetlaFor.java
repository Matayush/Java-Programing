public class ZadaniePetlaFor {
    public static void main(String[] args) {

        for (int x = 0; x <= 60; x++) {
            if (x % 3 == 0 && x % 5 == 0) {
                System.out.println("Pif paf");
            } else if (x % 3 == 0) {
                System.out.println("Pif");
            } else if (x % 5 == 0) {
                System.out.println("Paf");
            } else {
                System.out.println(x);
            }
        }
        int r = 1;
        for (int a = 0; a <= 10; a++){
            if (a == 0) {
                System.out.println(r);
            } else {
                r = r * 2;
                System.out.println("Wartość a=" + a + " Wartość r=" +r);
            }

        }
    }
}

