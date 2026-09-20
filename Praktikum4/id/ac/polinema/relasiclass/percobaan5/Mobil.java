package Praktikum4.id.ac.polinema.relasiclass.percobaan5;

public class Mobil {
    private String merek;
    //private  Mesin mesin;
    Mesin mesin;

    public Mobil(String merek) {
        this.merek = merek;
        this.mesin = new Mesin();
    }
    //modif pertanyaan 5
    public Mobil(String merek, Mesin mesin){
        this.merek = merek;
        this.mesin = mesin;
    }

    public void tampilkanInfo() {
        System.out.println("Mobil:  " + merek);
        System.out.println("Mesin:  " + mesin.getTipe());
    }

}