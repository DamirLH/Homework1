package heroes;

import enemies.Enemy;

public class Mage extends Hero {
    public Mage(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " призвал огненный шар и нанёс 20 урона!");
        enemy.takeDamage(20);
    }

    @Override
    public void useSpecialAbility(Enemy enemy) {
        System.out.println(getName() + " вызвал огненный шторм и нанёс 30 урона!!!");
        enemy.takeDamage(30);
    }
}