package solidprinciples;

public class Bank {
    public static void main(String args[]) {
        //Singular
        Employee employees = new Employee("John", 40, 211);
        Customer customers = new Customer("Ravi", 23);
        customers.getAge();
        CustomersNeed need=new CustomersNeed();
        need.needOfCustomer();

        //open Liskov
        Manager managers = new Manager(employees.getName(), employees.getAge(), employees.getId(), 30000);
        System.out.println("Salary is:"+managers.getName());

        //Interface Segregation
        Integrate interfaceSeggresion=new Integrate();
        System.out.println(interfaceSeggresion.cashDeposit());
        System.out.println(interfaceSeggresion.balanceCheck());
        System.out.println(interfaceSeggresion.cashWithdraw());

        //Dependency Inversion
        Atm atm=new Atm(true);
        Server server=new Server(false);
        Requirements required=new Requirements(server);
    }
}

