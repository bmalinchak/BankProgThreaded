/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankprog;

/**
 *
 * @author Bryce
 */
public class Withdraw extends Transaction {
    Account Account;
    
    public Withdraw(Account theAccount, double WithdrawAmt){
        Account = theAccount;
        if (Account.currentBalance < WithdrawAmt){
            System.out.println("Error: Insufficient Funds");
        }
        else {
            Account.currentBalance -= WithdrawAmt;
        }
    }
}
