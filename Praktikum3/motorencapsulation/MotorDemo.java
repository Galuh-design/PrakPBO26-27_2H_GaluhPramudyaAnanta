package Praktikum3.motorencapsulation;

public class MotorDemo {

    public static void main(String[] args) {
        Motor motor = new Motor();
        motor.printStatus();
        motor.tambahKecepatan();

        motor.nyalakanMesin();
        motor.printStatus();

        motor.tambahKecepatan();
        motor.printStatus();

        motor.tambahKecepatan();
        motor.printStatus();

        motor.tambahKecepatan();
        motor.tambahKecepatan();
        motor.tambahKecepatan();
        motor.tambahKecepatan();// untuk tes kondisi max
        motor.printStatus();

        motor.matikanMesin();
        motor.printStatus();

        // motor.kecepatan = 50;
        // motor.printStatus();

    }
}