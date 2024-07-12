public class Buku {
    private int id;
    private String judul;
    private String pengarang;
    private double harga;

    
    public Buku() {
        System.out.println("Object Buku telah diciptakan");
    }

   
    public int getId() {
        return this.id;
    }

    public String getJudul() {
        return this.judul;
    }

    public String getPengarang() {
        return this.pengarang;
    }

    public double getHarga() {
        return this.harga;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    
    public void naikkanHarga() {
        System.out.println("Harga buku dinaikkan");
    }

  
    public void naikkanHarga(double kenaikan) {
        this.harga += kenaikan;
        System.out.println("Harga buku dinaikkan sebesar " + kenaikan);
    }
}
