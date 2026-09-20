package Praktikum4.id.ac.polinema.relasiclass.percobaan4;

public class MainPercobaan4 {
    public static void main(String[] args) {
        Penumpang p = new Penumpang("12345", "Mr. Krab");
        Gerbong gerbong = new Gerbong("A", 10);
        gerbong.setPenumpang(p, 1);
        //modif pertanyaan 4
        Penumpang p1 = new Penumpang("23423", "Budi");
        gerbong.setPenumpang(p1, 1);
        System.out.println(gerbong.info());
    }
}