package Praktikum6.Praktikum.Tugas;

public class Tiket {
    //atribute class Tiket yang akan diwariskan
    protected String kodeTiket;
    protected String namaPenumpang;
    protected String asal;
    protected String tujuan;
    private int hargaDasar;

    public Tiket() {
    }

    public Tiket(String kodeTiket, String namaPenumpang, String asal, String tujuan, int hargaDasar) {
        //konstruktor berparameter untuk inisialisasi atribut
        this.kodeTiket = kodeTiket;
        this.namaPenumpang = namaPenumpang;
        this.asal = asal;
        this.tujuan = tujuan;
        this.hargaDasar = hargaDasar;
    }

    public int getHargaDasar() {//getter atribut private
        return hargaDasar;
    }
    public void setHargaDasar(int hargaDasar) {//setter untuk atribut private
        this.hargaDasar = hargaDasar;
    }

    public void tampilTiket() {//method output
        System.out.println("Kode Tiket     = " + kodeTiket);
        System.out.println("Nama Penumpang = " + namaPenumpang);
        System.out.println("Rute           = " + asal + " - " + tujuan);
        System.out.println("Harga Dasar    = " + hargaDasar);
    }
}
