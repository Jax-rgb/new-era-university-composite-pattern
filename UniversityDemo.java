public class UniversityDemo {
    public static void main(String[] args) {
        // Create Colleges
        College university = new College("New Era University");
        College engineering = new College("College of Engineering");
        College business = new College("College of Business");

        // Create Departments
        Department csDept = new Department("Department of Computer Science");
        Department itDept = new Department("Department of Information Technology");
        Department financeDept = new Department("Department of Finance");

        // Create Teachers
        Teacher profJava = new Teacher("Dr. Java Expert", "Java Programming", 85000);
        Teacher profAlgo = new Teacher("Prof. Algorithms", "Data Structures", 92000);
        Teacher profFinance = new Teacher("Dr. Money", "Financial Management", 78000);

        // Create Students
        Student s1 = new Student("Alice Smith", "NEU2023001", 15000);
        Student s2 = new Student("Bob Johnson", "NEU2023002", 15000);
        Student s3 = new Student("Carol Williams", "NEU2023003", 16000);
        Student s4 = new Student("David Brown", "NEU2023004", 15500);

        // Build Hierarchy
        csDept.add(profJava);
        csDept.add(profAlgo);
        csDept.add(s1);
        csDept.add(s2);

        itDept.add(new Teacher("Prof. Networks", "Computer Networks", 88000));
        itDept.add(s3);

        financeDept.add(profFinance);
        financeDept.add(s4);

        engineering.add(csDept);
        engineering.add(itDept);

        business.add(financeDept);

        university.add(engineering);
        university.add(business);

        // Demo
        System.out.println("=== University Structure ===");
        university.displayDetails("");

        System.out.println("\n=== Total Students in University ===");
        System.out.println(university.getTotalStudents());

        System.out.println("\n=== Total Budget for University ===");
        System.out.printf("$%.2f%n", university.getBudget());
    }
}
