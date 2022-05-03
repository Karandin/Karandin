package day18;

public class Task1 {
    public static void main(String[] args) {
        int[] x = {2, 4, 5, 6, 7, 7, 3};
        System.out.println(recursionSum(0, x));
    }

    public static int recursionSum(int i, int[] arr) {
        if (i == (arr.length - 1))
            return arr[i];

        return arr[i] + recursionSum(i + 1, arr);

        //Долго мучался с этой задачей, открыл решение и увидел что ещё одну переменную передаем на вход и используем её как каунтер.
        // Есть ли возможность без этого лайфхака решить подобную задачу ? Как будто бы это немного "не по правилам".
    }
}