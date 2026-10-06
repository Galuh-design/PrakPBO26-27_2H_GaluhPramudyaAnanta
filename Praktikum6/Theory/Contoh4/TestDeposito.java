package Praktikum6.Theory.Contoh4;

public class TestDeposito {
    public static void main(String[] args) {
        Deposito dpt = new Deposito(1200000, 4);
        System.out.println("Saldo Awal: " + dpt.getSaldo());
        System.out.println("Nilai Bunga Deposito: " + dpt.getNilaiBunga());
        System.out.println("Total Deposito: " + (dpt.getSaldo() + dpt.getNilaiBunga()));
    }
}   