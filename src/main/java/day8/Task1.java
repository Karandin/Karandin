package day8;

public class Task1 {
    public static void main(String[] args) {
        // with StringBuilder
        long startTime = System.currentTimeMillis();
        StringBuilder str = new StringBuilder("");
        for (int i = 1; i <= 20000; i++)
            str.append(i + " ");

        System.out.println(str);
        long stopTime = System.currentTimeMillis();
        System.out.println(stopTime - startTime);

        // without StringBuilder
        startTime = System.currentTimeMillis();
        String s = "";
        for (int i = 1; i <= 20000; i++)
            s += i + " ";

        System.out.println(s);
        stopTime = System.currentTimeMillis();
        System.out.println(stopTime - startTime);
    }
}
