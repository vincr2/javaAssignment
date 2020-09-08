import java.util.*;

public class tuneupA {
    public static void main(String args[]){
        Scanner usin = new Scanner(System.in);
        int fnum=0 ,snum= 0 ,tnum =0  ;  //variable to store 3 numbers

            try {
                System.out.println("Enter first number: ");
                fnum = usin.nextInt();
                System.out.println("Enter second number: ");
                snum = usin.nextInt();
                System.out.println("Enter third number: ");
                tnum = usin.nextInt();

            }catch (Exception e){
            System.out.print("Error! ");
            System.exit(0);
        }

        if(fnum <= snum && fnum <= tnum)
            System.out.println(fnum);
        else if(snum < fnum && snum < tnum)
            System.out.println(snum);
        else
            System.out.println(tnum);
    }
}