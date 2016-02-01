/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmbanking;

import java.util.Date;

/**
 *
 * @author student
 */
public class Account {
    private int valueOfManey;
    
    Account() {
        this.valueOfManey = 0;
    }
    
    Account(int value ) {
        this.valueOfManey = value;
    }
    
    public int getValueOfManey() {
    
        return this.valueOfManey;
    }
    
    public void setValueOfManey(int money) {
        System.out.println(new Date().toString()+"  -  " + this.valueOfManey);
        this.valueOfManey = money;
        System.out.println(new Date().toString()+"  -  " + this.valueOfManey);
    }
    
}
