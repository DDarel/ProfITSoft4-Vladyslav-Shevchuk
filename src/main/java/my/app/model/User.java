package my.app.model;

public class User {

    private int id;

    private String login;

    private String nickname;

    private String password;

    private ROLE role;

    public User() {
    }

    public User(int id, String login, String nickname ,String password, ROLE role) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.role = role;
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ROLE getRole() {
        return role;
    }

    public void setRole(ROLE role) {
        this.role = role;
    }

    public enum ROLE {
        USER, UNKNOWN, ERROR
    }
}
