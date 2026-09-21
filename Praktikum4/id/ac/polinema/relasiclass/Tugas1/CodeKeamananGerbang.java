package Praktikum4.id.ac.polinema.relasiclass.Tugas1;

public class CodeKeamananGerbang {
    private String KunciKeamanan;
    private boolean status = false;

    public CodeKeamananGerbang(String KunciKeamanan) {
        this.KunciKeamanan = KunciKeamanan;
    }

    public boolean setStatusOn(String code) {
        if (code.equals(KunciKeamanan)) {
            return status = true;
        } else {
            return status = false;
        }
    }

    public void setStatusOff() {
        status = false;
    }

    public boolean getStatus() {
        return status;
    }

    public String info() {
        String info = "\n";
        info += "Kunci kode:    " + KunciKeamanan + "\n";
        info += "Status Gerbang:    " + getStatus() + "\n";
        return info;
    }


}