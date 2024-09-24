package heroes;

import enemies.Enemy;
import Mortal.Mortal;

public abstract class Hero implements Mortal {
    private String name;
    private int health;

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) health = 0;
        System.out.println(name + " получил " + damage + " урона. Осталось здоровья: " + health);
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public abstract void attackEnemy(Enemy enemy);
    public abstract void useSpecialAbility(Enemy enemy);
}