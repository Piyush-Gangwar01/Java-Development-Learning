class A{
    public void show(){
        System.out.println(" this is show"); // if we want to change i  show then we have to create new class 
    }
}
public class Anonymous_Inner_Class {
    public static void main(String[] args) {
        A obj=new A(){
            public void show(){
                System.out.println(" this is new show"); // change here ( this is called Anonymous Class) 
            }
        };
        obj.show();
    }
}


/*
    An Anonymous Class (Anonymous Inner Class) is a class without a name that is declared and instantiated at the same time. 
    It is used when you need to override a method of a class or interface only once.

        --> Key Idea
        No class name
        Created inside another class or method
        Used for one-time use
*/
