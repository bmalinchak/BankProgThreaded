package bankprog;


public class BankProg {

    public static void main(String[] args) {
       
       // Account Creation 
       Account Account1 = new Account("Account1",100.00);
       Account Account2 = new Account("Account2",50.00);
       
       // Account Balance Inquiry
       BalanceInquiry balanceInquiry = new BalanceInquiry(Account1);
       balanceInquiry.start();
       
       
       //Thread thread1 = new Thread(BalanceInquiry);
       //thread1.start();
       
       
       // Account Deposit
       Deposit deposit = new Deposit(Account1,50.00);
       deposit.start();
       BalanceInquiry balanceInquiry1 = new BalanceInquiry(Account1);
       balanceInquiry1.start();
       
       // Account Withdrawal
       Withdraw withdraw = new Withdraw(Account1,50.00);
       withdraw.start();
       BalanceInquiry balanceInquiry2 = new BalanceInquiry(Account1);
       balanceInquiry2.start();
       
       // Overdraft Error
       Withdraw Withdraw1 = new Withdraw(Account1,500.00);
       Withdraw1.start();
       
       
       // Account Transfer
       BalanceInquiry BalanceInquiry3 = new BalanceInquiry(Account1);
       BalanceInquiry3.start();
       
       BalanceInquiry BalanceInquiry4 = new BalanceInquiry(Account2);
       BalanceInquiry4.start();
       
       Transfer Transfer1 = new Transfer(Account1,Account2,20.00);
       Transfer1.start();
       BalanceInquiry BalanceInquiry5 = new BalanceInquiry(Account1);
       BalanceInquiry5.start();
       
       BalanceInquiry BalanceInquiry6 = new BalanceInquiry(Account2);
       BalanceInquiry6.start();
       
       /*try
       {
           System.out.println(Thread.activeCount());
           Thread.sleep(8000);
       }catch(InterruptedException e){}
       */
    }               
}
