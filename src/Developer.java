public class Developer extends Employee {
    private String grades;
    public Developer(){

    }

    public Developer(String grades) {
        this.grades = grades;
    }

    public Developer(String fio, int age, int salary, String grades) {
        super(fio, age, salary);
        this.grades = grades;
    }

    public String getGrades() {
        return grades;
    }

    public void setGrades(String grades) {
        this.grades = grades;
    }
    public String print(){
        return super.print()+ grades;
    }
    public void writeCode(){
        System.out.println("I am writing an awesome algorithm.");
    }

    @Override
    public String toString() {
        return "Developer{" +
                super.toString()+
                "grades='" + grades + '\'' +
                '}';
    }
}
