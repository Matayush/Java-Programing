public class CarProgramowanieObiektowe{
    // Zmienne (pola) opisujące elementy obiektu klasy

    private String kolor;
    private String marka;
    private int silnik;
    private int rokProdukcji;

    // Funkcje (metody), które służą "do obsługi" klasy.
    // Każda klasa posiada 3 zestawy metod
    // 1 - gettery: pobierania wartości danej zmiennej (pola)
    // 2 - settery: umozliwia ustawienie wartości dla danej zmiennej (pola)
    // 3 - inne: pozostałm metody w klasie

    @Override
    public String toString() {
        return "CarProgramowanieObiektowe{" +
                "kolor='" + kolor + '\'' +
                ", marka='" + marka + '\'' +
                ", silnik=" + silnik +
                ", rokProdukcji=" + rokProdukcji +
                '}';
    }


    //kontruktor- możemy mieć ich wiele w jednej klasie, możemy mieć też puste,
    // zalezy to tez od tego co ma byc uzupełnione a co ustawione domyślnie,
    // wszystie muszą być jakos unikatowe


    public CarProgramowanieObiektowe() {
    }

    public CarProgramowanieObiektowe(String kolor, String marka, int silnik, int rokProdukcji) {
        this.kolor = kolor;
        this.marka = marka;
        this.silnik = silnik;
        this.rokProdukcji = rokProdukcji;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getSilnik() {
        return silnik;
    }

    public void setSilnik(int silnik) {
        this.silnik = silnik;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }
}
