import javax.swing.*;
import account.Account.*;
import java.awt.*;
import java.awt.event.*;



public class MainView1 extends JFrame{

    private JTextField accountField = new JTextField(1);
    private Account account = new Account();

    public MainView1(Account account){
        this.setTitle("Pace Bank");
        this.account = account;
        JTextArea displayArea = new JTextArea();
        displayArea.setEditable(false);
        displayArea.setText("Your Account");
        displayArea.setLineWrap(true);
        displayArea.setWrapStyleWord(true);
        JButton balanceButton = new JButton("Check Balances");
        balanceButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){               
                    JOptionPane.showMessageDialog(null, this.account.getAccountStatus(), "Your Balances", JOptionPane.PLAIN_MESSAGE); 
               }       
            }
            
        );
        JButton depositButton = new JButton("Deposit into Savings");
        Double amount;
        depositButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String message = "Savings Deposit";
                String title = "How much would you like to deposit";
                
                String inputValue = JOptionPane.showInputDialog("Please input a value");
                amount = Double.valueOf(inputValue);
                this.account.product.increaseSavings(amount);
                } 
            } 
        ); 
        JPanel titlePanel = new JPanel(new GridLayout(1,3));
        titlePanel.add(accountField);

        JPanel mainPanel = new JPanel(1,3);
        mainPanel.add();

        JPanel buttonPanel = new JPanel(new GridLayout(1, 3));
        buttonPanel.add(balanceButton);
        buttonPanel.add(depositButton);
 
        Container c = getContentPane(); 
        c.add(titlePanel, BorderLayout.NORTH);
        c.add(mainPanel, BorderLayout.CENTER);
        c.add(buttonPanel, BorderLayout.SOUTH);
    }



}