package model;

public class User {

    private int userId;
    private String userEmail;
    private String userPassword;
    private int userRole;
    private String username;
    private String userFullName;
    private double userWallet;
    private String userAvatar;
    private String userStory;
    private int userRank;
    private int userScore;
    private java.sql.Timestamp userCreateDate;
    private String userSex;
    private boolean userActiveStatus;

    // Constructor
    public User(int userId, String userEmail, String userPassword, int userRole, String username, String userFullName,
            double userWallet, String userAvatar, String userStory, int userRank, int userScore,
            java.sql.Timestamp userCreateDate, String userSex, boolean userActiveStatus) {
        this.userId = userId;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userRole = userRole;
        this.username = username;
        this.userFullName = userFullName;
        this.userWallet = userWallet;
        this.userAvatar = userAvatar;
        this.userStory = userStory;
        this.userRank = userRank;
        this.userScore = userScore;
        this.userCreateDate = userCreateDate;
        this.userSex = userSex;
        this.userActiveStatus = userActiveStatus;
    }

    // Getters and Setters
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public int getUserRole() {
        return userRole;
    }

    public void setUserRole(int userRole) {
        this.userRole = userRole;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserFullName() {
        return userFullName;
    }

    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    public double getUserWallet() {
        return userWallet;
    }

    public void setUserWallet(double userWallet) {
        this.userWallet = userWallet;
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }

    public String getUserStory() {
        return userStory;
    }

    public void setUserStory(String userStory) {
        this.userStory = userStory;
    }

    public int getUserRank() {
        return userRank;
    }

    public void setUserRank(int userRank) {
        this.userRank = userRank;
    }

    public int getUserScore() {
        return userScore;
    }

    public void setUserScore(int userScore) {
        this.userScore = userScore;
    }

    public java.sql.Timestamp getUserCreateDate() {
        return userCreateDate;
    }

    public void setUserCreateDate(java.sql.Timestamp userCreateDate) {
        this.userCreateDate = userCreateDate;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public boolean isUserActiveStatus() {
        return userActiveStatus;
    }

    public void setUserActiveStatus(boolean userActiveStatus) {
        this.userActiveStatus = userActiveStatus;
    }
}
