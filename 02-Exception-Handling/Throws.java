/* 
        throws in Java is a keyword used in a method declaration to indicate that the method may cause an exception.

        It tells the compiler and the calling method that this method might throw an exception, so it must be handled.              
*/

class A{
    void show() throws ArithmeticException{       // throws ka use kiya h to tell yha per airthmatic exception aa skta hai 
        int i = 18/0;
        System.out.println("this is throw exception");
    }
}

public class Throws {
    public static void main(String[] args) {

        A obj = new A();

        try{
            obj.show();
        }
        catch(ArithmeticException e){
            System.out.println("Exception handled: " + e);
            e.printStackTrace(); // use to see stack of call and see kaha par error aa rha hai
        }
    }
}
