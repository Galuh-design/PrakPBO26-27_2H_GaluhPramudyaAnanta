package Praktikum4.id.ac.polinema.relasiclass.percobaan6;

public class Laptop {
    private String merk;
    //pertanyaan4
    private Printer printerDefault;

    public Laptop(String merk) {
        this.merk = merk;
    }
    public Laptop(String merk, Printer printerDefault){
        this.merk = merk;
        this.printerDefault = printerDefault;
    }
    //mengubah method jadi tanpa parameter printer
    public void cetakDokumen(String namaFile) {
        System.out.println(merk + " mengirim dokumen ke printer...");
        printerDefault.cetak(namaFile);
    }
}