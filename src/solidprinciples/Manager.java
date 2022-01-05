package solidprinciples;

public class Manager extends Employee {
    private int salary=30000;
    public Manager(String name, int age, int id, int salary){
        super(name,age,id);
        this.salary=salary;
    }
    public int getSalary(){
        return salary;
    }
}
