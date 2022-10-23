
package Model;


public class MentorBySkill {
    private String avatar;
    private String fullName;
    private String intro;
    private boolean gender;
    private String email;
    private String gitHub;
    private int yearsOfExp;

    public MentorBySkill() {
    }
    
    public MentorBySkill(String avatar, String fullName, String intro, boolean gender, String email, String gitHub, int yearsOfExp) {
        this.avatar = avatar;
        this.fullName = fullName;
        this.intro = intro;
        this.gender = gender;
        this.email = email;
        this.gitHub = gitHub;
        this.yearsOfExp = yearsOfExp;
    }
    
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGitHub() {
        return gitHub;
    }

    public void setGitHub(String gitHub) {
        this.gitHub = gitHub;
    }

    public int getYearsOfExp() {
        return yearsOfExp;
    }

    public void setYearsOfExp(int yearsOfExp) {
        this.yearsOfExp = yearsOfExp;
    }
    
    
}
