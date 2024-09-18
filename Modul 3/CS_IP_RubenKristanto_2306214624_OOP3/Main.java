public class Main {
    public static void main(String[] args){
        Bank bjb = new Bank(1, "BJBR", 5);
        Bank Jago = new Bank(2, "ARTO", 5.5);
        Bank BSI = new Bank(3, "BRIS", 7);

        ConventionalAccount conventional1 = new ConventionalAccount(1, 2000000, bjb, AccountType.Conventional, 2);
        ConventionalAccount conventional2 = new ConventionalAccount(2, 1500000, Jago, AccountType.Conventional, 3);

        IslamicAccount islamic1 = new IslamicAccount(3, 3000000, BSI, AccountType.Syariah, 2);
        IslamicAccount islamic2 = new IslamicAccount(4, 3000000, BSI, AccountType.Syariah, 4);

        conventional1.withdraw(150000);
        conventional1.addCredit(20000);
        conventional1.payCredit();
        conventional1.addInterest();
        conventional2.addCredit(20000, 5);
        islamic1.deposit(100000);
        islamic1.addInterest();
        islamic2.addInterest();

        conventional1.showDetail();
        conventional2.showDetail();
        islamic1.showDetail();
        islamic2.showDetail();
    }
}
