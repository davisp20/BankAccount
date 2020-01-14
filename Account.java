import Products;
import LogIn;
import java.util.Scanner;





public class Account{
    /* This class simulates a bank account.
    It allows depositing and withdrawing from Savings and Checking Accounts.
    It also allows starting and checking the balance of CD's and Money Markets.
    @author Phil Davis
    */
    private String name = "Bob";
    private Products product = new Products();
    private LogIn logIn = new LogIn();

    public void newAccount(){
        this.logIn.newUser();
        this.product.newCD(0.00, 0.00);
        this.product.newMoneyMarket(0.00, 0.00);
    }

    public String getAccountStatus(){
        return "Savings Balance: "+ this.product.getSavingsValue() +
                "\nCheckings Balance: "+ this.product.getCheckingsValue()+
                "\nCD Value: "+ this.product.getCdValue()+
                "\nMoney Market Balance: "+ this.product.getmoneyMarketValue();
    }

    public void deposit(){
        Scanner input = new Scanner(System.in);
        System.out.println("What account would you like to deposit in: Savings or Checkings?");
        String account = input.next();
        Scanner input1 = new Scanner(System.in);
        System.out.println("How much?");
        String amount = input1.next();
        
        if(account.toUpperCase().equals("SAVINGS")){
            this.product.increaseSavings(Double.parseDouble(amount));
        }
        else{
            this.product.increaseCheckings(Double.parseDouble(amount));
        }
        this.getAccountStatus();
    }

    




}