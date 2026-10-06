package Praktikum6.Praktikum.Percobaan2;

public class ClassB extends ClassA {
    private int z;

    public void setz(int z) {
        this.z = z;
    }

    public void getnilaiZ() {
        System.out.println("nilai: Z: " + z);
    }

    public void getJumlah() {
        System.out.println("jumlah: " + (getX() + getY() + z));
    }
}
