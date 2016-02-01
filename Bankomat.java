/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmbanking;

/**
 *
 * @author student
 */
public class Bankomat {
    public final static int GET_MONEY = 1;
    public final static int PUT_MONEY = 2;
    private int usesType;
    private int moneyValue;
    private Account account = new Account(500);
    
    
    
    Bankomat(int typeIn, int moneyIn) {
       this.usesType = typeIn;
       this.moneyValue = moneyIn;
    }
    
    
   
    
    
    public boolean makeTransaction() {
        switch (this.usesType) {
            case PUT_MONEY:
                new Thread(new Runnable(){
                    public void run() {
                        
                        account.setValueOfManey(account.getValueOfManey() + moneyValue);
                        
                    }
                }).start();
                
                break;
        }
                
        return true;
    }
    
    public void putMoney() {}
    
    
}
