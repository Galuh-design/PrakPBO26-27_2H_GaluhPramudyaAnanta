public class TugasPBO_mouse {
    private String brand;
    private String tipeWireMouse;
    private boolean usbConnect = false;
    private int cursorSpeed = 5; // 1 minimum 5 default 10 max

    public TugasPBO_mouse(String brand, String tipeWireMouse) {
        this.brand = brand;
        this.tipeWireMouse = tipeWireMouse;
    }

    public void tancaplepasUSB(boolean USB) {//method1 tancep USB
        usbConnect = USB;
        if (USB) {
            System.out.println("USB Connected");
        } else {
            System.out.println("USB Disconnected");
        }
    }

    public void changeMouseSensivitySpeed(int sensivity) {//method2 change speed
        if (sensivity < 1 || sensivity > 10) {
            System.out.println("Mouse Sensivity Out of Bound");
        } else {
            cursorSpeed = sensivity;
        }
    }

    public void printInfo() {//print method3
        System.out.println("==== Mouse Info ====");
        System.out.println("Brand           =   " + brand);
        System.out.println("Wire Type       =   " + tipeWireMouse);
        System.out.println("USB Detect      =   " + usbConnect);
        System.out.println("Sensitivity     =   " + cursorSpeed);
    }
}
