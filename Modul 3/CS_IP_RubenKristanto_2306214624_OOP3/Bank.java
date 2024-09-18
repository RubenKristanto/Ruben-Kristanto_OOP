public class Bank {
    private int bankId;
    private String code;
    private double interestRate;

    public Bank(int bankId, String code, double interestRate) {
        this.bankId = bankId;
        this.code = code;
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getBankId() {
        return bankId;
    }

    public void setBankId(int bankId) {
        this.bankId = bankId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
