package enemies;

import Mortal.Mortal;
import heroes.Hero;

public abstract class Enemy implements Mortal {
    protected int health;
    protected String name;


    public Enemy(String name,int health) {
        this.name=name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) health = 0;
        System.out.println(this.getName() + " получил " + damage + " урона. Осталось здоровья: " + health);
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public abstract void attackHero(Hero hero);
}