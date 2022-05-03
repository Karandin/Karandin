package day18;

public class Task2 {
    public static void main(String[] args) {

        System.out.println(count7(-77777));
        }

    public static int count7(int n) {
        if (Math.abs(n) < 7)
            return 0;

        char seven = '7';
        String str = Integer.toString(n);

        if (str.charAt(str.length() - 1) == seven) {
            return 1 + count7(n/10);
        }
        return count7(n / 10);
        }
    }

    //P.S. посмотрел решение, понял что криво брал последнюю цифру из числа, но сам смог додуматься только до такого:DD

    //P.P.S. последнюю задачу пока решить не смог, буду пыжиться ))



