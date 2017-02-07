
package bankprog;


public class Deposit extends Transaction {
    
    Account Account;
    double DepositAmount;

    
    public Deposit(Account theAccount, double DepositAmt){
        Account = theAccount;
        DepositAmount = DepositAmt;

    }
    public void run(){
        Account.currentBalance += DepositAmount; 
    }
}
