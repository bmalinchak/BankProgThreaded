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
public class Account {
    
Account theAccount;
String AccountNumber;
double currentBalance;

public Account(String AccNum,double initialBalance){
    this.AccountNumber = AccNum;
    this.currentBalance = initialBalance;
}
    
}

