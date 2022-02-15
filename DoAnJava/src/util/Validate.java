package util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
   // static String VALIDATEPHONE = "(84|0[3|5|7|8|9])+([0-9]{8})\b";
     public static boolean validateNumberPhone(String phone) {
        final Pattern VALIDATEPHONE = Pattern.compile("(03|05|07|08|09|01[2|6|8|9])+([0-9]{8})");
        Matcher matcher = VALIDATEPHONE.matcher(phone);
        return matcher.find();
    }
}
