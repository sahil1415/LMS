package com.sahil.Model;

public class User {
    private int user_Id;
    private String user_Name;
    public boolean user_Exist;

    public User(int user_Id, String user_Name, boolean user_Exist){
        this.user_Id = user_Id;
        this.user_Name = user_Name;
        this.user_Exist = user_Exist;
    }

    public int getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(int user_Id) {
        this.user_Id = user_Id;
    }

    public String getUser_Name() {
        return user_Name;
    }

    public void setUser_Name(String user_Name) {
        this.user_Name = user_Name;
    }


    public boolean isUser_Exist() {
        return user_Exist;
    }

    public void setUser_Exist(boolean user_Exist) {
        this.user_Exist = user_Exist;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_Id=" + user_Id +
                ", user_Name='" + user_Name + '\'' +
                ", user_Exist=" + user_Exist +
                '}';
    }
}
