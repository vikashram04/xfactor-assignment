import java.util.*;
import java.lang.Math;
import java.util.Scanner;

public class calangle {

   public static double calAngle(Integer h, Integer m) {


        //validate input..
        if (h < 0 || m < 0 || h > 12 || m > 60)
            System.out.println("Wrong input");


        Double angle = (0.5)*(60*h - 11*m);

        angle = Math.min(360 - angle, angle);

        if(angle < 0)
            return Math.abs(angle12);

        return angle;
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(calAngle(h, m));
    }

}