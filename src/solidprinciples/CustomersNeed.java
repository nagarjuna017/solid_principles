package solidprinciples;

import java.util.Scanner;

public class CustomersNeed {
    public void needOfCustomer(){
        Scanner in=new Scanner(System.in);
        System.out.println("How can I help you:");
        String reason=in.nextLine();
        System.out.println("Reason: "+ reason);
    }
}
