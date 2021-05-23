import java.util.*;
import java.util.Scanner;
import java.lang.*;

public class Div{

    public static int divide(int num, int deno){

        int sign = ((num < 0) ^ (deno < 0)) ? -1 : 1;

        int res = 0;
        
        num = Math.abs(num);
        deno = Math.abs(deno);

        while(num >= deno){

            num -= deno;
            ++res;
        }
        return sign*res;

    }  

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();

        System.out.println(divide(dividend, divisor));
    }
}