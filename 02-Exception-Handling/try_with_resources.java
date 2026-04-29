/* 
        Try with resources ka mtlb hota h try k andar hi sb likha 

        in simple words - code ko short ya optimize krna 

        finally k andar code chelega hi chlega .
*/

import java.io.*;
public class try_with_resources {
    public static void main(String[] args) throws IOException {
        // without resources if we take input 
        
        int num=0;
        try{
            InputStreamReader ir=new InputStreamReader(System.in);
            BufferedReader bf=new BufferedReader(ir);
            num=Integer.parseInt(bf.readLine());
            System.out.println(num);

        }finally{
            bf.close();
        }


        // use with resouces 

        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){  // this automatically close buffer reader .
            num=Integer.parseInt(br.readLine());
            System.out.println(num);
        }
    }
}
