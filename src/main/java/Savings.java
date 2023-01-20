public class Savings extends Account{

    private int safetyBoxDepositId;
    private int safetyBoxDepositKey;
    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "1"+accountNumber;
        setSafetyDepositBox();
    }

    @Override
    public double setRate() {
        return getBaseRate()+getBaseRate()*0.25;
    }

    public void showInfo(){
        super.showInfo();
        System.out.println(
                " Your saving accounts feature: "
                +"\n  Safety Deposit Box ID: "+safetyBoxDepositId
                +"\n  Safety Deposit Box Key: "+safetyBoxDepositKey

        );
    }

    private void setSafetyDepositBox(){
        safetyBoxDepositId = (int) (Math.random() * Math.pow(10, 3));
        safetyBoxDepositKey = (int) (Math.random() * Math.pow(10, 4));
    }


}
