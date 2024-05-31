package com.keerthi.railway.login;

import java.util.Scanner;

import com.keerthi.railway.model.Credential;
import com.keerthi.railway.reservationSystem.ReservationView;
import com.keerthi.railway.trainmanagement.TrainManagementView;

public class LoginView {

   private LoginModel loginModel;
   Scanner sc=new Scanner(System.in);

    public LoginView() {
        loginModel=new LoginModel(this);
    }

    public void createSetUp() {
        System.out.println("-------------------------------------");
        System.out.println("Welcome to Indian Railway System");
        System.out.println("-------------------------------------");
        initalSetUp();
    }
    public void initalSetUp() {
        while(true) {
            System.out.println("\n1-Login \n2-skip");
            System.out.println("Enter choice:");
            int choice=sc.nextInt();
            switch(choice) {
                case 1: createLogin();
                        break;
                case 2: return;
                default:return;
            }
        }
    }

    public  void createLogin() {
        Credential credential=new Credential();
        System.out.println("Enter username:");
        credential.setUserName(sc.next());
        System.out.println("Enter Password:");
        credential.setPassword(sc.next());
        loginModel.validateCredential(credential);
    }

    // public void createSignUp() {
    //     Credential credential=new Credential();
    //     System.out.println("Enter name:");
    //     credential.setName(sc.next());
    //     System.out.println("Enter Email:");
    //     credential.setEmail(sc.next());
    //     System.out.println("Enter username:");
    //     credential.setUserName(sc.next());
    //     System.out.println("Enter Password:");
    //     credential.setPassword(sc.next());
    //     loginModel.validateSignUp(credential);
    // }

    public void showMessage(String message) {
        System.out.println(message);
    }

    public void showAdminMenu() {
        while(true) {
            System.out.println("\n1-Add Trian \n 2-List Train \n3-Go-back");
            System.out.println("Enter choice:");
            int choice=sc.nextInt();
            switch(choice) {
                case 1: new TrainManagementView().addTrain();
                        break;
                case 2: new TrainManagementView().ListTain();;
                        break;
                case 3: return;
                default:return;
            }
        }
    }

    public void showUserMenu() {
      while(true) {
        System.out.println("\n1-Booking \n2-Get PNR status \n3-Booked Tickets \n6-List Train \n7-Goback");
        System.out.println("Enter choice:");
        int choice=sc.nextInt();
        switch(choice) {
            case 1: new ReservationView().booking();
                    break;
            case 2: new ReservationView().getStatus();
                    break;
            case 3: new ReservationView().Showbooking();
                    break;
            case 6:new TrainManagementView().ListTain();;
                   break;
        }
    
    }
       
    }

  //\n4-cancel Tickets \n5-search  


    
}
 