import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//extends the Employee
class Manager extends Employee {
    private int handlingjuniors;

    public Manager(String name, String area, double salary, String jobTitle, int handlingjuniors) {
        super(name, area, salary, jobTitle);
        this.handlingjuniors = handlingjuniors;
    }

    public int gethandlingjuniors() {
        return handlingjuniors;
    }

    @Override
    public double calculateIncrement() {
        //calculate the managers bonus
        return getSalary() * 0.15;
    }

    @Override
    public String generatePerformanceReport() {
        return "Performance report for Manager " + getName() + ": Excellent";
    }

    public void manageProject() {
        System.out.println("Manager " + getName() + " is managing a project.");
    }

}
