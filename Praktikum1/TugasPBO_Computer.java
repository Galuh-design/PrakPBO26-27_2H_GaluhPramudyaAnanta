public class TugasPBO_Computer {
    // superclass untuk inheritance device laptop dan handphone
    private String brand; // atribut
    private String operatingySystem;
    private String status = "Off";
    private int RAM;
    double Battery;

    public TugasPBO_Computer(String brand, String operatingySystem, int RAM, double Battery) { // konstruktor
        this.brand = brand;
        this.operatingySystem = operatingySystem;
        this.RAM = RAM;
        this.Battery = Battery;
    }

    public void booting(String state) {
        // method1 boot
        if (state.equalsIgnoreCase("On")) {
            status = "On";
        } else  {
            status = "Off";
        }

    }

    public void ngecesBattery(int SessionperMinute) { //method2 cas computer
        if (Battery < 100) {
            for (int i = 0; i < SessionperMinute; i++) { //iteratif ces per menit
                Battery += 0.5;
            }

            if (Battery > 100) {
                Battery = 100;
            }
        }

    }

    public void printInfo() { //method3 print
        System.out.println("==== Computer Info ====");
        System.out.println("Brand   =   " + brand);
        System.out.println("OS      =   " + operatingySystem);
        System.out.println("RAM     =   " + RAM + " GB");
        System.out.println("Status  =   " + status);
        System.out.println("Battery =   " + Battery + "%");

    }

}
