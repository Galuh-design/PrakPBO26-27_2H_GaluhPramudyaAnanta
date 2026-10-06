package Praktikum6.Praktikum.Tugas;

public class TiketKereta extends Tiket {
    //subclass dari tiket
    protected int nomorGerbong;
    protected String nomorKursi;

    public TiketKereta() {
    }

    public TiketKereta(String kodeTiket, String namaPenumpang, String asal, String tujuan, int hargaDasar, int nomorGerbong, String nomorKursi) {
        super(kodeTiket, namaPenumpang, asal, tujuan, hargaDasar);//inisialisasi atribut yang diwarisi parent
        this.nomorGerbong = nomorGerbong;
        this.nomorKursi = nomorKursi;
    }

    public void tampilKereta() {//method tampil output
        System.out.println("====== Tiket Kereta ======");
        super.tampilTiket();//akses method di superclass milik subclass TiketKereta
        System.out.println("Nomor Gerbong  = " + nomorGerbong);
        System.out.println("Nomor Kursi    = " + nomorKursi);
        System.out.println("Total Bayar    = " + getHargaDasar());
    }
}
