public class BankAccount {
    // Viết class BankAccount gồm số tài khoản, chủ tài khoản, số dư. Method
    // deposit(double) và boolean withdraw(double) (trả về false nếu số dư không đủ
    // hoặc số tiền không hợp lệ).
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {

        if (balance < 0) {
            System.out.println("Số dư không hợp lệ");
        } else {
            this.balance = balance;
        }

    }

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Số tiền gửi không hợp lệ");
        } else {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Số tiền rút không hợp lệ");
            return false;
        } else if (amount > balance) {
            System.out.println("Số dư không đủ");
            return false;
        } else {
            balance -= amount;
            return true;

        }
    }

    public static void main(String[] args) {

        BankAccount account = new BankAccount("123456", "Nguyen Van A", 1000);
        System.out.println("Số dư ban đầu: " + account.getBalance());
        account.deposit(500);
        System.out.println("Số dư sau khi gửi: " + account.getBalance());
        boolean success = account.withdraw(700);
        if (success) {
            System.out.println("Số dư sau khi rút: " + account.getBalance());
        } else {
            System.out.println("Rút tiền thất bại");
        }
    }
}
