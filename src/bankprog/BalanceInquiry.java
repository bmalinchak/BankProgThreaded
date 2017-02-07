/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankprog;

/**
 *
 * @author bryce
 */
public class BalanceInquiry extends Transaction {
    
    Account Account;
    String AccountNumber;
    
    public BalanceInquiry(Account theAccount){
        Account = theAccount;
        System.out.println(Account.AccountNumber + " Current Balance: " + Account.currentBalance);
    }
    
}
