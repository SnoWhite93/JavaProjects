package school_management_system;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1, "Lizzy", 500);
        Teacher mellisa = new Teacher(2, "Mellisa", 700);
        Teacher jack = new Teacher(3, "Jack",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(mellisa);
        teacherList.add(jack);

        Student anna = new Student(1, "Anna", 4);
        Student tom = new Student(2, "Tom", 12);
        Student matt = new Student(3, "Matt", 5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(anna);
        studentList.add(tom);
        studentList.add(matt);

        School ghs = new School(teacherList, studentList);


        anna.payFees(5000);
        tom.payFees(6000);
        System.out.println("GHS has earned: $" + ghs.getTotalMoneyEarned());

        System.out.println("--------Making GHS pay salary---------");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("GHS has given salary to " + lizzy.getName()
        + " and now has " + ghs.getTotalMoneyEarned());

        jack.receiveSalary(jack.getSalary());
        System.out.println("GHS has given salary to " + jack.getName()
                + " and now has " + ghs.getTotalMoneyEarned());

        System.out.println(tom);
        mellisa.receiveSalary(mellisa.getSalary());
        System.out.println(mellisa);

    }

}
