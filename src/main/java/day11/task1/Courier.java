package day11.task1;

public class Courier implements Worker {

    private int salary;
    private boolean isPayed = false;
    private Warehouse w;

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public Courier(Warehouse w) {
        this.w = w;
    }

    //Methods


    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", w=" + w +
                '}';
    }

    @Override
    public void doWork() {
        salary += 100;
        w.calculateDeliveredOrders();
    }

    @Override
    public void bonus() {
        if (w.getCountDeliveredOrders() < 10000) {
            System.out.println("Бонус пока недоступен");
            return;
        }
        if (isPayed == true) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
        salary += 50000;
        isPayed = true;
    }
}


