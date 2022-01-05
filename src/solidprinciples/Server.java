package solidprinciples;

public class Server implements CheckRequirements {
    boolean isWorking;
    public Server(boolean status){
        isWorking=status;
    }

    @Override
    public boolean works() {
        if(isWorking)
            System.out.println("server is working");
        else
            System.out.println("server is not working");
        return  isWorking;
    }
}
