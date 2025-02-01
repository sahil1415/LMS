package com.sahil.Model;

import java.sql.SQLOutput;

public class Admin extends User{

    public Admin(int admin_Id, String admin_Name, boolean admin_Exist){
        super(admin_Id, admin_Name, admin_Exist);
    }

    public void display_Info(){
        System.out.println("Admin Name - " + getUser_Name());
        System.out.println("Admin Id - " + getUser_Id());
    }
}
