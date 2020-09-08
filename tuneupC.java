
import java.util.Scanner;   //to get user input
import java.text.DecimalFormat; //to decide how many numers to show after decimal point

public class tuneupC {
    public static void main(String args[]){
        Scanner ic = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat("#.00");
        double dur;      //variable to put duration the car was parked
        double tpc = 0;  //variable to put the initial parking charge
        System.out.println("       car   =  PHP20.00");   //type of vehicles
        System.out.println("       bus   =  PHP35.00");   //   to choose
        System.out.println("       truck =  PHP50.00");   //       froM

        System.out.println("Enter vehicle type: ");
        char A = ic.next().charAt(0);   //stores the vehicle type in variable A


        System.out.println("Parking duration(hrs):  ");
        dur = ic.nextDouble();  //stores the parking duration

        if (A == 'c'){       // if vehicle type = c then
            tpc=dur*20;      //   duration x20  or if
        }else if(A == 'b'){  //  it is vehicle type b
            tpc=dur*35;     //   then duration x35
        }                   //      OR
        else if(A == 't'){                //   vehicle type b
            tpc=dur*50;      //   duration x50
        }

        System.out.println("TotalParkingCharge:  PHP"+fmt.format(tpc));
    }
}