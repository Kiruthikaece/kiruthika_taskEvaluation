package com.keerthi.railway.reservationSystem;

import com.keerthi.railway.datalayer.FileManager;
import com.keerthi.railway.model.Passanger;

public class ReservationModel {

    private ReservationView reservationView;
    public ReservationModel(ReservationView reservationView) {
        reservationView=this.reservationView;
    }

    public void validatePassanger(Passanger passanger) {
        if(FileManager.getInstance().addPassanger(passanger))
        reservationView.showMessage("Ticket Booked successfully");
        else
        reservationView.showMessage("Train Not avilable");
    }

    
}
