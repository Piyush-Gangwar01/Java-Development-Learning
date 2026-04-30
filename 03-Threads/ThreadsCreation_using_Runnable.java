class A implements Runnable{           
    public void run(){
        System.out.println(" this is class A ");
    }
}
class B implements Runnable{
    public void run(){
        System.out.println(" this is class B ");
    }
}

public class ThreadsCreation_using_Runnable {
    public static void main(String[] args) {
        

        // to start a thread we have to make threads of those class 
        Runnable obj1=new A();
        Runnable obj2=new B();

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        t1.start(); // as normal runnable 
        t2.start();



        // we can do using lambda expression also so that we dont have to make class to run a thread. 
        // bcoz runable is a inteface and we cant make obj a interface 
        // Runnable is a functional class means we can use lamba

        Runnable obj1 =()->{
            for(int i=1;i<10;i++){
                System.out.println(" this is class A ");
            }

        };

        Runnable obj2=()->{
            for(int i=1;i<10;i++){
                System.out.println(" this is class B ");
            }
        };

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        t1.start(); 
        t2.start();



    }
}
