public class Main {
    public static void main(String[] args) {
        
        Pengguna pengguna = new Pengguna();
        pengguna.setUsername("user123");
        pengguna.setPassword("password123");
        pengguna.login();

        
        Tamu tamu = new Tamu();
        tamu.setSisaMasaAktif(30);
        tamu.login();

        
        Buku buku = new Buku();
        buku.setJudul("Pemrograman Java");
        buku.setPengarang("Penulis A");
        buku.setHarga(50000);
        buku.naikkanHarga(5000);

        
        Komik komik = new Komik();
        komik.setJudul("Komik Naruto");
        komik.setPengarang("Masashi Kishimoto");
        komik.setVolume(72);
        komik.naikkanHarga();

        
        Novel novel = new Novel();
        novel.setJudul("Laskar Pelangi");
        novel.setPengarang("Andrea Hirata");
        novel.setHarga(60000);
        novel.setJumlahHalaman(529);
        novel.naikkanHarga(10000);
        novel.bacaSinopsis();
    }
}
