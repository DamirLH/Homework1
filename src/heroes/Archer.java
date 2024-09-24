package heroes;

import enemies.Enemy;

public class Archer extends Hero {
    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " выстрелил из лука и нанёс 12 урона!");
        enemy.takeDamage(12);
    }

    @Override
    public void useSpecialAbility(Enemy enemy) {
        System.out.println(getName() + " выстрелил из лука и попал врагу в колено. Было нанесено 25 урона!!!");
        enemy.takeDamage(25);
    }
}