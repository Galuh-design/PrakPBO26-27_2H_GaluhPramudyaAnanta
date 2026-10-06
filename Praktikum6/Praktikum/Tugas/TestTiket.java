package Praktikum6.Praktikum.Tugas;

public class TestTiket {
    public static void main(String[] args) {
        // Menggunakan constructor tanpa parameter untuk TiketKereta
        TiketKereta tk = new TiketKereta();
        tk.kodeTiket = "KA-001";
        tk.namaPenumpang = "Andi";
        tk.asal = "Malang";
        tk.tujuan = "Jakarta";
        tk.setHargaDasar(350000);
        tk.nomorGerbong = 3;
        tk.nomorKursi = "12A";

        // Menggunakan constructor berparameter untuk TiketDomestik
        TiketDomestik td = new TiketDomestik("GA-102", "Sinta", "Surabaya", "Denpasar", 900000, "Garuda Indonesia", 25, 75000);

        // Menggunakan constructor berparameter untuk TiketInternasional
        TiketInternasional ti = new TiketInternasional("SQ-201", "Budi", "Jakarta", "Singapura", 2500000, "Singapore Airlines", 20, "C1234567", 150000);

        // Menampilkan Output
        tk.tampilKereta();
        System.out.println();
        td.tampilDomestik();
        System.out.println();
        ti.tampilInternasional();
    }
}
