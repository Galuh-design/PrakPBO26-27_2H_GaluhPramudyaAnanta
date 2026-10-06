package Praktikum5.Kuis1;

public class SpaceShuttle {
    private String Kode;// atribut kode
    private int Berat;// berat tidak digunakan, atribut berat
    private Roket RoketUtama;// atribut objek dari class Roket
    private Generator GeneratorUtama;// atribut objek dari class Generator

    public SpaceShuttle(String kd, int brt, Roket rkt, Generator gnt) {// konstruktor dari class SpaceShuttle
        this.Kode = kd;
        this.Berat = brt;
        this.RoketUtama = rkt;
        this.GeneratorUtama = gnt;
    }

    public String getKode() {// getter untuk atribut kode
        return Kode;
    }

    public Roket getRoketUtama() {// getter untuk atribut objek Roket getRoketUtama
        return RoketUtama;
    }

    public Generator getGeneratorUtama() {// getter untuk objek Generator getGeneratorUtama
        return GeneratorUtama;
    }

    public int getBerat() {// getter berat
        return Berat;
    }
}