public class Manager extends Employee {
    private boolean hasStocks;
    public Manager(){

    }

    public Manager(boolean hasStocks) {
        this.hasStocks = hasStocks;
    }

    public Manager(String fio, int age, int salary, boolean hasStocks) {
        super(fio, age, salary);
        this.hasStocks = hasStocks;
    }

    public boolean isHasStocks() {
        return hasStocks;
    }

    public void setHasStocks(boolean hasStocks) {
        this.hasStocks = hasStocks;
    }
    public String print(){
        return super.print()+ hasStocks;
    }
    public void writeProcedures(){
        System.out.println("I am writing Procedures.");
    }

    @Override
    public String toString() {
        return "Manager{" +
                super.toString()+
                "hasStocks=" + hasStocks +
                '}';
    }
}
