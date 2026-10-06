package Praktikum6.Praktikum.Tugas;

public class TiketPesawat extends Tiket {
    //subclass dari tiket
    protected String maskapai;
    protected int beratBagasi;

    public TiketPesawat() {
    }

    public TiketPesawat(String kodeTiket, String namaPenumpang, String asal, String tujuan, int hargaDasar, String maskapai, int beratBagasi) {
        super(kodeTiket, namaPenumpang, asal, tujuan, hargaDasar);//inisialisasi atribut yang diwarisi parent
        this.maskapai = maskapai;
        this.beratBagasi = beratBagasi;
    }

    public int hitungBiayaBagasi() {
        if (beratBagasi > 20) {
            return (beratBagasi - 20) * 50000;
        }
        return 0;
    }

    public void tampilPesawat() {//method tampil output
        super.tampilTiket();//akses method di superclass milik subclass TiketPesawat
        System.out.println("Maskapai       = " + maskapai);
        System.out.println("Berat Bagasi   = " + beratBagasi + " kg");
        System.out.println("Biaya Bagasi   = " + hitungBiayaBagasi());
    }
}
