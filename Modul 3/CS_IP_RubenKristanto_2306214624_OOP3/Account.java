public class Account {
    private int accountNumber;
    private double balance;
    private Bank bank;
    private AccountType accountType;

    public Account(int accountNumber, double balance, Bank bank, AccountType accountType) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.bank = bank;
        this.accountType = accountType;
    }

    public Account(int accountNumber) {
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public Bank getBank(){
        return bank;
    }

    public AccountType getAccountType(){
        return accountType;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            this.balance += amount;
        }
        else{
            System.out.println("lo miskin kurang amoutnnya gan");
        }
    }

    public void withdraw(double amount){
        if(amount > this.balance){
            System.out.println("maafkeun gan tapi tabungan lo kurang");
        }
        else{
            this.balance -= amount;
            System.out.println("withdraw berhasil");
        }
    }

    public void addInterest(){
        this.balance += this.balance*bank.getInterestRate();
    }

    public void showDetail(){
        System.out.println("Account number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Bank code: " + bank.getCode());
        System.out.println("Account type: " + accountType);
    }
}
