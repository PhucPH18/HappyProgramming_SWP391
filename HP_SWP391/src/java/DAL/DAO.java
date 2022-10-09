/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import java.util.*;
import Model.*;
import java.sql.*;
import java.sql.Date;

/**
 *
 * @author DELL
 */
public class DAO {

    private ArrayList<MentorProfile> mpList;
    private ArrayList<MentorSkill> msList;
    private ArrayList<Rating> ratingList;
    private ArrayList<Request> requestList;
    private ArrayList<RequestSkill> rsList;
    private ArrayList<SkillCategory> scList;
    private ArrayList<Transaction> tList;
    private ArrayList<User> uList;
    
    private String status;
    private Connection con;
    
    public DAO() {
        try {
            con = new DBContext().getConnection();
        } catch (Exception e) {
            status = "Error connection" + e.getMessage();
        }
    }
    
    public ArrayList<MentorProfile> getMentorProfile() {
        mpList = new ArrayList<>();
        String sql = "select *from MentorProfile";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                mpList.add(new MentorProfile(rs.getInt(1), rs.getInt(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getString(6)));
            }
        } catch (Exception e) {
            status = "Error at read Mentor Profile" + e.getMessage();
        }
        return mpList;
    }
    
    public ArrayList<MentorSkill> getMentorSkill() {
        msList = new ArrayList<>();
        String sql = "select *from MentorSkill";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                msList.add(new MentorSkill(rs.getInt(1), rs.getInt(2), rs.getInt(3),
                        rs.getInt(4), rs.getString(5)));
            }
        } catch (Exception e) {
            status = "Error at read Mentor Skill" + e.getMessage();
        }
        return msList;
    }
    
    public ArrayList<Rating> getRating() {
        ratingList = new ArrayList<>();
        String sql = "select *from Rating";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ratingList.add(new Rating(rs.getInt(1), rs.getString(2), rs.getInt(3),
                        rs.getInt(4), rs.getInt(5)));
            }
        } catch (Exception e) {
            status = "Error at read Rating" + e.getMessage();
        }
        return ratingList;
    }
    
    public ArrayList<Request> getRequest() {
        requestList = new ArrayList<>();
        String sql = "select *from Request";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                requestList.add(new Request(rs.getInt(1), rs.getInt(2), rs.getInt(3),
                        rs.getDate(4), rs.getInt(5), rs.getString(6),
                        rs.getString(7), rs.getString(8)));
            }
        } catch (Exception e) {
            status = "Error at read Request" + e.getMessage();
        }
        return requestList;
    }
    
    public ArrayList<RequestSkill> getRequestSkill() {
        rsList = new ArrayList<>();
        String sql = "select *from RequestSkill";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                rsList.add(new RequestSkill(rs.getInt(1), rs.getInt(2), rs.getInt(3)));
            }
        } catch (Exception e) {
            status = "Error at read Request Skill" + e.getMessage();
        }
        return rsList;
    }
    
    public ArrayList<SkillCategory> getSkillCategory() {
        scList = new ArrayList<>();
        String sql = "select *from SkillCategory";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                scList.add(new SkillCategory(rs.getInt(1), rs.getString(2), rs.getBoolean(3)));
            }
        } catch (Exception e) {
            status = "Error at read Skill Category" + e.getMessage();
        }
        return scList;
    }
    
    public ArrayList<Transaction> getTransaction() {
        tList = new ArrayList<>();
        String sql = "select *from Transaction";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                tList.add(new Transaction(rs.getInt(1), rs.getInt(2), rs.getInt(3),
                        rs.getDate(4), rs.getFloat(5), rs.getString(6)));
            }
        } catch (Exception e) {
            status = "Error at read Transaction" + e.getMessage();
        }
        return tList;
    }
    
    public ArrayList<User> getUser() {
        uList = new ArrayList<>();
        String sql = "select *from [User]";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                uList.add(new User(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getBoolean(5), rs.getString(6), rs.getString(7),
                        rs.getDate(8), rs.getString(9), rs.getBoolean(10), rs.getInt(11)));
            }
        } catch (Exception e) {
            status = "Error at read Users" + e.getMessage();
        }
        return uList;
    }
    
    public User login(String user, String pass) {
        String sql = "select * from [User] where username = ? and password = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, pass);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return new User(rs.getInt(1), 
                        rs.getString(2), 
                        rs.getString(3), 
                        rs.getString(4), 
                        rs.getBoolean(5), 
                        rs.getString(6), 
                        rs.getString(7), 
                        rs.getDate(8), 
                        rs.getString(9), 
                        rs.getBoolean(10), 
                        rs.getInt(11));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    
    public void CreateUser(int userID, String username, String password, String fullname,
            boolean gender, String phone, String email, Date dob, String address, boolean status, int role)
    {
        String sql = "insert into [User] values(?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, userID);
            ps.setString(2, username);
            ps.setString(3, password);
            ps.setString(4, fullname);
            ps.setBoolean(5, gender);
            ps.setString(6, phone);
            ps.setString(7, email);
            ps.setDate(8, dob);
            ps.setString(9, address);
            ps.setBoolean(10, status);
            ps.setInt(11, role);
            ps.execute();
        } catch (Exception e) {
            e.getMessage();
        }
    }
    
}
