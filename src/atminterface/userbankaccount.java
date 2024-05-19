
package atminterface;


public class userbankaccount {
     
    public double balance;

    public userbankaccount() {
         this.balance =500;
    }

   
    public userbankaccount(double balance) {
        this.balance = balance;
    }
     
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

   
    
}
