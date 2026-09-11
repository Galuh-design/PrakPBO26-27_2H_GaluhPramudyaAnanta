package Praktikum3.tugas;

public class Kontainer {
    // Atribut yang di private
    private String nomorResi;
    private String namaPemilik;
    private float kapasitasMaksimal;
    private float beratMuatanSaatIni;

    // Konstruktor berparameter
    public Kontainer(String nomorResi, String namaPemilik, float kapasitasMaksimal) {
        this.nomorResi = nomorResi;
        this.namaPemilik = namaPemilik;
        this.kapasitasMaksimal = kapasitasMaksimal;
        this.beratMuatanSaatIni = 0;
    }

    // method GETTER
    public String getNomorResi() {
        return nomorResi;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public float getKapasitasMaksimal() {
        return kapasitasMaksimal;
    }

    public float getBeratMuatanSaatIni() {
        return beratMuatanSaatIni;
    }
    // Method Setter

    public void tambahMuatan(float muat) {
        if (muat < kapasitasMaksimal && beratMuatanSaatIni < kapasitasMaksimal
                && (beratMuatanSaatIni += muat) < kapasitasMaksimal) {
            // check list, bila muat kurang dari max, beratMuatanSaatini kurang dari max,
            // dan hasil penjumlahan muatan+muat kurang dari max
            beratMuatanSaatIni -= muat;// membersihkan pengurangan di kondisi
            beratMuatanSaatIni += muat;
        } else {
            System.out.println("Maaf, berat muatan melebihi kapasitas maksimal kontainer.");
        }
    }

    public void turunkanMuatan(float muat) {
        float percent50 = beratMuatanSaatIni * 0.5f;
        if ((beratMuatanSaatIni -= muat) > 0) {
            beratMuatanSaatIni += muat; // membersihkan pengurangan di kondisi
            if (muat <= percent50) {
                beratMuatanSaatIni -= muat;
            } else {
                System.out.println(
                        "Maaf, demi keselamatan, pembongkaran muatan satu kali jalan tidak boleh melebihi 50% dari muatan saat ini!");
            }
        } else {
            System.out.println("Maaf, bongkar muatan melebihi stok kapasitas kontainer.");
        }
    }

}