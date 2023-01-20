public abstract class Account implements InterestRate {
    // List common property for saving and checking accounts
    private String name;
    private String sSN;
    private double balance;
    protected String accountNumber;
    protected double rate;

    private static int index = 10000;


    // Constructor to set base properties and initialize the account

    public Account(String name, String sSN, double initDeposit) {
        this.name = name;
        this.sSN = sSN;
        this.balance = initDeposit;
        this.accountNumber = setAccountNumber();
        this.rate = setRate();
    }

    public abstract double setRate();

    private String setAccountNumber(){
        String lastTwoOfSSN = sSN.substring(sSN.length()-2);
        index++;
        lastTwoOfSSN += index;
        int rand =(int) (Math.random()*1000);
        lastTwoOfSSN += rand;
        return lastTwoOfSSN;
    }

    public void compound(){
        double accruedInterest = balance * (rate/100);
        balance += accruedInterest;
        System.out.println("Accrued Interest: $"+accruedInterest);
    }

    public void deposit(double amount){
        balance+=amount;
        System.out.println("Depositing $"+amount);
        printBalance();
    }

    public void withdraw(double amount){
        balance -= amount;
        System.out.println("Withdrawing $"+amount);
        printBalance();
    }

    public void transfer(String toWhere, double amount){
        balance -= amount;
        System.out.println("Transferring $"+amount+" to "+toWhere);
        printBalance();
    }

    public void printBalance(){
        System.out.println("Your balance is $"+balance);
    }

    public void showInfo(){
        System.out.println(
                "Name: "+ this.name
                +"\nAccount Number: "+this.accountNumber
                +"\nBalance: "+this.balance
                +"\nInterest rate is: "+rate+"%"
        );
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", sSN='" + sSN + '\'' +
                ", balance=" + balance +
                ", accountNumber='" + accountNumber + '\'' +
                ", rate=" + rate +
                '}';
    }
}
