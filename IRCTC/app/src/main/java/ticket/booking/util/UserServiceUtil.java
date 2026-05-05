package ticket.booking.util;

import org.mindrot.jbcrypt.BCrypt;

public class UserServiceUtil {

    public static String hashpassword(String plainpassword){
        return BCrypt.hashpw(plainpassword,BCrypt.gensalt()); // iska mtlb h plain pass ko hashed pass m convert kr do ($2a$10$3fhsjd) jo esa dikhta h
    }

    // password ko check krne k liye
    public static boolean checkpassword(String plainpassword , String hashpassword){
        return BCrypt.checkpw(plainpassword, hashpassword);
    }
}
