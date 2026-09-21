package Praktikum4.id.ac.polinema.relasiclass.Tugas1;

public class MainDepotTugasGaluh {
    public static void main(String[] args) {
        //membuat objek Report di main
        Report outerHaven_Documentation = new Report("Documentation.pdf"); //membuat laporan dengan nama documentation.pdf
        SupplyDepot outerHaven = new SupplyDepot("A7", "LALILULELO", 10);//membuat objek SupplyDepot dengan instansiasi outerHaven
        outerHaven.setBukaGerbang("ADAMSKA");//test salah masukkan kode
        outerHaven.setBukaGerbang("ADAMSKAA7");//test masukkan kode yang benar
        //membuat objek Perlengkapan, disini objek perlengkapan merupakan aggregation karena bila objek outerhaven dihapus, referensi masih disimpan objek Perlengkapan di main
        Perlengkapan METALGEAR = new Perlengkapan("METAL GEAR RAY", "Metal Gear", 3);//instansiasi objek perlengkapan METAL GEAR
        Perlengkapan SOCOM = new Perlengkapan("SOCOM WU", "Tranquilizer", 10);//instansiasi objek perlengkapan SOCOM
        System.out.println(outerHaven.masukkanPerlengkapan(METALGEAR));//memasukkan ke method masukkanPerlengkapan, 
        System.out.println(outerHaven.masukkanPerlengkapan(SOCOM));//memasukkan ke method masukkanPerlengkapan
        System.out.println(outerHaven.info(outerHaven_Documentation));//panggil method dan pastikan output tidak silent, automatis rekap laporan
        outerHaven.setTutupGerbang();//menutup gerbang depot
        Perlengkapan cal45 = new Perlengkapan(".45Calliber", "Handgun", 2);
        System.out.println(outerHaven.masukkanPerlengkapan(cal45)); // saya menggunakan sout untuk memanggil method agar
                                                                    // bisa mode silent atau print saat method dipanggil
                                                                    // :3

        System.out.println(outerHaven.keluarkanPerlengkapan("SOCOM"));//mencoba mengeluarkan item padahal gerbang masih ditutup
        outerHaven.setBukaGerbang("ADAMSKAA7");//membuka gerbang
        System.out.println(outerHaven.keluarkanPerlengkapan("SOCOM"));//mengeluarkan item tapi namanya salah
        System.out.println(outerHaven.keluarkanPerlengkapan("SOCOM WU"));//mengeluarkan item dengan nama yang benar
        outerHaven.setTutupGerbang();//menutup gerbang

        outerHaven.info(outerHaven_Documentation);//rekap silent
        //test output rekap dari report.
        System.out.println("=================================================");
        System.out.println("                      REPORT                   ");
        System.out.println("=================================================");
        System.out.println(outerHaven_Documentation.getNamaLaporan() + "{");
        System.out.println(outerHaven_Documentation.getReport());
        System.out.println(outerHaven_Documentation.getNamaLaporan() + "}");
    }
    //saya fans berat metal gear solid <3

}