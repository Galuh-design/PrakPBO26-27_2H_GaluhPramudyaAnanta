package Praktikum4.id.ac.polinema.relasiclass.Tugas1;

public class SupplyDepot {
    private String idDepot;// atribut private String
    private String namaDepot;// atribut private String
    private CodeKeamananGerbang codeKeamananGerbang;// atribut private objek dari class CodeKeamananGerbang
    private Perlengkapan depotSize[];// size storage depotSize untuk menyimpan perlengkapan, menggunakan objek
                                     // Perlengkapan agar mudah untuk memasukkan data ke array of object

    public SupplyDepot(String idDepot, String namaDepot, int size) {// konstruktor berparameter
        this.idDepot = idDepot;
        this.namaDepot = namaDepot;
        this.depotSize = new Perlengkapan[size];
        this.codeKeamananGerbang = new CodeKeamananGerbang("ADAMSKA" + idDepot);
        // objek codekeamananGerbang dan depotSize adalah composition karena diciptakan
        // di dalam class sehingga saat
        // objek supplyDepot dihapus / diset null maka objek berikut akan ikut terhapus.
    }

    public String masukkanPerlengkapan(Perlengkapan perlengkapan) { // objek perlengkapan yang ini adalag aggregation
                                                                    // karena di instansiasi di class main sehingga
                                                                    // tidak hilang saat objek supply dihapus
        int check = 0;
        if (codeKeamananGerbang.getStatus()) {// mengecek dengan getstatus bila gerbang terbuka atau sedang tertutup
                                              // sebelum dimasukkan barrang

            for (int i = 0; i < depotSize.length; i++) {// method masukkanPerlengkapan untuk masukkan perlengkapan ke
                                                        // storage depot
                if (depotSize[i] == null) {
                    depotSize[i] = perlengkapan;
                    check++;
                    break;
                }
            }

            if (check == 0) {
                return "Depot Penuh!";
            } else {
                return "" + perlengkapan.getNamaItem() + " Berhasil dimasukkan";
            }
        } else {
            return "Gerbang tertutup!!!, tidak dapat memasukkan " + perlengkapan.getNamaItem();
        }
    }

    public String keluarkanPerlengkapan(String kataKunci) {// method mengeluarkan perlengkapan berdasarkan kata kunci
        String nama = "";
        int check = 0;
        if (codeKeamananGerbang.getStatus()) {
            for (int i = 0; i < depotSize.length; i++) {
                if (depotSize[i] != null && kataKunci.equals(depotSize[i].getNamaItem())) { // kondisi cek kata kunci
                    nama = depotSize[i].getNamaItem();
                    depotSize[i] = null;
                    check++;
                    break;
                }
            }
            if (check != 0) {
                return "Item " + nama + " berhasil dikeluarkan!";
            } else {
                return "Item " + nama + "tidak ditemukan";
            }
        } else {
            return "Gerbang tertutup!!!, tidak dapat mencari " + kataKunci;
        }
    }

    public String getNamaDepot() {// method get namadepot
        return namaDepot;
    }

    public String getIdDepot() {// method getiddepot
        return idDepot;
    }

    public void setBukaGerbang(String kode) {//method buat buka gerbang
        if (codeKeamananGerbang.setStatusOn(kode)) {
            System.out.println("Berhasil membuka gerbang " + this.idDepot);
        } else {
            System.out.println("Gagal membuka gerbang " + this.idDepot + ", Coba Lagi");
        }
    }

    public void setTutupGerbang() {// method untuk tutup gerbang
        codeKeamananGerbang.setStatusOff();
        System.out.println("Menutup Gerbang " + this.idDepot + "...");
    }

    public String info(Report report) {// disini class report adalah Depedency dikarenakan lass supplydepot sama sekali
                                       // tidak menyimpan atribut objek report, melainkan hanya meminjamnya dan juga
                                       // untuk memasukkan data ke objek tersebut.
        String info = "\n";
        info += "id Depot:          " + idDepot + "\n";
        info += "Nama Depot:        " + namaDepot + "\n";
        info += "Kapasitas Depot:   " + depotSize.length + "\n";
        info += "Daftar Barang yang tersedia di Depot: " + "\n";

        for (int i = 0; i < depotSize.length; i++) { // print semua isi depotsize jika tidak null
            if (depotSize[i] != null) {
                info += depotSize[i].info() + "\n";// panggil method info dari class Perlengkapan lewat objeknya
            }
        }

        info += "Info Gerbang:" + codeKeamananGerbang.info();// panggil method info dari class codekeamanan lewat
                                                             // objeknya
        report.setReport(info);// guna rekap automatis saat method info class supplydepot dipanggil
        return info;
    }
}