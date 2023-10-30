public class Main {
    public static void main(String[] args) {
        CarProgramowanieObiektowe c1 = new CarProgramowanieObiektowe();
        c1.setKolor("Czerwony");
        c1.setMarka("Toyota");
        System.out.println(c1.getKolor());

        CarProgramowanieObiektowe c2 = new CarProgramowanieObiektowe();
        c2.setKolor("Zielony");
        c2.setMarka("BMW");
        c2.setSilnik(1600);
        System.out.println(c2.getKolor());

        CarProgramowanieObiektowe c3 = new CarProgramowanieObiektowe(
                "Czarny",
                "Mercedes",
                2000,
                2023
        );
        System.out.println(c3);
    }
}