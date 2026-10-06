package Praktikum6.Theory.Contoh4;

public class Rekening {
    protected int Saldo;

    public int getSaldo() {
        return Saldo;
    }

    public void simpanUang(int jumlah) {
        Saldo = Saldo + jumlah;
    }

    public void ambilUang(int jumlah) {
        Saldo = Saldo - jumlah;
    }

}
