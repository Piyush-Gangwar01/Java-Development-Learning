/*
        Race Condition -> When two thread try to get same resource at same time it create a problem called race conditon.

        --> to prevent this use Synchronization.

*/

class A{
    int count;
    public synchronized void increment(){ // used synchronized to prevent 
        count++;
    }
}

public class Race_Condition {
    public static void main(String[] args) throws Exception {

        A a=new A();

        Runnable obj1=()->{
            for(int i=1;i<1000;i++){
                a.increment();
            }
        };

        Runnable obj2=()->{
            for(int i=1;i<1000;i++){
                a.increment();
            }
        };

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join(); 

        System.out.println(a.count);
    }
}