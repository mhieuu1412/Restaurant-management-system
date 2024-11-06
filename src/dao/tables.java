/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author MY PC
 */
public class tables {
    public static void main(String[] args){
        try{
            String userTable = "create table user(id int AUTO_INCREMENT PRIMARY KEY,name VARCHAR(200),email VARCHAR(200) UNIQUE,mobileNumber VARCHAR(200),address VARCHAR(200),password VARCHAR(200),securityQuestion VARCHAR(200),answer VARCHAR(200),status VARCHAR(20))";
            String adminDetails = "insert into user(name, email, mobileNumber, address, password, securityQuestion,answer,status) values('Admin', 'admin@gmail.com', '1234567890', 'Vietnam', 'admin', 'Bạn đang học ở đâu', 'ABC', 'true')";
            DbOperation.setDataOrDelete(userTable, "Tạo bảng người dùng thành công!");
            DbOperation.setDataOrDelete(adminDetails, "Thêm quản trị viên thành công!");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}