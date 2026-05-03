import java.util.ArrayList;
import java.util.List;

public class Department implements EducationalUnit {
    private String name;
    private List<EducationalUnit> components = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void add(EducationalUnit unit) {
        components.add(unit);
    }

    public void remove(EducationalUnit unit) {
        components.remove(unit);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void displayDetails(String indent) {
        System.out.println(indent + "Department: " + name);
        for (EducationalUnit unit : components) {
            unit.displayDetails(indent + "  ");
        }
    }

    @Override
    public int getTotalStudents() {
        return components.stream()
                .mapToInt(EducationalUnit::getTotalStudents)
                .sum();
    }

    @Override
    public double getBudget() {
        return components.stream()
                .mapToDouble(EducationalUnit::getBudget)
                .sum();
    }
}
