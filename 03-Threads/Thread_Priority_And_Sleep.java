/* 
    -->Thread priortiy is used to  set the priority of a thread .
    --> Sleep is used to pause a task for some time and then resume .
    
*/

class A extends Thread{
    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println(" this is class A ");
            try{
            Thread.sleep(10);
            }catch(Exception e){
                System.out.println(e);
            }
        }
        
    }
}
class B extends Thread {
    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println(" this is class B ");
            try{
            Thread.sleep(10);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
public class Thread_Priority_And_Sleep {
    public static void main(String[] args) {
        
        A obj1=new A();
        B obj2=new B();
        // if  i want ki obj2 pehle run ho then priority set krdo which is from( 1- 10 ) 1-least && 10=highest.
        obj2.setPriority(9);
        obj1.run();
        obj2.run();

        // if i want ki pehle obj1 chale then obj2 then we use sleep 

        obj1.start(); // thread to run krane k liye start ka use krte h.
        try{
            Thread.sleep(5);
        }catch(Exception e){
            System.out.println(e);
        }
        obj2.start();
    }
    
}
