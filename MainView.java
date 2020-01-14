import javax.swing.*;
import Account;
import java.awt.*;
import java.awt.event.*;


public class MainView extends JFrame{

    private Account account = new Account();   
 
 
    public MainView(account){
        this.setTitle("Your Account");
        this.account = account; 
        JTextArea displayArea = new JTextArea();
        displayArea.setEditable(false);
        displayArea.setText(account.getAccountStatus());
        displayArea.setLineWrap(true);
        displayArea.setWrapStyleWord(true);
        JLabel player1 = new J Label(this.account.name, JLabel.CENTER);
        JButton balanceButton = new JButton("Check Balances");
        balanceButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){               
                    JOptionPane.showMessageDialog(null, this.account.getAccountStatus(), "Your Balances", JOptionPane.PLAIN_MESSAGE); 
               }       
            }
            
        });
        JButton depositButton = new JButton("Deposit into Savings");
        depositButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String message = "Savings Deposit";
                String title = "How much would you like to deposit" ;
                
                String inputValue = JOptionPane.showInputDialog("Please input a value");
                this.account.product.increaseSavings(int(inputValue))
                    
                displayArea.setText(account.getAccountStatus());
                } 
            } 
        }); 
                    

                    
        mainPanel = new JPanel(new GridLayout(1, 3));
        mainPanel l.ad d(displayArea);
        mainPanel.add(panel2);

        JPanel buttonPanel = new JPanel(new GridLayout(1, 3));
        buttonPanel.add(balanceButton);
        buttonPanel.add(depositButton);
 
        Container c = getContentPane(); 
        c.add(titlePanel, BorderLayout.NORTH);
        c.add(mainPanel, BorderLayout.CENTER);
        c.add(buttonPanel, BorderLayout.SOUTH);
    } 
}

                    

        