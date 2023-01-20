public class Checking extends Account{
    // List properties specific to checking account
    private long debitCardNumber;
    private  int debitCardPin;
    public Checking(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "2"+accountNumber;
        setDebitCard();
    }

    @Override
    public double setRate() {
        rate =getBaseRate()- getBaseRate() * .15;
        return rate;
    }

    public void showInfo(){
        super.showInfo();
        System.out.println(
                " Your checking accounts feature: "
                        +"\n  Debit card number: "+debitCardNumber
                        +"\n  Debit card number pin: "+debitCardPin

        );
    }

    private void setDebitCard(){
        debitCardNumber = (long) (Math.random()*Math.pow(10, 12));
        debitCardPin = (int) (Math.random()*Math.pow(10, 4));
    }
}
