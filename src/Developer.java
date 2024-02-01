import java.util.HashMap;
import java.util.Map;

//extends Employee
class Developer extends Employee {

    private String skilllanguage;
    public Developer(String name, String area, double salary, String jobTitle, String skilllanguage) {
        super(name, area, salary, jobTitle);
        this.skilllanguage = skilllanguage;
    }

    public String getskilllanguage() {
        return skilllanguage;
    }
    @Override
    public double calculateIncrement() {
        return getSalary() * 0.10;
    }
    @Override
    public String generatePerformanceReport() {
        return "Performance report for Developer " + getName() + ": Good";
    }
    public void writeCode() {
        System.out.println("Developer " + getName() + " is writing code in " + skilllanguage);
    }
}
