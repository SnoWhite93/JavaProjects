package school_management_system;

import java.util.List;

//implements teachers and students using arraylist
public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

// new school object is created
//    teachers list of teachers in school
//    students list of students in school
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

// returns the list of teachers in the school
    public List<Teacher> getTeachers() {
        return teachers;
    }

// add a teacher to the school
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
// returns the list of students in the school
    public List<Student> getStudents() {
        return students;
    }

// add a student to the school
    public void addStudents(Student student) {
        students.add(student);
    }

// return total money earned by the school
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

// adds the total money earned by the school
    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

// returns the total money spent by the school
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

// update the money that is spent by the school which is the salary given by the school to its teachers
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
    }

}
