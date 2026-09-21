package Praktikum4.id.ac.polinema.relasiclass.Tugas1;

public class Perlengkapan {
    private String namaItem;
    private String tipe;
    private int jumlahStok;

    public Perlengkapan(String namaItem, String tipe, int jumlahStok) {
        this.namaItem = namaItem;
        this.tipe = tipe;
        this.jumlahStok = jumlahStok;
    }

    public String getNamaItem() {
        return namaItem;
    }

    public String getTipe() {
        return tipe;
    }

    public int getJumlahStok() {
        return jumlahStok;
    }

    public String info() {
        String info = "\n";
        info += "Nama Item: " + namaItem + "\n";
        info += "Tipe Item: " + tipe + "\n";
        info += "Stok:  " + jumlahStok + "\n";
        return info;
    }
}