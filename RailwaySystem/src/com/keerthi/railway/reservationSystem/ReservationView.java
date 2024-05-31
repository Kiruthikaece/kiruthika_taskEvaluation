package com.keerthi.railway.reservationSystem;

import java.util.Scanner;

import com.keerthi.railway.model.Passanger;

public class ReservationView {

    Scanner sc=new Scanner(System.in);

    private ReservationModel reservationModel;
    
    public ReservationView() {
        reservationModel=new ReservationModel(this);
    }

    public void booking() {

        System.out.println("Enter Train id:");
        int id=sc.nextInt();
        System.out.println("Enter number of passanger:");
        int n=sc.nextInt();   
        for(int i=0;i<n;i++) {
            Passanger passanger=new Passanger();
            System.out.println("Enter name:");
            passanger.setName(sc.nextLine());
            System.out.println("Enter Age:");
            passanger.setAge(sc.nextInt());
            System.out.println("Enter Gender:");
            passanger.setGender(sc.next());
            passanger.setTrainNo(id);
            reservationModel.validatePassanger(passanger);
        }

    }

    public void showMessage(String message) {
       System.out.println(message);
    }

    public void getStatus() {
       
        //throw new UnsupportedOperationException("Unimplemented method 'getStatus'");
    }

    public void Showbooking() {
        //throw new UnsupportedOperationException("Unimplemented method 'Showbooking'");
    }
    
}
