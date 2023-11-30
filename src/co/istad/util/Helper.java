package co.istad.util;

import java.util.regex.Pattern;

public class Helper {
    private static final String Email_Regex =
            "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    public static boolean isEmail( String email ){
        Pattern pattern = Pattern.compile(Email_Regex);
        if( pattern.matcher(email).matches() ) return true;
        return false;
    }
}
