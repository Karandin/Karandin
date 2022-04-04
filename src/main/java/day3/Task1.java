package day3;
import java.util.*;
public class Task1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {

       String city = sc.nextLine();
        if (city.equals("Stop"))
        break;


    switch (city) {
        case "Москва":
        case "Владивосток":
        case "Ростов":
            System.out.print("Россия");
            break;
        case "Рим":
        case "Милан":
        case "Турин":
            System.out.print("Италия");
            break;
        case "Ливерпуль":
        case "Манчестер":
        case "Лондон":
            System.out.print("Англия");
            break;
        case "Берлин":
        case "Мюнхен":
        case "Кёлн":
            System.out.print("Германия");
            break;
        default:
            System.out.print("Неизвестная страна");
            break;
    }
    }
    }
}
