/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Date;

/**
 *
 * @author DELL
 */
public class Transaction {
    private int transID;
    private int menteeID;
    private int mentorID;
    private Date date;
    private float amount;
    private String method;

    public Transaction() {
    }

    public Transaction(int transID, int menteeID, int mentorID, Date date, float amount, String method) {
        this.transID = transID;
        this.menteeID = menteeID;
        this.mentorID = mentorID;
        this.date = date;
        this.amount = amount;
        this.method = method;
    }

    public int getTransID() {
        return transID;
    }

    public void setTransID(int transID) {
        this.transID = transID;
    }

    public int getMenteeID() {
        return menteeID;
    }

    public void setMenteeID(int menteeID) {
        this.menteeID = menteeID;
    }

    public int getMentorID() {
        return mentorID;
    }

    public void setMentorID(int mentorID) {
        this.mentorID = mentorID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    @Override
    public String toString() {
        return "Transaction{" + "transID=" + transID + ", menteeID=" + menteeID + ", mentorID=" + mentorID + ", date=" + date + ", amount=" + amount + ", method=" + method + '}';
    }
    
    
}
