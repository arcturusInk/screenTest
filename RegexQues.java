package com.company;

/*Extract the value of the u2 parameter from this url using a regular expression.
http://www.example.com?u1=US&amp;u2=HA853&amp;u3=HPA*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQues {
    public static void main(String[] args) {
        String url = "http://www.example.com?u1=US&amp;u2=HA853&amp;u3=HPA";

        try {
            Pattern p = Pattern.compile("u2=([^&]+)");
            Matcher m = p.matcher(url);
            while (m.find()) {
                System.out.println(m.group(1));
            }
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}
