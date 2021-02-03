public class Specialist extends Employee {
    private int levels;
    public Specialist(){

    }

    public Specialist(String fio, int age, int salary, int levels) {
        super(fio, age, salary);
        this.levels = levels;
    }

    @Override
    public void goToDayOff() {
        System.out.println("I am going to sleep");;
    }
    @Override
    public void goToVacation() {
        System.out.println("I am going to Trip");
    }

    public Specialist(int levels) {
        this.levels = levels;
    }

    public String print(){
        return super.print()+ levels;
    }
    public void workWithClients() {
        System.out.println("I am working with Clients.");
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

    @Override
    public String toString() {
        return "Specialist{" +
                super.toString()+
                "levels=" + levels +
                '}';
    }
}
