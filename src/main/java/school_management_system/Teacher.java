package school_management_system;

//this class is responsible for keeping track of teacher

public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

//    creates new teacher

    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }
//    return the id for the teacher

    public int getId() {
        return id;
    }
//    return the name

    public String getName() {
        return name;
    }

    //return salary
    public int getSalary() {
        return salary;
    }
// set the salary

    public void setSalary(int salary) {
        this.salary = salary;
    }
// adds to the salary, removes from the total money earned by the school
    public void receiveSalary(int salary) {
        salaryEarned += salary;
          School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                ", name='" + name + '\'' +
                ", salary= $" + salary +
                ", salaryEarned= $" + salaryEarned +
                '}';
    }

}
