/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author DELL
 */
public class MentorProfile {
    private int mentorID;
    private int userID;
    private String avatar;
    private String introduction;
    private String LinkedIn;
    private String GitHub;
    private String profession;
    

    public MentorProfile() {
    }

    public MentorProfile(int mentorID, int userID, String avatar, String introduction, String LinkedIn, String GitHub,String profession) {
        this.mentorID = mentorID;
        this.userID = userID;
        this.avatar = avatar;
        this.introduction = introduction;
        this.LinkedIn = LinkedIn;
        this.GitHub = GitHub;
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getMentorID() {
        return mentorID;
    }

    public void setMentorID(int mentorID) {
        this.mentorID = mentorID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getLinkedIn() {
        return LinkedIn;
    }

    public void setLinkedIn(String LinkedIn) {
        this.LinkedIn = LinkedIn;
    }

    public String getGitHub() {
        return GitHub;
    }

    public void setGitHub(String GitHub) {
        this.GitHub = GitHub;
    }

    @Override
    public String toString() {
        return "MentorProfile{" + "mentorID=" + mentorID + ", userID=" + userID + ", avatar=" + avatar + ", introduction=" + introduction + ", LinkedIn=" + LinkedIn + ", GitHub=" + GitHub + ", profession=" + profession + '}';
    }

    
    
}
