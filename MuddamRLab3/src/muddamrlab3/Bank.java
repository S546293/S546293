/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package muddamrlab3;

/**
 *
 * @author S546293
 */
public class Bank {

    private int number;
    private double balance;
    private String customerName;
    private String customerPhoneNumber;

    /**
     *
     * @param number
     * @param balance
     * @param customerName
     * @param customerPhoneNumber
     */
    public Bank(int number, double balance, String customerName, String customerPhoneNumber) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    /**
     * Default constructor
     */
    public Bank() {
        System.out.println("Empty Constructor Called");
    }

    /**
     *
     * @param number
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     *
     * @param balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     *
     * @param customerName
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     *
     * @param customerPhoneNumber
     */
    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    /**
     *
     * @return int
     */
    public int getNumber() {
        return number;
    }

    /**
     *
     * @return double
     */
    public double getBalance() {
        return balance;
    }

    /**
     *
     * @return String
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     *
     * @return String
     */
    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    /**
     *
     * @param depositAmount
     */
    public void depositMoney(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New Balance is " + this.balance);
    }

    /**
     *
     * @param withdrawalAmount
     */
    public void withdrawal(double withdrawalAmount) {

        this.balance -= withdrawalAmount;
        System.out.println("withdrawal of " + withdrawalAmount + " processed, Remaining balance = " + this.balance);
    }

    @Override
    public String toString() {
        return "Account{" + "number=" + number + ", balance=" + balance + ", customerName=" + customerName + ", customerPhoneNumber=" + customerPhoneNumber + '}';
    }

}
