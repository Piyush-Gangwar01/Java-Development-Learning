/*  
        how to create thead and mulitple threads 
        --> by extends threads class 
        --> by interfaces

    => thread k pass run method hota hi hota h 

*/
class A extends Thread{  // this is a thread 
    public void run(){
        System.out.println(" this is class A ");
    }
}
class B extends Thread {
    public void run(){
        System.err.println(" this is class B");
    }
}
public class ThreadsCreation_using_Thread{
    
    public static void main(String[] args) {
        A obj1=new A();
        B obj2=new B();

        obj1.run();
        obj2.run();
        
    }
}
