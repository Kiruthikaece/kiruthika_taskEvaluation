package com.keerthi.railway.datalayer;

import java.util.ArrayList;
import java.util.List;

import com.keerthi.railway.model.Credential;
import com.keerthi.railway.model.Passanger;
import com.keerthi.railway.model.Train;

public class FileManager {
    
    private static FileManager fileManager;

    List<Train> trainList=new ArrayList<>();
    List<Credential> userList=new ArrayList<>();
    List<Passanger> passangerList=new ArrayList<>();

    public static FileManager getInstance() {
        if(fileManager==null)
        fileManager=new FileManager();
       
        return fileManager;
    }


    public boolean checkLogin(Credential credential) {
        // boolean isUser=false;
        // for(Credential existUser:userList)
        // if(existUser.getUserName()==credential.getUserName()) {
        //     isUser=true;
        //    break;
        //  }
        //  if(isUser)
        //  return true;
        //  else
        //  return false;
        return true;
    }

    // public boolean checkSignUp(Credential credential) {
    //     boolean isNewUser=true;
    //      for(Credential existUser:userList)
    //      if(existUser.getUserName()==credential.getUserName()) {
    //         isNewUser=false;
    //        break;
    //      }
    //      if(isNewUser) {
    //         userList.add(credential);
    //         return true;
    //      }
    //      else
    //      return false;   
    // }

    public boolean addTrainInFile(Train train) {
         boolean isNewTrain=true;
         for(Train existtrain:trainList)
         if(existtrain.getTrainNo()==train.getTrainNo()) {
          isNewTrain=false;
           break;
         }
         if(isNewTrain) {
            trainList.add(train);
            return true;
         }
         else
         return false;   
    }


    public List<Train> getAllTrain() {
        return trainList;
    }


    public boolean addPassanger(Passanger passanger) {
       boolean isAvilable=false;
       for(Train existtrain:trainList)
       if(existtrain.getTrainNo()==passanger.getTrainNo()) {
        isAvilable=true;
       }
       if(isAvilable) {
            passangerList.add(passanger);
            return true;
       }
       return false;
    }
    
}
