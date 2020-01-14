import javax.swing.JFrame;
import account.Account;
import MainView1;

public class GUIApp1{
    

    public static void main(String[] args){
        
        final JFrame view = new MainView1(new Account());
        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.setSize(600, 325);
        view.setVisible(true);
    }
}