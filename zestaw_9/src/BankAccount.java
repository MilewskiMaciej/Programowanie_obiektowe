public record BankAccount(String accountNumber, double balance) {
    public BankAccount(String accountNumber) {
        this(accountNumber, 0);
    }
}
