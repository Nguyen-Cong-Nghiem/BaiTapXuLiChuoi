package kiemtrasodienthoai;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberPhone {
    private static final String NUMBERPHONE_REGEX="^[0-9]{2}-0[0-9]{9}$";

    public NumberPhone() {

    }

    private boolean check(String regex) {
        Pattern pattern = Pattern.compile(NUMBERPHONE_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
