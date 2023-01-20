import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) {
        List<Account> accounts = new LinkedList<>();
        String file = "/Users/radhey/Downloads/NewBankAccounts.CSV";

        List<String[]> newAccountHolder = Utility.read(file);
        for(String[] accountHolder: newAccountHolder){
            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            if(accountType.equals("Savings")){
                accounts.add(new Savings(name, sSN , initDeposit));
            }else if(accountType.equals("Checking")){
                accounts.add(new Checking(name, sSN , initDeposit));
            }else{
                System.out.println("Error reading account type");
            }
        }
        accounts.forEach(System.out::println);
        accounts.get(5).showInfo();
    }
}
