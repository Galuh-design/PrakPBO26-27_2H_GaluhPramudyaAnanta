package Praktikum3.tugas;

import java.util.Scanner;

public class TestLogistik {
    public static void main(String[] args) {
        Kontainer kontainerAlfa = new Kontainer("REQ-9988", "PT. Maju Bersama", 5000);
        Scanner galuhAdamska = new Scanner(System.in);
        System.out.println("Nama Pemilik Kontainer: " + kontainerAlfa.getNamaPemilik());
        System.out.println("Kapasitas Maksimal: " + kontainerAlfa.getKapasitasMaksimal() + " kg");

        // System.out.println("\nMemasukkan muatan baru seberat 6.000 kg...");
        // kontainerAlfa.tambahMuatan(6000);
        // System.out.println("Berat muatan saat ini: " +
        // kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        // System.out.println("\nMemasukkan muatan baru seberat 4.000 kg...");
        // kontainerAlfa.tambahMuatan(4000);
        // System.out.println("Berat muatan saat ini: " +
        // kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        // System.out.println("\nMembongkar muat/menurunkan barang seberat 500 kg...");
        // kontainerAlfa.turunkanMuatan(500);
        // System.out.println("Berat muatan saat ini: " +
        // kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        // System.out.println("\nMembongkar muat/menurunkan barang seberat 2.000
        // kg...");
        // kontainerAlfa.turunkanMuatan(2000);//mengubah ke 2000 untuk test modifikasi
        // System.out.println("Berat muatan saat ini: " +
        // kontainerAlfa.getBeratMuatanSaatIni() + " kg");
        String dummy;
        int choose;
        do {
            System.out.println("1. Tambah muatan kontainer.");
            System.out.println("2. Turun muatan kontainer.");
            System.out.println("0. Keluar");
            System.out.println();

            System.out.print("Masukkan opsi   : ");
            dummy = galuhAdamska.nextLine();
            choose = Integer.parseInt(dummy);

            if (choose == 0) {
                break;
            }

            if (choose == 1) {
                System.out.print("\nMemasukkan muatan baru...   ");
                dummy = galuhAdamska.nextLine();
                choose = Integer.parseInt(dummy);
                kontainerAlfa.tambahMuatan(choose);
                System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");
            }

             if (choose == 2) {
                System.out.print("\n Keluarkan muatan...   ");
                dummy = galuhAdamska.nextLine();
                choose = Integer.parseInt(dummy);
                kontainerAlfa.turunkanMuatan(500);
                System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");
            }

        } while (true);
        galuhAdamska.close();
        System.out.println("Berhasil Keluar dari sistem");
    }

}