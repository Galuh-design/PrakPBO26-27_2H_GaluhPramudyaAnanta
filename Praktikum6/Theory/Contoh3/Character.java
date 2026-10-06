package Praktikum6.Theory.Contoh3;

public class Character {
    protected String Name;
    protected int Level;
    protected int Health;

    public void attack(Character target) {
        target.Health -= 10;
    }

    public void showStatus() {
        System.out.println("Name: " + Name + ", Health: " + Health);
    }

}
