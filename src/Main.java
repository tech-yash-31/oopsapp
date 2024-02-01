
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Bhavin Desai", "Bopal", 40000.0, "HRManager", 3);
        Developer developer = new Developer("Harsh", "Nikol", 25000.0, "Developer", "Java");
        TeamLead lead = new TeamLead("Harshal Trivedi", "Paldi", 42000.0, "Python & AI");
        Employee employee = new Employee("Yash", "Odhav", 16600.0, "Intern" );
        JuniorDev juniorDev = new JuniorDev("Suraj", "Paldi", 23000.0,"Jr.Dev", 0, "Web Development", "Qrious tech");
        Ttplaying ttplaying = new Ttplaying("Nupur", "SG road", 12600.0, "Internship","Python");
        System.out.println(" ");
        System.out.println(manager.generatePerformanceReport());
        System.out.println(" ");
        System.out.println(developer.generatePerformanceReport());
        System.out.println(" ");
        System.out.println(lead.generatePerformanceReport());
        System.out.println(" ");

        System.out.println("Manager's Increment: " + manager.calculateIncrement());
        System.out.println("==============================");
        System.out.println("Developer's Increment: " + developer.calculateIncrement());
        System.out.println("==============================");
        System.out.println("Team_Lead's Increment: " + lead.calculateIncrement());
        System.out.println("==============================");


        manager.manageProject();
        System.out.println(" ");

        developer.writeCode();
        System.out.println(" ");

        lead.workingonproject();
        System.out.println(" ");

        juniorDev.meetingcode();
        juniorDev.wfh();
        System.out.println(" ");
        ttplaying.playtt();
    }
}
