

class Employee {
    private String name;
    private String area;
    private double salary;
    private String jobTitle;

    public Employee(String name, String area, double salary, String jobTitle) {
        this.name = name;
        this.area = area;
        this.salary = salary;
        this.jobTitle = jobTitle;

    }

    public String getName() {
        return name;
    }
    public String getArea() {
        return area;
    }
    public double getSalary() {
        return salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double calculateIncrement() {
        return 0.0;
    }

    public String generatePerformanceReport() {
        return "By Evaluation.";
    }
}