package Praktikum6.Praktikum.Tugas;

public class TiketDomestik extends TiketPesawat {
    //subclass dari TiketPesawat dan Tiket
    protected int pajakBandara;

    public TiketDomestik() {
    }

    public TiketDomestik(String kodeTiket, String namaPenumpang, String asal, String tujuan, int hargaDasar, String maskapai, int beratBagasi, int pajakBandara) {
        super(kodeTiket, namaPenumpang, asal, tujuan, hargaDasar, maskapai, beratBagasi);//inisialisasi atribut yang diwarisi parent
        this.pajakBandara = pajakBandara;
    }

    public void tampilDomestik() {
        System.out.println("====== Tiket Pesawat Domestik ======");
        super.tampilPesawat();//akses method di superclass milik subclass TiketDomestik
        System.out.println("Pajak Bandara  = " + pajakBandara);
        int totalBayar = getHargaDasar() + hitungBiayaBagasi() + pajakBandara;
        System.out.println("Total Bayar    = " + totalBayar);
    }
}
