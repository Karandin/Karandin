
package day6;

import java.util.Random;

public class Teacher {
    String name, lesson;

    public Teacher(String name, String lesson) {
        this.name = name;
        this.lesson = lesson;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public void evaluate(Student student) {
        String s = "";
        Random rand = new Random();
        int grade =  rand.nextInt(4) + 2;
        if (grade == 2)
            s = "Неудовлетворительно";
        if (grade == 3)
            s = "Удовлитворительно";
        if (grade == 4)
            s = "Хорошо";
        if (grade == 5)
            s = "Отлично";

        System.out.println("Преподаватель " + this.name + " оценил студента с именем " + student.getName() + " по предмету " + this.lesson + " на оценку " + s);

    }
}
