package pdf1;

class BankAccount {
    String accountNumber;
    double balance;
    double interestRate;

    BankAccount(String accountNumber, double balance, double interestRate) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    void deposit(double amount) {
        if (amount < 100) {
            System.out.println("deposit at least 100");
            return;
        }
        this.balance += amount;
        System.out.println(amount + " has been deposited. New balance is " + this.balance);
    }
}

class SavingAccount extends BankAccount {
    double minimumBalance;

    SavingAccount(String accountNumber, double balance, double interestRate, double minimumBalance) {
        super(accountNumber, balance, interestRate);
        this.minimumBalance = minimumBalance;
    }

    void withdraw(double amount) {
        if (this.balance < 1) {
            System.out.println("you have zero balanance");
        }
        if ((this.balance - amount) < minimumBalance) {
            System.out.println("Leave at least Rs " + minimumBalance);
            return;
        }
        this.balance -= amount;
        System.out.println(amount + " has been withdrew. New balance is " + this.balance);
    }
}

public class Assignment_06 {

    public static void main(String[] args) {

        BankAccount bank = new BankAccount("123456789", 10000.00, 5.0);
        SavingAccount savinAccount = new SavingAccount(bank.accountNumber, bank.balance, bank.interestRate, 1000);

        bank.deposit(1000);

        savinAccount.deposit(1000.0);
        savinAccount.withdraw(9000.0);

    }
}