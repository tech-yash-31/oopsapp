import java.util.Map;
import java.util.TreeMap;

abstract class SeniorDev extends Manager
{
    protected String department; //Can be accessible through child class
    protected String projectname;

    public SeniorDev(String name, String area, double salary, String jobTitle, int handlingjuniors,String department, String projectname) {
        super(name, area, salary, jobTitle, handlingjuniors);
        this.department = department;
        this.projectname = projectname;
    }

    public abstract void wfh();
    public abstract void meetingcode();
}

class JuniorDev extends SeniorDev{
    public JuniorDev(String name, String area, double salary, String jobTitle, int handlingjuniors, String department, String projectname) {
        super(name, area, salary, jobTitle, handlingjuniors, department, projectname);
        Map<Integer, String> map = new TreeMap<>();
        map.put(1,"Web App for College Placement");
        map.put(2,"Banking App for Finance Company");
        map.put(3,"Website For a Shoping Mall");

        for (Integer key: map.keySet()){
            System.out.println("Project No : " + key + " Project Detail : " + map.get(key));
        }

    }
    @Override
    public void wfh() {
        System.out.println("Today working from home");
    }
    @Override
    public void meetingcode() {
        System.out.println("Code is : wfh232wwr");
    }

}