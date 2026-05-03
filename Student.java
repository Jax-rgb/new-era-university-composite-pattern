public class Student implements EducationalUnit {
    private String name;
    private String studentId;
    private double tuitionFee;

    public Student(String name, String studentId, double tuitionFee) {
        this.name = name;
        this.studentId = studentId;
        this.tuitionFee = tuitionFee;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void displayDetails(String indent) {
        System.out.println(indent + "Student: " + name + " | ID: " + studentId + " | Tuition: $" + tuitionFee);
    }

    @Override
    public int getTotalStudents() {
        return 1;
    }

    @Override
    public double getBudget() {
        return -tuitionFee;  // Revenue (negative cost)
    }
}
