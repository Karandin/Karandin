package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse w = new Warehouse();
        Picker pick = new Picker(w);
        Courier kaban = new Courier(w);

        businessProcess(kaban);
        System.out.println(kaban);
        System.out.println(w);

        businessProcess(pick);
        System.out.println(pick);
        System.out.println(w);

        Warehouse w2 = new Warehouse();
        Picker picker2 = new Picker(w2);
        Courier kaban2 = new Courier(w2);

        picker2.doWork();
        kaban2.doWork();

        System.out.println(kaban);
        System.out.println(pick);
    }

    static void businessProcess(Worker worker) {
        for (int i = 0; i < 10000; i++)
            worker.doWork();
        worker.bonus();
    }
}
