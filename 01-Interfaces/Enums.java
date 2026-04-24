/* In Java, Enums (Enumerations) are used to define a fixed set of constants.

Simple Definition
     An enum is a special type used to store a group of constant values.
 */


enum Days{
    Monday  , Tuesday , Wednesday ,Thursday , friday , saturday;  // they all are objects 
}
public class Enums {
    public static void main(String[] args) {
        Days today=Days.Monday;
        System.out.println(today); 

        // print all enums with 
        Days day[]=Days.values();
        for( Days d : day){
            System.out.println(d +":"+d.ordinal()); // .ordinal() => to show the object number 
        }
    }
}
