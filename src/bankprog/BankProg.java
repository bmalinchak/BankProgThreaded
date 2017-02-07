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
public class BankProg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       // Account Creation 
       Account Account1 = new Account("Account1",100.00);
       Account Account2 = new Account("Account2",50.00);
       
       // Account Balance Inquiry
       BalanceInquiry BalanceInquiry = new BalanceInquiry(Account1);
       Thread thread1 = new Thread(BalanceInquiry);
       thread1.start();
       
       
       // Account Deposit
       Deposit Deposit = new Deposit(Account1,50.00);
       Thread thread2 = new Thread(Deposit);
       thread2.start();
       BalanceInquiry BalanceInquiry1 = new BalanceInquiry(Account1);
       Thread thread3 = new Thread(BalanceInquiry1);
       thread3.start();
       
       // Account Withdrawal
       Withdraw Withdraw = new Withdraw(Account1,50.00);
       Thread thread4 = new Thread(Withdraw);
       thread4.start();
       BalanceInquiry BalanceInquiry2 = new BalanceInquiry(Account1);
       Thread thread5 = new Thread(BalanceInquiry2);
       thread5.start();
       // Overdraft Error
       Withdraw Withdraw1 = new Withdraw(Account1,500.00);
       Thread thread6 = new Thread(Withdraw1);
       thread6.start();
       
       
       // Account Transfer
       BalanceInquiry BalanceInquiry3 = new BalanceInquiry(Account1);
       Thread thread7 = new Thread(BalanceInquiry3);
       thread7.start();
       BalanceInquiry BalanceInquiry4 = new BalanceInquiry(Account2);
       Thread thread8 = new Thread(BalanceInquiry4);
       thread8.start();
       Transfer Transfer1 = new Transfer(Account1,Account2,20.00);
       Thread thread9 = new Thread(Transfer1);
       thread9.start();
       BalanceInquiry BalanceInquiry5 = new BalanceInquiry(Account1);
       Thread thread10 = new Thread(BalanceInquiry5);
       thread10.start();
       BalanceInquiry BalanceInquiry6 = new BalanceInquiry(Account2);
       Thread thread11 = new Thread(BalanceInquiry6);
       thread11.start();
    }
    
}
