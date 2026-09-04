package Praktikum2;

public class tugasNo2_dataMember {
    private String id, namaMember, namaGame;
    private int lamaSewaJam;
    private Double hargaGame;


    public tugasNo2_dataMember(String id, String namaMember, String namaGame , Double hargaGame , int lamaSewaJam) {
        this.id = id;
        this.namaMember = namaMember;
        this.namaGame = namaGame;
        this.hargaGame = hargaGame;
        this.lamaSewaJam = lamaSewaJam;
    }
    public Double hitungtotalHarga(){
        Double total = hargaGame * lamaSewaJam;
        return total;
    }

    public void tampilData() {
        System.out.println("Id          :   "+id);
        System.out.println("Nama        :   "+namaMember);
        System.out.println("Nama Game   :   "+namaGame);
        System.out.println("Harga Sewa  :   "+hargaGame);
        System.out.println("Lama sewa   :   "+lamaSewaJam +" jam");
        System.out.println("Total Harga :   "+hitungtotalHarga());
        
    }
}