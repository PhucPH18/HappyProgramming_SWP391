/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author DELL
 */
public class MentorSkill {
    private int mentorSkillID;
    private int mentorID;
    private int skillID;
    private int yearOfExp;
    private String description;

    public MentorSkill() {
    }

    public MentorSkill(int mentorSkillID, int mentorID, int skillID, int yearOfExp, String description) {
        this.mentorSkillID = mentorSkillID;
        this.mentorID = mentorID;
        this.skillID = skillID;
        this.yearOfExp = yearOfExp;
        this.description = description;
    }

    public int getMentorSkillID() {
        return mentorSkillID;
    }

    public void setMentorSkillID(int mentorSkillID) {
        this.mentorSkillID = mentorSkillID;
    }

    public int getMentorID() {
        return mentorID;
    }

    public void setMentorID(int mentorID) {
        this.mentorID = mentorID;
    }

    public int getSkillID() {
        return skillID;
    }

    public void setSkillID(int skillID) {
        this.skillID = skillID;
    }

    public int getYearOfExp() {
        return yearOfExp;
    }

    public void setYearOfExp(int yearOfExp) {
        this.yearOfExp = yearOfExp;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "MentorSkill{" + "mentorSkillID=" + mentorSkillID + ", mentorID=" + mentorID + ", skillID=" + skillID + ", yearOfExp=" + yearOfExp + ", description=" + description + '}';
    }
    
    
}
