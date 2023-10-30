public class CwiczenieGoraczka {
    public static void main(String[] args) {
        double x = 36.3;
        if (x > 36.8) {
            System.out.println("Gorączka");
        } else if (x >= 36.4 && x<= 36.8){
            System.out.println("stabilnie");
        } else if (x < 36.4) {
            System.out.println("Ochłodzenie");
        } else {
            System.out.println(x);
        }
    }
}
