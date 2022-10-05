/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author DELL
 */
public class RequestSkill {
    private int requestSkillID;
    private int requestID;
    private int skillID;

    public RequestSkill() {
    }

    public RequestSkill(int requestSkillID, int requestID, int skillID) {
        this.requestSkillID = requestSkillID;
        this.requestID = requestID;
        this.skillID = skillID;
    }

    public int getRequestSkillID() {
        return requestSkillID;
    }

    public void setRequestSkillID(int requestSkillID) {
        this.requestSkillID = requestSkillID;
    }

    public int getRequestID() {
        return requestID;
    }

    public void setRequestID(int requestID) {
        this.requestID = requestID;
    }

    public int getSkillID() {
        return skillID;
    }

    public void setSkillID(int skillID) {
        this.skillID = skillID;
    }

    @Override
    public String toString() {
        return "RequestSkill{" + "requestSkillID=" + requestSkillID + ", requestID=" + requestID + ", skillID=" + skillID + '}';
    }
    
    
}
