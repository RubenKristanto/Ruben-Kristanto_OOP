public class ConventionalAccount extends Account{
    private double credit;
    private double creditInterestRate;

    public ConventionalAccount(int accountNumber, double balance, Bank bank, AccountType accountType, double creditInterestRate){
        super(accountNumber, balance, bank, accountType);
        this.creditInterestRate = creditInterestRate;
        this.credit = 0;
    }

    public double getCredit(){
        return credit;
    }

    public void setCredit(double credit){
        this.credit = credit;
    }

    public void payCredit(){
        super.setBalance(super.getBalance()-this.credit);
        this.credit = 0;
    }

    public void addCredit(double amount){
        this.credit += (this.credit + (amount*this.creditInterestRate))/100;
    }

    public void addCredit(double amount, double discountRate) {
        this.credit += (this.credit + ((amount * this.creditInterestRate)*discountRate)) / 100;
    }

    public void showDetail(){
        System.out.println("Account number: " + super.getAccountNumber());
        System.out.println("Balance: " + super.getBalance());
        System.out.println("Bank code: " + super.getBank().getCode());
        System.out.println("Account type: " + super.getAccountType());
        System.out.println("Credit : " + this.credit);
        System.out.println("Credit Interest Rate : " + this.creditInterestRate);
    }
}
