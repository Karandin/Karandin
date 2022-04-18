package day11.task2;

public class Task2 {
    public static void main(String[] args) {

        Paladin pal = new Paladin();
        Magician mag = new Magician();
        Warrior war = new Warrior();
        Shaman sham = new Shaman();

        war.physicalAttack(pal);
        System.out.println(pal.health);

        pal.physicalAttack(mag);
        System.out.println(mag.health);

        sham.healTeammate(mag);
        System.out.println(mag.health);

        mag.magicalAttack(pal);
        System.out.println(pal.health);

        sham.physicalAttack(war);
        System.out.println(war.health);

        pal.healHimself();
        System.out.println(pal.health);

        for (int i = 0; i < 5; i++) {
            war.physicalAttack(mag);
            System.out.println(mag.health);
        }
    }
}
