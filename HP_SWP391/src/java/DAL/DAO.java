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
    private ArrayList<MentorBySkill> mbsList;
    private ArrayList<MentorRegist> mrList;

    private Connection con;
    private String status;

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
                        rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)));
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
                        rs.getString(7), rs.getString(8), rs.getInt(9)));
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

    public ArrayList<MentorRegist> getMentorRegist() {
        mrList = new ArrayList<>();
        String sql = "select *from MentorRegist";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                mrList.add(new MentorRegist(rs.getInt(1), rs.getInt(2), rs.getDate(3),
                        rs.getInt(4)));
            }
        } catch (Exception e) {
            status = "Error at read Mentor Regist" + e.getMessage();
        }
        return mrList;
    }

    public void CreateMentorRegist(int registID, int menteeID, Date date, int status) {
        String sql = "insert into MentorRegist values(?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, registID);
            ps.setInt(2, menteeID);
            ps.setDate(3, date);
            ps.setInt(4, status);
            ps.execute();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void updateMentorRegist(int registID, int menteeID, Date date, int status) {
        String sql = "Update MentorRegist\n"
                + "Set menteeID = ?, date = ?, status = ?\n"
                + "where registID = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, menteeID);
            ps.setDate(2, date);
            ps.setInt(3, status);
            ps.setInt(4, registID);
            ps.executeUpdate();
        } catch (Exception ex) {
        }
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
            boolean gender, String phone, String email, Date dob, String address, boolean status, int role) {
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

    public void VerifyUser(String username) {
        String sql = "update [User] set status = 1 where username = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.execute();
        } catch (Exception e) {
            status = "Error at VerifyUser " + e.getMessage();
        }
    }

    public ArrayList<Request> getRequestByID() {
        requestList = new ArrayList<>();
        String sql = "select a.requestID, a.status, a.title, b.username from Request a join [dbo].[User] b on menteeID=ID";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                requestList.add(new Request(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4)));
            }
        } catch (Exception e) {
            status = "Error at read Request" + e.getMessage();
        }
        return requestList;
    }

    public void finishRequest(int requestID) {
        String sql = "update Request set mentorStatus='3' where requestID = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, requestID);
            ps.executeUpdate();
        } catch (Exception e) {
            status = "Error at finish Request" + e.getMessage();
        }
    }

    public void approveRequest(String requestID) {
        String sql = "update Request set status='2', mentorStatus = '0' where requestID = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, requestID);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void denyRequest(String requestID) {
        String sql = "update Request set status='1', mentorStatus = '2' where requestID = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, requestID);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void acceptRequest(String requestID) {
        String sql = "update Request set mentorStatus='1' where requestID = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, requestID);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void rejectRequest(String requestID) {
        String sql = "update Request set mentorStatus='2' where requestID = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, requestID);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void insertSkillCategory(int skillID, String skillName, boolean status) {
        String sql = "insert  into SkillCategory\n"
                + "values(?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, skillID);
            ps.setString(2, skillName);
            ps.setBoolean(3, status);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void deleteSkill(int SkillID) {
        String sql = "Delete from SkillCategory where skillID = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, SkillID);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void updateSkill(int skillID, String skillName, boolean status) {
        String sql = "Update SkillCategory\n"
                + "Set skillName = ?, status = ?\n"
                + "where skillID = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, skillName);
            ps.setBoolean(2, status);
            ps.setInt(3, skillID);
            ps.executeUpdate();
        } catch (Exception ex) {
        }
    }

    public SkillCategory getSkillBySkillID(int skillID) {
        String sql = "select * from SkillCategory where skillID = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, skillID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SkillCategory skill = new SkillCategory(rs.getInt(1),
                        rs.getString(2), rs.getBoolean(3)
                );
                return skill;
            }
        } catch (Exception ex) {
        }
        return null;
    }

    public void deleteUser(int userID) {
        String sql = "Delete from [User] where ID = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, userID);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public boolean updatePassword(String newpass, String email) {
        String sql = "update [User] set password = ? where email = ? ";
        boolean updated = false;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, newpass.trim());
            ps.setString(2, email.trim());
            updated = ps.executeUpdate() > 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return updated;
    }

    public User checkEmailExist(String email) {
        String sql = "select * from [User] where email = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, email);
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

    public void CreateRequest(int requestID, int mentorID, int menteeID, Date date,
            int status, String link, String title, String content, int mentorStatus,
            int requestSkillID, int skillID) {
        String sql1 = "insert into Request values(?,?,?,?,?,?,?,?,?)";
        String sql2 = "insert into RequestSkill values(?,?,?)";
        try {
            PreparedStatement ps1 = con.prepareStatement(sql1);
            ps1.setInt(1, requestID);
            ps1.setInt(2, mentorID);
            ps1.setInt(3, menteeID);
            ps1.setDate(4, date);
            ps1.setInt(5, status);
            ps1.setString(6, link);
            ps1.setString(7, title);
            ps1.setString(8, content);
            ps1.setInt(9, mentorStatus);
            ps1.execute();

            PreparedStatement ps2 = con.prepareStatement(sql2);
            ps2.setInt(1, requestSkillID);
            ps2.setInt(2, requestID);
            ps2.setInt(3, skillID);
            ps2.execute();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void deleteRequest(int requestID) {
        String sql1 = "Delete from RequestSkill where requestID = ?";
        String sql2 = "Delete from Request where requestID = ?";
        try {
            PreparedStatement ps1 = con.prepareStatement(sql1);
            ps1.setInt(1, requestID);
            ps1.execute();

            PreparedStatement ps2 = con.prepareStatement(sql2);
            ps2.setInt(1, requestID);
            ps2.execute();
        } catch (Exception e) {
        }
    }

    public void updateRequestFromMentee(int requestID, String link, String title, String content,
            int skillID) {
        String sql1 = "Update Request set link = ?, title = ?, content = ? where"
                + " requestID = ?";
        String sql2 = "Update RequestSkill set skillID = ? where requestID = ?";
        try {
            PreparedStatement ps1 = con.prepareStatement(sql1);
            ps1.setString(1, link);
            ps1.setString(2, title);
            ps1.setString(3, content);
            ps1.setInt(4, requestID);
            ps1.executeUpdate();

            PreparedStatement ps2 = con.prepareStatement(sql2);
            ps2.setInt(1, skillID);
            ps2.setInt(2, requestID);
            ps2.executeUpdate();
        } catch (Exception ex) {
        }
    }

    public ArrayList<MentorBySkill> getMentorBySkill(String sID) {
        mbsList = new ArrayList<>();
        String sql = "select a.avatar, b.fullname, a.introduction, b.gender, b.email, a.GitHub, c.yearsOfExp\n"
                + "from MentorProfile a join [User] b on a.userID=b.ID\n"
                + "join MentorSkill c on a.mentorID = c.mentorID\n"
                + "join SkillCategory d on c.skillID=d.skillID \n"
                + "where d.skillID = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, sID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                mbsList.add(new MentorBySkill(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getBoolean(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7)));
            }
        } catch (Exception e) {
            status = "Error at read Skill Category" + e.getMessage();
        }
        return mbsList;
    }

    public User getUserByID(int id) {
        String sql = "select * from [User] where ID = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                User user = new User(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getBoolean(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getDate(8),
                        rs.getString(9),
                        rs.getBoolean(10),
                        rs.getInt(11)
                );
                return user;
            }
        } catch (Exception ex) {
        }
        return null;
    }

    public void updateUser(int userID, String username, String password, String fullname,
            boolean gender, String phone, String email, Date dob, String address, boolean status, int role) {
        String sql = "Update [User]\n"
                + "Set username = ?, password = ?,fullname =? ,gender=?,phone=?,email=?,dob=?,address=?,status=?,role=?\n"
                + "where ID = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, fullname);
            ps.setBoolean(4, gender);
            ps.setString(5, phone);
            ps.setString(6, email);
            ps.setDate(7, dob);
            ps.setString(8, address);
            ps.setBoolean(9, status);
            ps.setInt(10, role);
            ps.setInt(11, userID);
            ps.executeUpdate();
            ps.close();
        } catch (Exception ex) {
        }
    }

    public void updateUser(int userID, boolean status, int role) {
        String sql = "Update [User]\n"
                + "Set status=?,role=?\n"
                + "where ID = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setBoolean(1, status);
            ps.setInt(2, role);
            ps.setInt(3, userID);
            ps.executeUpdate();
            ps.close();
        } catch (Exception ex) {
        }
    }

    public void addRating(int id, String comment, int star, int menteeID, int mentorID) {
        String sql = "insert into Rating values (?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            DAO dao = new DAO();
            ArrayList<Rating> al = dao.getRating();
            id = al.size() + 1;
            ps.setInt(1, id);
            ps.setString(2, comment);
            ps.setInt(3, star);
            ps.setInt(4, menteeID);
            ps.setInt(5, mentorID);
            ps.execute();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Rating checkRatingExist(int menteeID, int mentorID) {
        String sql = "select * from Rating where menteeID = ? and mentorID = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, menteeID);
            ps.setInt(2, mentorID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return new Rating(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public void updateRating(int star, String comment, int menteeID, int mentorID) {
        String sql = "update Rating set comment = ?, star = ? where menteeID = ? and mentorID = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, comment);
            ps.setInt(2, star);
            ps.setInt(3, menteeID);
            ps.setInt(4, mentorID);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public MentorProfile getMentorByUID(int uid) {
        String query = "select * from MentorProfile\n" + " where userID = ?";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, uid);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return new MentorProfile(rs.getInt(1), rs.getInt(2),
                        rs.getString(3), rs.getString(4), rs.getString(5),
                        rs.getString(6), rs.getString(7));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public User getUserByMentorID(int mentorID) {
        String sql1 = "select * from MentorProfile where mentorID = ?";
        String sql2 = "select * from [User] where ID = ?";
        MentorProfile mp = new MentorProfile();
        try {
            PreparedStatement ps1 = con.prepareStatement(sql1);
            ps1.setInt(1, mentorID);
            ResultSet rs1 = ps1.executeQuery();
            while (rs1.next()) {
                mp = new MentorProfile(rs1.getInt(1), rs1.getInt(2),
                        rs1.getString(3), rs1.getString(4),
                        rs1.getString(5), rs1.getString(6), rs1.getString(7));
            }

            PreparedStatement ps2 = con.prepareStatement(sql2);
            ps2.setInt(2, mp.getUserID());
            ResultSet rs2 = ps2.executeQuery();
            while (rs2.next()) {
                return new User(rs2.getInt(1), rs2.getString(2), rs2.getString(3),
                        rs2.getString(4), rs2.getBoolean(5), rs2.getString(6), rs2.getString(7),
                        rs2.getDate(8), rs2.getString(9), rs2.getBoolean(10), rs2.getInt(11));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public int mentorOnGoingReq(int mentorID) {
        String sql = "select COUNT(mentorStatus) from Request where mentorStatus = 1 and mentorID = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, mentorID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            status = "Error at read Request" + e.getMessage();
        }
        return 0;
    }

    public int mentorCanceledReq(int mentorID) {
        String sql = "select COUNT(mentorStatus) from Request where mentorStatus = 2 and status != 1 and mentorID = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, mentorID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            status = "Error at read Request" + e.getMessage();
        }
        return 0;
    }

    public int mentorCompletedReq(int mentorID) {
        String sql = "select COUNT(mentorStatus) from Request where mentorStatus = 3 and mentorID = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, mentorID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            status = "Error at read Request" + e.getMessage();
        }
        return 0;
    }

    public int mentorTotalReq(int mentorID) {
        String sql = "select COUNT(mentorStatus) from Request where [status] = 2 and mentorID = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, mentorID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            status = "Error at read Request" + e.getMessage();
        }
        return 0;
    }

    public int menteeCompletedReq(int menteeID) {
        String sql = "select COUNT(mentorStatus) from Request where mentorStatus = 3 and menteeID = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, menteeID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            status = "Error at read Request" + e.getMessage();
        }
        return 0;
    }

    public int getTotalMentee() {
        String sql = "select COUNT(role) from [User] where [role] = 3 and [status] = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            status = "Error at read Request" + e.getMessage();
        }
        return 0;
    }

    public int getTotalMentor() {
        String sql = "select COUNT(role) from [User] where [role] = 2 and [status] = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            status = "Error at read Request" + e.getMessage();
        }
        return 0;
    }

    public int getTotalSkill() {
        String sql = "select COUNT(status) from SkillCategory where [status] = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            status = "Error at read Request" + e.getMessage();
        }
        return 0;
    }
    
    public int getPendingReq() {
        String sql = "select COUNT(status) from Request where [status] = 0";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            status = "Error at read Request" + e.getMessage();
        }
        return 0;
    }

    public int getAdDeniedReq() {
        String sql = "select COUNT(status) from Request where [status] = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            status = "Error at read Request" + e.getMessage();
        }
        return 0;
    }

    public int getIPReq() {
        String sql = "select COUNT(mentorStatus) from Request where mentorStatus = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            status = "Error at read Request" + e.getMessage();
        }
        return 0;
    }

    public int getCompletedReq() {
        String sql = "select COUNT(mentorStatus) from Request where mentorStatus = 3";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            status = "Error at read Request" + e.getMessage();
        }
        return 0;
    }

    public int getAdTotalReq() {
        String sql = "select COUNT(status) from Request";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            status = "Error at read Request" + e.getMessage();
        }
        return 0;
    }

    public int getTotalAcc() {
        String sql = "select COUNT(status) from [User]";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            status = "Error at read Request" + e.getMessage();
        }
        return 0;
    }

    public int getActiveAcc() {
        String sql = "select COUNT(status) from [User] where [status] = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            status = "Error at read Request" + e.getMessage();
        }
        return 0;
    }

    public int getDashSkill() {
        String sql = "select COUNT(status) from SkillCategory";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            status = "Error at read Request" + e.getMessage();
        }
        return 0;
    }

    public int getActiveSkill() {
        String sql = "select COUNT(status) from SkillCategory where [status] = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            status = "Error at read Request" + e.getMessage();
        }
        return 0;
    }

    public User checkOldPassword(int uID, String pass) {
        String sql = "select * from [User] where ID = ? and password = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, uID);
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
            status = "Error at getting User" + e.getMessage();
        }
        return null;
    }

    public boolean updateNewPassword(String newpass, int uid) {
        String sql = "update [User] set password = ? where ID = ? ";
        boolean updated = false;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, newpass.trim());
            ps.setInt(2, uid);
            updated = ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return updated;
    }

    public void addCV(int mentorID, int uid, String avatar, String prof, String intro,
            String lnkedin, String github) {
        String sql = "insert into MentorProfile values (?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, mentorID);
            ps.setInt(2, uid);
            ps.setString(3, avatar);
            ps.setString(4, prof);
            ps.setString(5, intro);
            ps.setString(6, lnkedin);
            ps.setString(7, github);
            ps.execute();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void updateCV(int mentorID, int uid, String avatar, String prof, String intro,
            String lnkedin, String github) {
        String sql = "update MentorProfile set userID = ?, avatar = ?, introduction = ?, LinkedIn = ?,"
                + "GitHub = ?, Profession  = ? where mentorID = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, uid);
            ps.setString(2, avatar);
            ps.setString(3, intro);
            ps.setString(4, lnkedin);
            ps.setString(5, github);
            ps.setString(6, prof);
            ps.setInt(7, mentorID);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void addMentorSkills(int msID, int mentorID, int skillID, int yoe, String desc) {
        String sql = "insert into MentorSkill values (?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, msID);
            ps.setInt(2, mentorID);
            ps.setInt(3, skillID);
            ps.setInt(4, yoe);
            ps.setString(5, desc);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void updateMentorSkill(int msID, int mentorID, int skillID, int yoe, String desc) {
        String sql = "update MentorSkill set mentorID = ?, skillID = ?, yearsOfExp = ?,"
                + " description = ? where mentorSkillID = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, mentorID);
            ps.setInt(2, skillID);
            ps.setInt(3, yoe);
            ps.setString(4, desc);
            ps.setInt(5, msID);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        DAO dao = new DAO();
        ArrayList<MentorSkill> msList = new ArrayList<>();
        for (MentorSkill m : dao.getMentorSkill()) {
            if (m.getMentorID() == 3) {
                msList.add(m);
            }
        }
        for (MentorSkill m : msList) {
            System.out.println(m);
        }
    }

    public void approveMentorRegist(int menteeID) {
        String sql1 = "update MentorRegist set status='2' where menteeID = ?";
        String sql2 = "update [User] set role='2' where ID = ?";
        try {
            PreparedStatement ps1 = con.prepareStatement(sql1);
            ps1.setInt(1, menteeID);
            ps1.executeUpdate();

            PreparedStatement ps2 = con.prepareStatement(sql2);
            ps2.setInt(1, menteeID);
            ps2.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void rejectMentorRegist(int menteeID) {
        String sql1 = "update MentorRegist set status='1' where menteeID = ?";
        String sql2 = "update [User] set role='3' where ID = ?";
        try {
            PreparedStatement ps1 = con.prepareStatement(sql1);
            ps1.setInt(1, menteeID);
            ps1.executeUpdate();

            PreparedStatement ps2 = con.prepareStatement(sql2);
            ps2.setInt(1, menteeID);
            ps2.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public void deleteRating(int rateID) {
        String sql = "Delete from Rating where rateID = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, rateID);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
}
