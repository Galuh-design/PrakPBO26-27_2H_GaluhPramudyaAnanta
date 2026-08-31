public class TugasPBO_Laptop extends TugasPBO_Computer {
    // inheritance object leptop
    String vgaGPU;
    int coreCPU;
    String executeable;
    int vram; // GB untuk kalkulasi gem

    public TugasPBO_Laptop(String brand, String operatingySystem, int RAM, double Battery, String vgaGPU, int vram,
            int coreCPU) {
        super(brand, operatingySystem, RAM, Battery);
        this.vgaGPU = vgaGPU;
        this.vram = vram;
        this.coreCPU = coreCPU;
    }

    public void showavailableEXE() { //file tersedia method1
        System.out.println("---Available Game---");
        System.out.println("MGSV , Sonic , LoP ");
        System.out.println("--------------------");
    }

    public void runExecutable(String name) {//running exe method2
        executeable = name;
         System.out.println("....................");
        System.out.println("Running " + executeable + ".exe");
        System.out.println("....................");
        runGames();// karena hanya ada game jadi tidak pemilihan
    }

    public void runGames() {//run games method2 games session pemilihan game requirement
        int gamerequirement = 0;
        if (executeable.equalsIgnoreCase("Sonic")) {
            gamerequirement = 10;
            executeable = "Sonic Mania.exe";
        } else if (executeable.equalsIgnoreCase("MGSV")) {
            gamerequirement = 30;
            executeable = "Metal Gear Solid V: The Phantom Pain";
        } else if (executeable.equalsIgnoreCase("LoP")) {
            gamerequirement = 50;
            executeable = "Lies of P";
        }
        int spec = (vram * 20) * coreCPU; // kalkulasi halu benchmark game with current hardware
        int FPS = spec - gamerequirement;
       
        System.out.println("Games   =   " + executeable);
        System.out.println("FPS     =   " + FPS);
        System.out.println("....................");
    }

    @Override
    public void printInfo() {//method3 print
        super.printInfo();
        System.out.println("GPU     =   " + vgaGPU);
        System.out.println("coreCPU =   " + coreCPU);
        System.out.println("Vram    =   " + vram + " GB");
    }
}
