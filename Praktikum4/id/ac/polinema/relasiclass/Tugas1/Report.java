package Praktikum4.id.ac.polinema.relasiclass.Tugas1;

public class Report {
    private String namaLaporan;
    private String report;

    public Report(String namaLaporan) {//konstruktor untuk buat objek report
        this.namaLaporan = namaLaporan;
    }

    public String getNamaLaporan() {
        return namaLaporan;
    }

    public String getReport() {//digunakan untuk mengembalikan nilai String dari report yang mana berisi info dari class supplydepot
        return report;
    }

    public void setReport(String report) {//setter untuk String report untuk rekap
        this.report = report;
    }

}