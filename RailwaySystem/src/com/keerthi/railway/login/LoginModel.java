package com.keerthi.railway.login;

import com.keerthi.railway.datalayer.FileManager;
import com.keerthi.railway.model.Credential;

public class LoginModel {

    private LoginView loginView;

    public LoginModel(LoginView loginView) {
        this.loginView=loginView;
    }

    public void validateCredential(Credential credential) {
        if(FileManager.getInstance().checkLogin(credential)) {
            if(isAdminLogin(credential))  {
                System.out.println("added2222");
                loginView.showMessage("Admin Login Successfull");
                loginView.showAdminMenu();
            }   
            else {
                loginView.showMessage("Login Successfull");
                loginView.showUserMenu();
            }
            
           
        }
        else
        loginView.showMessage("Invalid user");
    }

  

    public boolean isAdminLogin(Credential credential) {
        System.out.println("added111"+ credential.getUserName());
        return credential.getUserName().equals("admin");
    }

    // public void validateSignUp(Credential credential) {
    //     if(FileManager.getInstance().checkSignUp(credential)) {
    //         loginView.showMessage("SignUp Successfull");
    //     }
    // }
    
}
