package Praktikum4.id.ac.polinema.relasiclass.percobaan5;

public class MainPercobaan5 {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Avanza");
        Mesin mesin1 = new Mesin();
        Mobil mobil2 = new Mobil("Metal", mesin1);
        mobil2.tampilkanInfo();
        mobil2 = null;
        System.out.println("mesin objek hapus " + mesin1.getTipe());
        System.out.println(mobil2.mesin);
    }
}