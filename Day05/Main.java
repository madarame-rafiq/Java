package Day05;

abstract class BankAccount {
    private String accountNumber;
    protected String holderName;
    protected double balance;

    public BankAccount(String accountNumber, String holderName, double balance){
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount){
        if (amount > 0){
            balance -= amount;
            System.out.println("Amount deposited:- " + amount);
            System.out.println("Balance:- " + balance);
        }else{
            System.out.println("Please deposit valid amount!");
        }
    }

    public abstract void withdraw(double amount);

    public void getAccountNumber (){
        System.out.println("Account Number:- " + accountNumber);
    }
}


class SavingAccount extends BankAccount {
    private double interestRate;

    public SavingAccount (String accNo, String holder, double bal, double interest){
        super(accNo, holder, bal);
        this.interestRate = interest;
    }

    @Override public void withdraw (double amount){
        if (amount <= balance){
            balance -= amount;
            System.out.println("Amount withdrawn:- " + amount);
            System.out.println("Balance:- " + balance);
        }else{
            System.out.println("You cannot withdraw more that u have!");
        }
    }

    public void addInterest (){
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Balance after interest:- " + balance);
    }
}

class CurrentAccount extends BankAccount{
    private double overDraftLimit;

    public CurrentAccount (String accNo, String holder, double bal, double overDraftLimit){
        super(accNo, holder, bal);
        this.overDraftLimit = overDraftLimit;
    }

    @Override public void withdraw (double amount){
        if(amount <= balance + overDraftLimit){
            balance -= amount;
            System.out.println("Amount withdrawn:- " + amount);
            System.out.println("Balance:- " + balance);
        }else{
            System.out.println("Cannot withdraw amount:- " + amount);
        }
    }

    public void showDetail (){
        getAccountNumber();
        System.out.println("Holder Name:- " + holderName);
        System.out.println("Balance:- " + balance);
    }
}


public class Main {

    public static void main(String[] args) {
        SavingAccount s1 = new SavingAccount("2132232", "Rafiq Mansuri", 13000.3, 18);

        s1.addInterest();
        s1.withdraw(1000);

        CurrentAccount c1 = new CurrentAccount("4543535", "Mandsaur University", 12000000, 2000);

        c1.showDetail();
        c1.withdraw(122323);
    }
    
}