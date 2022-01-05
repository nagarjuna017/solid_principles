package solidprinciples;

public class Atm implements CheckRequirements {
    boolean isWorking;
    public Atm(boolean status){
        isWorking=status;
    }

    @Override
    public boolean works() {
        if(isWorking)
            System.out.println("atm is working");
        else
            System.out.println("atm is not working");
        return  isWorking;
    }
}
