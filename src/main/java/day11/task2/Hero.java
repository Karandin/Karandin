package day11.task2;

public abstract class Hero implements PhysAttack {
    int health = 100;
    int physAtt;
    double physicDef;
    double magicDef;

    @Override
    public void physicalAttack(Hero hero) {
        double attack = physAtt * (1 - hero.physicDef);
        if (hero.health - attack < 0) {
            hero.health = 0;
        } else {
            hero.health -= attack;
        }
    }


}
