package Praktikum5.Kuis1;

//fungsi main
//06_Galuh Pramudya Ananta
//TI_2H
public class MainRoket {
    public static void main(String[] args) {
        Roket rkt = new Roket("Jet", 9000);
        Generator gnt = new Generator(5000, 110);
        SpaceShuttle ss = new SpaceShuttle("Apollo99", 3500, rkt, gnt);

        System.out.println("Kode Shuttle:   " + ss.getKode());
        System.out.println("Tipe roket: " + ss.getRoketUtama().getTipe());
        System.out.println("Voltase generator:  " + ss.getGeneratorUtama().getVoltase());
    }

    // finished <3

}