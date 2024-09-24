package heroes;

import enemies.Enemy;

public class Warrior extends Hero {
    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " ударил мечом и нанёс 15 урона!");
        enemy.takeDamage(15);
    }

    @Override
    public void useSpecialAbility(Enemy enemy) {
        System.out.println(getName() + " провёл критическую атаку и нанёс 25 урона!!!");
        enemy.takeDamage(25);
    }
}