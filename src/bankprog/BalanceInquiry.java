
package bankprog;


public class BalanceInquiry extends Transaction {
    
    Account Account;
    
    public BalanceInquiry(Account theAccount){
        this.Account = theAccount;
    }
    public void run(){
        System.out.println(Account.AccountNumber + " Current Balance: " + Account.currentBalance);
    }

}
