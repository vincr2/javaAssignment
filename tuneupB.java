import java.util.Scanner;

public class tuneupB {
    public static void main(String args[]){
        Scanner ic = new Scanner(System.in);
        int date ; //variable to store number of the day

        System.out.println("Enter an integer: ");
        while(!ic.hasNextInt()){
            System.out.print("Error!. Please input an integer.");
            System.exit(0);}
        date = ic.nextInt();
        while(date < 0 || date >=7){                                        //input cannot exceed or equal to 7
            System.out.println("Invalad input. Please enter a value from 0-6");
            System.exit(0);
        }

        switch (date){             // test the date
            case 0:System.out.println("Sunday"); //0 for sunday
                break;
            case 1:System.out.println("Monday");  //1 for monday
                break;
            case 2:
                System.out.println("Tuesday");     //2 for tuesday
                break;
            case 3:
                System.out.println("Wednesday");    //3 for wednesday
                break;
            case 4:
                System.out.println("Thursday");     //4 for thurday
                break;
            case 5:
                System.out.println("Friday");       //5 for friday
                break;
            case 6:
                System.out.println("Saturday");      // 6 for sunday
                break;

        }}
    }
