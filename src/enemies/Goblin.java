package enemies;

import heroes.Hero;

public class Goblin extends Enemy {
    public Goblin(String name, int health) {
        super(name,health);
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println("Гоблин вонзил свой кинжал в героя. Нанесено 8 урона!");
        hero.takeDamage(8);
    }
}