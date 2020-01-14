import java.util.Scanner;
import java.util.HashMap;
import Products;


public class LogIn{
    private HashMap<String, String> hmap =  new HashMap<String, String>();
    
    public void newUser(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the new username: ");
        String userName = input.next();
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter the password: ");
        String password = input1.next();
        hmap.put(userName, password);
    }

   

    public boolean checkPassword(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String userName = input.next();
        if(hmap.containsKey(userName)){
            Scanner input1 = new Scanner(System.in);
            System.out.println("Enter your password: ");
            String password = input1.next();
            if(hmap.get(userName).equals(password)){
                System.out.println("Log In Successful");
                return true;
            }
            else{
                System.out.println("That password is not correct");
                return false;
            }
        }
        else{
            System.out.println("That username is not correct");
            return false;
        }

    }

    public static void main(String[] args) {
        LogIn l1 = new LogIn();
        l1.newUser();
        if(!l1.checkPassword()){
            l1.checkPassword();
        }
        
    }


}