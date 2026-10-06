package Praktikum5.Kuis1;

public class Roket {
    private String Tipe;// atribut tipe
    private int Power;// atribut power

    public Roket(String tipe, int pwr) {// constructor class roket
        this.Tipe = tipe;
        this.Power = pwr;
    }

    public String getTipe() {// getter atribut tipe
        return Tipe;
    }

    public void setTipe(String tipe) {// setter atribut tipe
        Tipe = tipe;
    }

    public int getPower() {// getter atribut power
        return Power;
    }

    public void setPower(int power) {// setter atribut power
        Power = power;
    }

}