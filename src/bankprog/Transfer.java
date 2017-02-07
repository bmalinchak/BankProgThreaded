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
public class Transfer extends Transaction {
    Account AccountSend;
    Account AccountRecieve;
    Withdraw theWithdraw;
    Deposit theDeposit;
    double amount;

    public Transfer(Account AccountS, Account AccountR, double amnt){
        AccountSend = AccountS;
        AccountRecieve = AccountR;
        amount = amnt;
    }
    public void run(){
        Withdraw theWithdraw = new Withdraw(AccountSend,amount);
        Deposit theDeposit = new Deposit(AccountRecieve,amount);
    }
}
