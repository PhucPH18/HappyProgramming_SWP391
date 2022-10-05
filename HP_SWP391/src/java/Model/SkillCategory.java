/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author DELL
 */
public class SkillCategory {
    private int skillID;
    private String skillName;
    private boolean status;

    public SkillCategory() {
    }

    public SkillCategory(int skillID, String skillName, boolean status) {
        this.skillID = skillID;
        this.skillName = skillName;
        this.status = status;
    }

    public int getSkillID() {
        return skillID;
    }

    public void setSkillID(int skillID) {
        this.skillID = skillID;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "SkillCategory{" + "skillID=" + skillID + ", skillName=" + skillName + ", status=" + status + '}';
    }
    
    
}
