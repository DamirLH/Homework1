package enemies;

import heroes.Hero;

public class Zombie extends Enemy {
    private boolean hasResurrected = false;

    public Zombie(String name, int health) {
        super(name,health);
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage);
        if (!isAlive() && !hasResurrected) {
            resurrect();
        }
    }

    private void resurrect() {
        health = 50;
        hasResurrected = true;
        System.out.println("Зомби восстал из мертвых. Снова!");
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println("Зомби ударил героя и нанёс 5 урона!");
        hero.takeDamage(5);
    }
}