/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muddamrlab3;

/**
 *
 * @author S546293
 */
public class Account {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bank bankobject1 = new Bank();
        System.out.println();
        Bank bankobject2 = new Bank(12345, 150.0, "James Harden", "(666-278-567)");
        System.out.println("Account Constructor with parameters called");
        System.out.println("number: " + bankobject2.getNumber() + "\nbalance: " + bankobject2.getBalance() + "\nCustomerName: " + bankobject2.getCustomerName() + "\nCustomerPhone: " + bankobject2.getCustomerPhoneNumber());
        System.out.println();
        bankobject2.depositMoney(100.0);
        bankobject2.withdrawal(50.0);
        System.out.println();
        System.out.println("To String called \n" + bankobject2.toString());

        // TODO code application logic here
    }

}
