package Praktikum3.motorencapsulation;

public class Motor {
    private int kecepatan = 0;
    private boolean kontakOn = false;
    private int maxSpeed = 100;

    public void nyalakanMesin() {
        kontakOn = true;
    }

    public void matikanMesin() {
        kontakOn = false;
    }

    public void tambahKecepatan() {
        if (kontakOn == true) {
            if (kecepatan >= maxSpeed) {
                System.out.println("Kecepatan mencapai nilai max!");// kondisi agar kecepatan max 100
                kecepatan = 100;
            } else {
                kecepatan += 20; // mengubah increment kecepatan agar enak dites di demo
            }

        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
        }
    }

    public void kurangiKecepatan() {
        if (kontakOn == true) {
            kecepatan -= 5;
        } else {
            System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off! \n");
        }
    }

    public void printStatus() {
        if (kontakOn == true) {
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan + "\n");
    }
}