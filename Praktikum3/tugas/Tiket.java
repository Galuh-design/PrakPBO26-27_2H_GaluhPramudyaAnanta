package Praktikum3.tugas;

public class Tiket {
    private String judulFilm;
    private double hargaDasar;
    private boolean statusPembayaran;

    public Tiket(String judulFilm, double hargaDasar) {
        this.judulFilm = judulFilm;
        if (hargaDasar < 0) {
            this.hargaDasar = 35000;
        } else {
            this.hargaDasar = hargaDasar;
        }
        this.statusPembayaran = false;
    }
    //GETTER

    public String getJudulFilm(){
        return judulFilm;
    }

    public double getHargaDasar(){
        return hargaDasar;
    }

    public boolean isStatusPembayaran(){
        return statusPembayaran;
    }

    public void lakukanPembayaran(){
        if (statusPembayaran) {
            System.out.println("Tiket sudah Dibayar");
        } else {
            statusPembayaran = true;
        }
    }


}