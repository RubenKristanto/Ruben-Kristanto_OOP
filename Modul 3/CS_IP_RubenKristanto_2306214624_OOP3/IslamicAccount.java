public class IslamicAccount extends Account{
    private double mudhrobahRate;

    public IslamicAccount(int accountNumber, double balance, Bank bank, AccountType accountType, double mudhorobahRate){
        super(accountNumber, balance, bank, accountType);
        this.mudhrobahRate = mudhorobahRate;
    }

    public double getMudhrobahRate(){
        return mudhrobahRate;
    }

    public void addInterest(){
        super.setBalance(super.getBalance()*mudhrobahRate);
    }

    @Override
    public void showDetail() {
        super.showDetail();
        System.out.println("mudhorobah rate : "+ this.mudhrobahRate);
    }
}
