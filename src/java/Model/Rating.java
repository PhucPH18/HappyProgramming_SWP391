/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author DELL
 */
public class Rating {
    private int rateID;
    private String comment;
    private int star;
    private int menteeID;
    private int mentorID;

    public Rating() {
    }

    public Rating(int rateID, String comment, int star, int menteeID, int mentorID) {
        this.rateID = rateID;
        this.comment = comment;
        this.star = star;
        this.menteeID = menteeID;
        this.mentorID = mentorID;
    }

    public int getRateID() {
        return rateID;
    }

    public void setRateID(int rateID) {
        this.rateID = rateID;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
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

    @Override
    public String toString() {
        return "Rating{" + "rateID=" + rateID + ", comment=" + comment + ", star=" + star + ", menteeID=" + menteeID + ", mentorID=" + mentorID + '}';
    }
    
    
}
