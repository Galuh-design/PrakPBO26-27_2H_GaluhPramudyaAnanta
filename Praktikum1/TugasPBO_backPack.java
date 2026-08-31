public class TugasPBO_backPack {
    private String status, itemName;
    private double itemWeightKG, inventoryWeight = 0, weightLimit = 100, playerBaseSpeed = 100; // KG for
    private int size = 0, empty = 0, max = 30; // weight
    TugasPBO_backPack inventoryPack[] = new TugasPBO_backPack[max];

    public TugasPBO_backPack(){}//konstruktor Default

    public TugasPBO_backPack(String itemName, double itemWeightKG) {
        this.itemName = itemName;
        this.itemWeightKG = itemWeightKG;
        cekWeightSystem(inventoryWeight);
        
    }
    // input output barang menggunakan logika Stack
    public void inputItem(TugasPBO_backPack item) {//method1 input barang
        if (size == max) {
            System.out.println("item sudah penuh!");
        } else {
            System.out.println("item " + item.itemName + " masuk");
            inventoryPack[size] = item;
            inventoryWeight += item.itemWeightKG;
            cekWeightSystem(inventoryWeight);
            size++;
        }
    }
    public void itemOut(){//method2 keluar barang 
        if (size == empty) {
            System.out.println("Bag kosong!");
        } else {
            size--;
            System.out.println("item " + inventoryPack[size].itemName + " keluar");
            inventoryWeight -= inventoryPack[size].itemWeightKG;
            cekWeightSystem(inventoryWeight);
        }
    }

    public void cekWeightSystem(double weightState) {//update status weight
        if (weightState < (weightLimit * 0.3)) {
            status = "Lightweight";
            playerBaseSpeed = 100;
        } else if (weightState < (weightLimit * 0.5)) {
            status = "Mediumweight";
            playerBaseSpeed = 80;
        } else if (weightState < (weightLimit * 0.7)) {
            status = "Heavyweight";
            playerBaseSpeed = 50;
        } else {
            status = "Overburdened";
            playerBaseSpeed = 5;
        }
    }

    public void printInfo() {//method3 printInfo
        System.out.println("Inventory weight    =   "+inventoryWeight);
        System.out.println("Weight Limit        =   " + weightLimit + "KG");
        System.out.println("Player status       =   " + status);
        System.out.println("Player speed stats  =   " + playerBaseSpeed);
        System.out.println("item left in bag    =   ");
        for (int i = 0; i < size; i++) {
            System.out.print(inventoryPack[i].itemName+" ");
        }
        System.out.println();
    }
}
