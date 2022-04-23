package day13;
public class Task1 {
    public static void main(String[] args) {
        User u1 = new User("Petya");
        User u2 = new User("Vasya");
        User u3 = new User("Katya");

        u1.sendMessage(u2, "Hi");
        u1.sendMessage(u2, "Karp");

        u2.sendMessage(u1,"a");
        u2.sendMessage(u1,"b");
        u2.sendMessage(u1,"c");

        u3.sendMessage(u1,"ololo");
        u3.sendMessage(u1,"ololo");
        u3.sendMessage(u1,"ololo");

        u1.sendMessage(u3, "Nu ti i kek");
        u1.sendMessage(u3, "Nu ti i kek");
        u1.sendMessage(u3, "Nu ti i kek");

        u3.sendMessage(u1, "6(piat`)");

        MessageDatabase.showDialog(u3, u1);

    }
}