package solidvoilation;

import java.util.Scanner;

class Customer {
    private String name;
    private int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public void needOfCustomer(){
        Scanner in=new Scanner(System.in);
        System.out.println("How can I help you:");
        String reason=in.nextLine();
        System.out.println("Reason: "+ reason);
    }
}

class Employee {
    private String name;
    private int age;
    private int id;
    private int salary;
    public Employee(String name, int age, int id){
        this.name=name;
        this.age=age;
        this.id=id;
    }
    public Employee(String name, int age, int id, int salary){
        this.name=name;
        this.age=age;
        this.id=id;
        this.salary=salary;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getId(){
        return id;
    }
    public int getSalary() { return salary;
    }
}
interface Work {
     String balanceCheck();
     String cashDeposit();
     String cashWithdraw();
}
class Working implements Work {
    public String balanceCheck() {
        return "Checking the Balance";
    }
    public String cashDeposit(){
        return "Depositing the cash";
    }
    public String cashWithdraw(){
        return "Withdrawing cash";
    }
}
class Atm{
    boolean isWorking;
    public Atm(boolean status){
        isWorking=status;
    }
}
interface ServerCheck {
    public boolean checkServer();
}
class Server implements ServerCheck {
    boolean isWorking;
    public Server(boolean status){
        isWorking=status;
    }

    @Override
    public boolean checkServer() {
        return isWorking;
    }
}
class Requirements {
    public final Atm atm;
    public final Server server;
    public Requirements(){
        atm=new Atm(false);
        server=new Server(true);
    }
    public void checkRequirements(){
        if(atm.isWorking|| server.isWorking)
            System.out.println("Good to go");
        else System.out.println("Not so good to go");
    }
}
public class Bank1 {
    public static void main(String args[]){
        Employee employees = new Employee("John", 40, 211);
        Customer customers = new Customer("Ravi", 23);
        customers.needOfCustomer();


        Employee manager=new Employee("Raju", 45, 111, 30000);
        System.out.println(manager.getSalary());


        Working withDraw=new Working();
        System.out.println(withDraw.cashWithdraw());
        Working depositCash=new Working();
        System.out.println(depositCash.cashDeposit());


        Requirements require=new Requirements();
        require.checkRequirements();

    }
}
