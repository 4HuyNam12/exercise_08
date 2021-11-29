import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class TransactionHistory {
    private LocalDate date;
    private String description;
    private long accountNumber;
    private long moneyNumber;

    public TransactionHistory(LocalDate date, String description, long accountNumber, long moneyNumber) {
        this.date = date;
        this.description = description;
        this.accountNumber = accountNumber;
        this.moneyNumber = moneyNumber;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getMoneyNumber() {
        return moneyNumber;
    }

    public void setMoneyNumber(long moneyNumber) {
        this.moneyNumber = moneyNumber;
    }

    public String formatMoney(long money) {
        DecimalFormat myFormat = new DecimalFormat("###,###,###");
        return myFormat.format(money);
    }

    public String formatDate(LocalDate date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(new Date());
    }

    @Override
    public String toString() {
        return formatDate(date) + " - " + description + " - " + accountNumber + " - " + formatMoney(moneyNumber);
    }
}
