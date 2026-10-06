package Praktikum6.Theory.Contoh3;

public class Wizard extends Character {
    protected int Spell;

    public Wizard(String name, int level, int health, int spell) {
        Name = name;
        Level = level;
        Health = health;
        Spell = spell;
    }
    public void magic(Character target){
        target.Health -= 50;
        Spell -= 1;
    }
}
