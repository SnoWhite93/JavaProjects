package school_management_system;
// this class is responsible for keeping track of students

public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    //create new student object by initializing the values
    public Student(int id, String name, int grade) {
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

//  not going to alter student's name and id

    /*
     * used to update the student's grade
     *
     * */

    public void setGrade(int grade) {
        this.grade = grade;
    }
// keep adding the fees to feesPaid Field
//    add the fees to the fees paid
//  the school is going to receive the funds
// @param fees is the fees that student pays

    public void payFees(int fees) {
          feesPaid = feesPaid + fees;
//          feesPaid += fees;
         School.updateTotalMoneyEarned(feesPaid);


    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

// return the remaining fees
  public int getRemainingFees() {
        return feesTotal - feesPaid;
  }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", feesPaid= $" + feesPaid +
                ", feesTotal= $" + feesTotal +
                '}';
    }

}
