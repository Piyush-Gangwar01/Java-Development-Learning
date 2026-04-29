/* 
 throw-> to throw an exception 

 if khud a exception banana hai to uski class banani pdegi 

*/
class piyushException extends Exception{
    void show(){
        System.out.println("This is error in piyush Exception");
    }
}

class Throw{
    public static void main(String[] args) {

        int age = 15;

        try{
            if(age < 18){
                throw new piyushException();  // throw k sath apna exception bhi print krwa skte h
            }
        }
        catch(piyushException e){
            e.show();
        }
    }
}