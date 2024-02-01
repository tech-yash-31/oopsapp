interface Playing {
    public void playtt();
}
class Ttplaying extends Developer implements Playing {
    public Ttplaying(String name, String area, double salary, String jobTitle, String skilllanguage) {
        super(name, area, salary, jobTitle, skilllanguage);
    }
    @Override
    public void playtt() {
        System.out.println("Developers Playing TT");
    }
}
