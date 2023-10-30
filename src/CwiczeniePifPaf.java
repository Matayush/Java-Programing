public class CwiczeniePifPaf {
    public static void main(String[] args) {
        int x = 11;
        if (x % 3 == 0 && x % 5 == 0) {
            System.out.println("Pif paf");
        } else if (x % 3 ==0) {
            System.out.println("Pif");
        } else if (x % 5 == 0) {
            System.out.println("Paf");
        } else {
            System.out.println(x);
        }
    }
}
