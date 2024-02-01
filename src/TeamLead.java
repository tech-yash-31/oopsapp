
//extends the developer class
class TeamLead extends Developer {
    public TeamLead(String name, String address, double salary, String skillLanguage) {
        super(name, address, salary, "TeamLead", skillLanguage);

    }
    @Override
    public double calculateIncrement() {
        return getSalary() * 0.18;
    }
    @Override
    public String generatePerformanceReport() {
        return "Performance report for TeamLead " + getName() + ": Excellent";
    }
    public void workingonproject() {
        System.out.println("Team_Lead " + getName() + " is Working on the Tusker AI Project");
    }

}