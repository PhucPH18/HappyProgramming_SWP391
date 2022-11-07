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
public class MentorRegist {
    private int registID;
    private int menteeID;
    private Date date;
    private int status;

    public MentorRegist() {
    }

    public MentorRegist(int registID, int menteeID, Date date, int status) {
        this.registID = registID;
        this.menteeID = menteeID;
        this.date = date;
        this.status = status;
    }

    public int getRegistID() {
        return registID;
    }

    public void setRegistID(int registID) {
        this.registID = registID;
    }

    public int getMenteeID() {
        return menteeID;
    }

    public void setMenteeID(int menteeID) {
        this.menteeID = menteeID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "MentorRegist{" + "registID=" + registID + ", menteeID=" + menteeID + ", date=" + date + ", status=" + status + '}';
    }
    
    
}
