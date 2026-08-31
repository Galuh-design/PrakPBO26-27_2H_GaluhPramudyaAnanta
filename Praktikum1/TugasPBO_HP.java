public class TugasPBO_HP extends TugasPBO_Computer {
    String brandPaketData;
    Double jumlahPaketData;
    int tipePaketData;
    Boolean senter = false;

    public TugasPBO_HP(String brand, String operatingySystem, int RAM, double Battery, String brandPaketData,//konstruktor
            Double jumlahPaketData, int tipePaketData) {

        super(brand, operatingySystem, RAM, Battery);
        this.brandPaketData = brandPaketData;
        this.jumlahPaketData = jumlahPaketData;
        if (tipePaketData > 5 || tipePaketData < 3) {
            System.out.println("Invalid, tipePaket tidak sedia");
            this.jumlahPaketData = 0.0;
            this.tipePaketData = 0;
        } else {
            this.tipePaketData = tipePaketData;
        }
    }

    public void stateSenter(boolean state) {// method1 status senter
        if (state == true) {
            senter = state;
        } else {
            senter = false;
        }
    }

    public void installAPK(String name, double size_MB) {//method2 install apk
        System.out.println("Install APK ----------------");
        jumlahPaketData *= 1000;
        double Mbps; // Megabits per second
        if (tipePaketData == 3) {
            Mbps = 5;
        } else if (tipePaketData == 4) { // 3G 4G or 5G internet type
            Mbps = 30;
        } else if (tipePaketData == 5) {
            Mbps = 70;
        } else {
            Mbps = 0;

        }

        double MByteps = Mbps / 8; // MegaByte per second
        int detik = 0;
        int menit = 0;
        int jam = 0;
        String status = "wait the minute :3";
        for (double i = 0; i < size_MB; i += MByteps) {
            if (jumlahPaketData <= 0 && i < size_MB) {
                status = "Download Failed, no internet Connection";
                break;
            } else {
                status = "Download Complete";
            }

            jumlahPaketData -= MByteps;
            detik++;

            if (detik == 60) {
                menit++;
                detik = 0;
            }

            if (menit == 60) {
                jam++;
                menit = 0;
            }

        }
        jumlahPaketData /= 1000;
        System.out.println("Sisa Paket Data     =   " + jumlahPaketData + "GB");
        System.out.println("File                =   " + name);
        System.out.println("File Size           =   " + (size_MB / 1000) + "GB");
        System.out.println("Status Download     =   " + status);
        System.out.println("Download Time       =   " + jam + "h " + menit + "m " + detik + "s");
    }

    @Override
    public void printInfo() {//method3 printinfo
        super.printInfo();
        System.out.println("Flashlight          =   " + senter);
        System.out.println("brand Paket Data    =   " + brandPaketData);
        System.out.println("Tipe Paket Data     =   " + tipePaketData + "G");
        System.out.println("Paket Data          =   " + jumlahPaketData + "GB");
    }

}
