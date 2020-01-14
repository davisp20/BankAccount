import javax.swing.JFrame;

import Account;

public class GUIApp{
    
    public static void main(String[] args){
        final Account account = new Account();
        final JFrame view = new MainView(account);
        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.setSize(600, 325);
        view.setVisible(true);
    }
}