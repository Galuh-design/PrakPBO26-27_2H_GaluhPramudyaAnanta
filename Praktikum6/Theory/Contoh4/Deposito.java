package Praktikum6.Theory.Contoh4;

public class Deposito extends Rekening {
    private double BungaPerBulan;
    private int Tenor;
    
    public Deposito(int saldoAwal, int MasaTenor) {
        Saldo = saldoAwal;
        Tenor = MasaTenor;
        BungaPerBulan = 0.05;
    }

    public double getNilaiBunga()
    {
        double nilaiBunga;
        nilaiBunga = Saldo * BungaPerBulan * Tenor / 12;
        return nilaiBunga;
    }

}
