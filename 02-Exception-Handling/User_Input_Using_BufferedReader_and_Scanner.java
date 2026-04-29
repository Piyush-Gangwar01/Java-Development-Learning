/*
    pehle input lene k liye hume bufferreader a use krna pdta tha to take imput from user 

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class User_Input_Using_BufferedReader_and_Scanner {
    public static void main(String[] args) throws NumberFormatException, IOException {


        System.out.println(" enter a number :");
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader bf=new BufferedReader(ir); // yha value null hoti to iske liye inputStream ka use krte h 

        // bf value ko as a string read krta h so convert into integer
        int num=Integer.parseInt(bf.readLine());
        System.out.println(num);


        // but later after java 1.5 uske baad Scanner class ka use hone lga 

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(num);
        
    }
    
}
