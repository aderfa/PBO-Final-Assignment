public class Komik extends Buku {
    private int volume;

    // Constructor
    public Komik() {
        super();
    }

    // Getter
    public int getVolume() {
        return this.volume;
    }

    // Setter
    public void setVolume(int volume) {
        this.volume = volume;
    }

    // Polymorphism - Overriding
    @Override
    public void naikkanHarga() {
        System.out.println("Harga komik dinaikkan");
    }
}
