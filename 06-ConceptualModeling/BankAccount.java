public class BankAccount{
    private int bankNumber;
    private String owner;
    private double balance = 0;

    public int getBankNumber() {
        return bankNumber;
    }
    public void setBankNumber(int bankNumber) {
        this.bankNumber = bankNumber;
    }
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw (double money)
    {
        if (money > 500)
        {
            System.out.println("You can't withdraw more than 500$ at once!");
        }
        else
        {
            if (money > balance)
            {
                System.out.println("You can't withdraw more than your balance!");
            }
            else
            {
                balance -= money;
            }
        }
    }

    public void deposit(double money)
    {
        balance += money;
    }
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        acc1.setOwner("Krzysztof Kurowski");
        acc1.setBankNumber(123456789);
        acc1.deposit(500);
        System.out.println(acc1.getBalance());
        acc1.deposit(200);
        System.out.println(acc1.getBalance());
        acc1.withdraw(300);
        System.out.println(acc1.getBalance());
    } 
}