package src.oopsadv.ThrowsException;

public class Bank {
    private String currency;
    private Integer amount;

    public Bank(String inr, int i) {
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
    public Integer add(Bank banKName) throws CustomException {
        if (!(banKName.currency.equalsIgnoreCase("INR"))) {
            throw new CustomException("USD to INR not supported!");
//            throw new ArithmeticException("Arthi");
        }
        Integer sum = this.amount + banKName.amount;
        return sum;
    }
}
