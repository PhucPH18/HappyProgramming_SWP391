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
public class Request {
    private int requestID;
    private int mentorID;
    private int menteeID;
    private Date date;
    private int status;
    private String link;
    private String title;
    private String content;
    private String username;
    private int mentorStatus;

    public Request() {
    }
    
    public Request(int requestID, int status, String title, String username) {
        this.requestID = requestID;
        this.status = status;
        this.title = title;
        this.username = username;
    }

    public Request(int requestID, int mentorID, int menteeID, Date date, int status, String link, String title, String content, String username, int mentorStatus) {
        this.requestID = requestID;
        this.mentorID = mentorID;
        this.menteeID = menteeID;
        this.date = date;
        this.status = status;
        this.link = link;
        this.title = title;
        this.content = content;
        this.username = username;
        this.mentorStatus = mentorStatus;
    }
    
    

    public Request(int requestID, int mentorID, int menteeID, Date date, int status, String link, String title, String content) {
        this.requestID = requestID;
        this.mentorID = mentorID;
        this.menteeID = menteeID;
        this.date = date;
        this.status = status;
        this.link = link;
        this.title = title;
        this.content = content;
    }

    public int getMentorStatus() {
        return mentorStatus;
    }

    public void setMentorStatus(int mentorStatus) {
        this.mentorStatus = mentorStatus;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getRequestID() {
        return requestID;
    }

    public void setRequestID(int requestID) {
        this.requestID = requestID;
    }

    public int getMentorID() {
        return mentorID;
    }

    public void setMentorID(int mentorID) {
        this.mentorID = mentorID;
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

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Request{" + "requestID=" + requestID + ", mentorID=" + mentorID + ", menteeID=" + menteeID + ", date=" + date + ", status=" + status + ", link=" + link + ", title=" + title + ", content=" + content + '}';
    }
    
    
}
