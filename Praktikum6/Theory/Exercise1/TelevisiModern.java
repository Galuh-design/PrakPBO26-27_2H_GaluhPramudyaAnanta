package Praktikum6.Theory.Exercise1;

public class TelevisiModern extends Televisi {
    private String displayMode;
    private String dvd;

    public TelevisiModern(String mrk, int channelCount) {
        merek = mrk;
        jumlahChannel = channelCount;
        dvd = "kosong";
    }

    public void gantiModusTampilan(String mode) {
        this.displayMode = mode;
    }

    public void mainkanDVD() {
        System.out.println("Sedang memainkan DVD: " + dvd);
    }
    public void masukkanDVD(String dvdTitle) {
        this.dvd = dvdTitle;
    }
}
