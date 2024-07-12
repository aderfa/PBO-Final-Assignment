public class Novel {
    private int id;
    private String judul;
    private String pengarang;
    private double harga;
    private int jumlahHalaman;

    
    public Novel() {
        System.out.println("Object Novel telah diciptakan");
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

    public int getJumlahHalaman() {
        return this.jumlahHalaman;
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

    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

   
    public void naikkanHarga() {
        System.out.println("Harga novel dinaikkan");
    }

   
    public void naikkanHarga(double kenaikan) {
        this.harga += kenaikan;
        System.out.println("Harga novel dinaikkan sebesar " + kenaikan);
    }

   
    public void bacaSinopsis() {
        System.out.println("Membaca sinopsis novel " + this.judul);
    }
}
