package Praktikum5.Kuis1;

public class Generator {// class Generator
    private int Daya;// atribut Daya
    private int Voltase;// atribut Voltase

    public Generator(int dy, int volt) {// konstruktor objek Generator
        this.Daya = dy;
        this.Voltase = volt;
    }

    public int getDaya() {// getter untuk atribut Daya
        return Daya;
    }

    public int getVoltase() { // Getter untuk atribut voltase
        return Voltase;
    }

    public void setDaya(int daya) {// setter untuk atribut daya
        Daya = daya;
    }

    public void setVoltase(int voltase) {// setter untuk atribut voltase
        Voltase = voltase;
    }

}