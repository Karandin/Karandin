package day11.task1;

public class Picker implements Worker {
    private int salary;
    private boolean isPayed = false;
    private Warehouse w;

    public Picker(Warehouse w) {
        this.w = w;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    //Methods


    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", w=" + w +
                '}';
    }

    @Override
    public void doWork() {
        salary += 80;
        w.calculatePickedOrders();
    }

    @Override
    public void bonus() {
        if (w.getCountPickedOrders() < 10000) {
            System.out.println("Бонус пока недоступен");
            return;
        }
        if (isPayed == true) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
        salary += 70000;
        isPayed = true;
    }
}
