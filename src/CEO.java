public class CEO extends Employee {
    private boolean hasCompanyCar;
    public CEO(){

    }

    public CEO(boolean hasCompanyCar) {
        this.hasCompanyCar = hasCompanyCar;
    }

    public CEO(String fio, int age, int salary, boolean hasCompanyCar) {
        super(fio, age, salary);
        this.hasCompanyCar = hasCompanyCar;
    }

    public boolean isHasCompanyCar() {
        return hasCompanyCar;
    }

    @Override
    public void goToVacation() {
        System.out.println("I am going to Hawaii");
    }

    @Override
    public void goToDayOff() {
        System.out.println("I want go to massage!");
    }

    public void setHasCompanyCar(boolean hasCompanyCar) {
        this.hasCompanyCar = hasCompanyCar;
    }
    public String print(){
        return super.print()+" has"+hasCompanyCar;
    }
    public void goPublic(){
        System.out.println("I am working on IPO.");
    }

    @Override
    public String toString() {
        return "CEO{" +
                super.toString()+
                "hasCompanyCar=" + hasCompanyCar +
                '}';
    }
}
