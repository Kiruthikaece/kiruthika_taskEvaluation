import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LiftSystem {

    Scanner sc=new Scanner(System.in);

    List<Lift> lift=new ArrayList<>();


    public LiftSystem() {
        addInitial();
    }
    public void addInitial() {
        for (int i = 0; i < 5; i++) {
            lift.add(new Lift(0, 10));
        }
    }

    public void displayPosition() {
       System.out.println("Lift:"+" "+"L1"+" "+"L2"+" "+"L3"+" "+"L4"+" "+"L5");
       System.out.print("FLoor:");
       for(int i=0;i<5;i++)
       System.out.print(lift.get(i).getFloor_no()+"  ");
    }

   public void assignLift() {
       System.out.println("Enter current floor:");
       int current_floor=sc.nextInt();
       System.out.println("Enter Designation floor:");
       int designation_floor=sc.nextInt();
       System.out.println("Enter passanger:");
       int passanger=sc.nextInt();

       if((lift.get(0).getFloor_no()==0 || isnear(current_floor,lift.get(0).getFloor_no()))  && (designation_floor>=0 && designation_floor<=5) && passanger<=10 && isValid(0)) {
        lift.get(0).setFloor_no(designation_floor);
        System.out.println("L1 is assigned");
       }
    
       else if((lift.get(1).getFloor_no()==0||isnear(current_floor,lift.get(1).getFloor_no())) && (designation_floor>=0 && designation_floor<=5) && passanger<=10 && isValid(0)) {
        lift.get(1).setFloor_no(designation_floor);
        System.out.println("L2 is assigned");
       }
       else if((lift.get(2).getFloor_no()==0 ||isnear(current_floor,lift.get(2).getFloor_no())) && (designation_floor==0 || designation_floor>=6 && designation_floor<=10) && passanger<=10 && isValid(0)) {
        lift.get(2).setFloor_no(designation_floor);
        System.out.println("L3 is assigned");
       }
       else if((lift.get(3).getFloor_no()==0 || isnear(current_floor,lift.get(3).getFloor_no())) && (designation_floor==0 || designation_floor>=6 && designation_floor<=10) && passanger<=10 && isValid(0)) {
        lift.get(3).setFloor_no(designation_floor);
        System.out.println("L4 is assigned");
       }
       else if(isValid(0)){
        lift.get(4).setFloor_no(designation_floor);
        System.out.println("L5 is assigned");
       }
       else
       System.out.println("Not assigned lift");
    }

    private boolean isValid(int index) {
        return lift.get(index).getFloor_no()!=-1;
        
}
    private boolean isnear(int current_floor, int lift_current) {
        return current_floor-1==lift_current || current_floor+1==lift_current;
    }

    
    
}
