package solidprinciples;

public class Integrate implements CheckBalance, DepositCash, WithdrawCash {
    @Override
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
