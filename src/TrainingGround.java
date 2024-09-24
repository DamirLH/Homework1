import enemies.Enemy;
import enemies.Goblin;
import heroes.Archer;
import heroes.Hero;
import heroes.Mage;
import heroes.Warrior;

public class TrainingGround {
    public static void main(String[] args) {
        Hero warrior = new Warrior("Конан", 100);
        Hero mage = new Mage("Дамблдор", 80);
        Hero archer = new Archer("Робин-Гуд", 90);

        Enemy enemy = new Goblin("Гоблин Тодд",50);

        warrior.attackEnemy(enemy);
        mage.attackEnemy(enemy);
        archer.attackEnemy(enemy);

        warrior.useSpecialAbility(enemy);
        mage.useSpecialAbility(enemy);
        archer.useSpecialAbility(enemy);
    }
}