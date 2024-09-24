import enemies.Enemy;
import enemies.Goblin;
import enemies.Zombie;
import heroes.Hero;
import heroes.Warrior;

public class BattleGround {
    public static void main(String[] args) {
        Hero hero = new Warrior("Рокки", 100);
        Enemy[] enemies = {new Zombie("Зомби Шон",80), new Goblin("Гоблин Тодд",60), new Zombie("Зомби Влад",70)};

        int round = 1;
        while (hero.isAlive() && areEnemiesAlive(enemies)) {
            System.out.println("\n--- Раунд " + round + " ---");

            // Hero's turn
            for (Enemy enemy : enemies) {
                if (enemy.isAlive()) {
                    hero.attackEnemy(enemy);
                    if (Math.random() < 0.3) { // 30% chance to use special ability
                        hero.useSpecialAbility(enemy);
                    }
                    if (!enemy.isAlive()) {
                        System.out.println(enemy.getName() + " был побеждён!");
                    }
                }
                System.out.println();
            }
            System.out.println("--------------------------------");

            // Enemies' turn
            for (Enemy enemy : enemies) {
                if (enemy.isAlive()) {
                    enemy.attackHero(hero);
                    System.out.println();
                }
            }

            round++;
        }

        if (hero.isAlive()) {
            System.out.println("\nГерой " + hero.getName() + " победил!");
        } else {
            System.out.println("\nГерой " + hero.getName() + " потерпел поражение.");
        }
    }

    private static boolean areEnemiesAlive(Enemy[] enemies) {
        for (Enemy enemy : enemies) {
            if (enemy.isAlive()) {
                return true;
            }
        }
        return false;
    }
}