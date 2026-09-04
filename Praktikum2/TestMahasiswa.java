package Praktikum2;

public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        Mahasiswa mhs3 = new Mahasiswa();
        
        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl. Vinolia No 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();
        
        mhs2.nim = 102;
        mhs2.nama = "Adamska";
        mhs2.alamat = "Jl. OuterHaven Gd";
        mhs2.kelas = "3A";
        mhs2.tampilBiodata();

        mhs3.nim = 103;
        mhs3.nama = "John Doe";
        mhs3.alamat = "Jl. ThePatriot 2";
        mhs3.kelas = "5C";
        mhs3.tampilBiodata();
    }
}
