package Praktikum2;

public class tugasNo4_Barang {
    String kode, namaBarang;
    int hargaDasar;
    float diskon;

    public int hitungHargaJual() {
        diskon /= 100;
        int hargaJual = (int) (hargaDasar - (diskon * hargaDasar));
        return hargaJual;
    }

    public void tampilData() {
        System.out.println("Kode            :   " + kode);
        System.out.println("Nama Barang     :   " + namaBarang);
        System.out.println("Harga Barang    :   "+hargaDasar);
        System.out.println("Diskon          :   " + diskon+"%");
        System.out.println("Total           :   "+hitungHargaJual());
    }

    public static void main(String[] args) {
        tugasNo4_Barang brg1 = new tugasNo4_Barang();
        brg1.kode = "1001";
        brg1.namaBarang = "Batu kasar";
        brg1.hargaDasar = 10000;
        brg1.diskon = 20f;
        brg1.tampilData();
    }
}
