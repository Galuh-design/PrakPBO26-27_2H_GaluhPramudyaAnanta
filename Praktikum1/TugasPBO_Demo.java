public class TugasPBO_Demo {

    public static void main(String[] args) {

        System.out.println("==== Class Computer Test ====");
        TugasPBO_Computer compute = new TugasPBO_Computer("Unknown", "Ubuntu", 8, 80);
        compute.booting("on");
        compute.ngecesBattery(1);
        compute.printInfo();

        System.out.println("==== Object 1:   Laptop ====");
        TugasPBO_Laptop laptop = new TugasPBO_Laptop("Dell", "Window 10", 10, 60.5, "Geforce 930MX", 2, 2);
        laptop.booting("On"); // status sebelumnya Off
        laptop.ngecesBattery(10); // Baterai sebelumnya 60.5
        laptop.showavailableEXE();
        laptop.printInfo();
        laptop.runExecutable("MGSV");

        System.out.println("==== Object 2:   Handphone ====");
        TugasPBO_HP handPhone = new TugasPBO_HP("Oppo A60", "ColorOS", 8, 70, "Telkomsel", 2.5, 4);
        handPhone.booting("on");// status sebelumnya Off
        handPhone.ngecesBattery(3);// baterai sebelumnya 70
        handPhone.stateSenter(true);
        handPhone.printInfo();
        handPhone.installAPK("Subway Surf_Mod.APK", 1200);

        System.out.println("==== Object 3:   Mouse ====");
        TugasPBO_mouse mouse = new TugasPBO_mouse("Inphic", "Wired");
        mouse.tancaplepasUSB(true);// status sebelumnya off
        mouse.changeMouseSensivitySpeed(11);//default sensivity 5
        mouse.printInfo();

        System.out.println("==== Object 4:   Backpack ====");
        TugasPBO_backPack adminBag = new TugasPBO_backPack();
        TugasPBO_backPack item1 = new TugasPBO_backPack("Laptop", 3.5);
        TugasPBO_backPack item2 = new TugasPBO_backPack("Metal Gear", 50);
        adminBag.inputItem(item1);//input laptop
        adminBag.inputItem(item2);//input MEtal Gear
        System.out.println("----- Input Barang -----");
        adminBag.printInfo();
        adminBag.itemOut();//mengeluarkan barang terakhir ynag di input
        System.out.println("----- Remove Barang -----");
        adminBag.printInfo();
    }
}
