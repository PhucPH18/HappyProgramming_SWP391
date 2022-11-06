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
    private String linkedIn;
    private String gitHub;
    private String profession;

    public MentorProfile() {
    }

    public MentorProfile(int mentorID, int userID, String avatar, String introduction, String linkedIn, String gitHub, String profession) {
        this.mentorID = mentorID;
        this.userID = userID;
        this.avatar = avatar;
        this.introduction = introduction;
        this.linkedIn = linkedIn;
        this.gitHub = gitHub;
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
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    public String getGitHub() {
        return gitHub;
    }

    public void setGitHub(String gitHub) {
        this.gitHub = gitHub;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "MentorProfile{" + "mentorID=" + mentorID + ", userID=" + userID + ", avatar=" + avatar + ", introduction=" + introduction + ", linkedIn=" + linkedIn + ", gitHub=" + gitHub + ", profession=" + profession + '}';
    }
    
}
