package Praktikum6.Praktikum.Tugas;

public class TiketInternasional extends TiketPesawat {
    //subclass dari TiketPesawat dan Tiket
    protected String nomorPaspor;
    protected int asuransi;

    public TiketInternasional() {
    }

    public TiketInternasional(String kodeTiket, String namaPenumpang, String asal, String tujuan, int hargaDasar, String maskapai, int beratBagasi, String nomorPaspor, int asuransi) {
        super(kodeTiket, namaPenumpang, asal, tujuan, hargaDasar, maskapai, beratBagasi);//inisialisasi atribut yang diwarisi parent
        this.nomorPaspor = nomorPaspor;
        this.asuransi = asuransi;
    }

    public void tampilInternasional() {
        System.out.println("====== Tiket Pesawat Internasional ======");
        super.tampilPesawat();//akses method di superclass milik subclass TiketInternasional
        System.out.println("Nomor Paspor   = " + nomorPaspor);
        System.out.println("Asuransi       = " + asuransi);
        int totalBayar = getHargaDasar() + hitungBiayaBagasi() + asuransi;
        System.out.println("Total Bayar    = " + totalBayar);
    }
}
