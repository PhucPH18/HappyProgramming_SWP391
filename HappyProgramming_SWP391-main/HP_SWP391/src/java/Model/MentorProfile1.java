/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author MSI KATANA
 */
public class MentorProfile1 {
    int skillID;
    String skillName;
    String description;
    String yearsOfExp;
    boolean status;

    public MentorProfile1() {
    }

    public MentorProfile1(int skillID, String skillName, String description, String yearsOfExp, boolean status) {
        this.skillID = skillID;
        this.yearsOfExp = yearsOfExp;
        this.skillName = skillName;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getYearsOfExp() {
        return yearsOfExp;
    }

    public void setYearsOfExp(String yearsOfExp) {
        this.yearsOfExp = yearsOfExp;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "MentorProfile1{" + "skillID=" + skillID + ", skillName=" + skillName + ", description=" + description + ", yearsOfExp=" + yearsOfExp + ", status=" + status + '}';
    }

    
    
}
