import java.util.Scanner;

class LiftMain {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        LiftSystem ls=new LiftSystem();

        while(true) {
            System.out.println("\n1-Display position of lift \n2-Assign lift \n8-exit");
           System.out.println("Enter your choice:");
            int choice=sc.nextInt();
            switch(choice) {
                case 1:ls.displayPosition();
                        break;
               case 2:ls.assignLift();
                       break;
                case 8:return;
            }
        }

        
    }
}