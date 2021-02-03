public abstract class Employee {
    private String fio;
    private int age;
    private int salary;

    public Employee(){
    }

    public Employee(String fio, int age, int salary) {
        this.fio = fio;
        this.age = age;
        this.salary = salary;
    }
    public void goToVacation(){
        System.out.println("I am going to vacation");
    }
    public void goToDayOff(){
        System.out.println("I want to relax!");
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fio='" + fio + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public String print(){
        return "Employee{" +
                "fio='" + fio + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
