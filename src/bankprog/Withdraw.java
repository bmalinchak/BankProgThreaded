
package bankprog;

public class Withdraw extends Transaction {
    
    Account Account;
    double WithdrawAmount;
    
    
    public Withdraw(Account theAccount, double WithdrawAmt){
        Account = theAccount;
        WithdrawAmount = WithdrawAmt;

    }
    public void run(){
        if (Account.currentBalance < WithdrawAmount){
            System.out.println("Error: Insufficient Funds");
        }
        else {
            Account.currentBalance -= WithdrawAmount;
        }
    }
}
