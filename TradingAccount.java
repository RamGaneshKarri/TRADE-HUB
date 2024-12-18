class TradingAccount {
    private double balance;

    public TradingAccount() {
        this.balance = 0;
    }

    public void addFunds(double amount) {
        this.balance += amount;
        System.out.println("Funds added successfully! Current balance: " + balance);
    }

    public boolean deductFunds(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds!");
            return false;
        }
        balance -= amount;
        return true;
    }

    public double getBalance() {
        return balance;
    }
}