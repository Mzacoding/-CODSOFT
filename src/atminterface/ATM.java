
package atminterface;

import javax.swing.JOptionPane;


public class ATM {
    
   public  double balance;
protected double rbalance;
    public ATM() {
    }

    public ATM(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
   
    
    public double withdrawl(double amount)
    {
    
        if(balance>amount)
        {
         
          balance-=amount;
          JOptionPane.showMessageDialog(null,"Successfully WithDrawn R"+amount,"Success",JOptionPane.INFORMATION_MESSAGE);
         
        }
        else
        {
          JOptionPane.showMessageDialog(null,"Sufficient Balance","Sufficient Balance",JOptionPane.ERROR_MESSAGE);
        
        }
        
       return balance;

    }

    public double deposit(double amount)
    {
        
       JOptionPane.showMessageDialog(null,"You Have Succefuly Deposited R"+amount,"Sufficient Balance",JOptionPane.INFORMATION_MESSAGE);
       return  balance+=amount;
    } 
    
 
}
