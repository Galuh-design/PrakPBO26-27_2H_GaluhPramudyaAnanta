package Praktikum2;

public class tugasNo3_Lingkaran {
    public Double phi = 3.14, r;

    public tugasNo3_Lingkaran(Double r){
        this.r = r;
    }

    public Double hitungLuas() {
        Double luas = phi * (r*r);
        return luas;
    }

    public Double hitungKeliling() {
        Double keliling = 2 * phi *r;
        return keliling;
    }
    public static void main(String[] args) {
        tugasNo3_Lingkaran lingkaran1 = new tugasNo3_Lingkaran(5.0);
        System.out.println("Luas Lingkaran      =   "+lingkaran1.hitungLuas());
        System.out.println("Keliling Lingkaran  =   "+lingkaran1.hitungKeliling());
    }

}