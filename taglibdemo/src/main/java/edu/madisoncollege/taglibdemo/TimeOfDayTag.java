package edu.madisoncollege.taglibdemo;


import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.util.Calendar;

/**
 * Created by sarah on 9/14/2017.
 */
public class TimeOfDayTag extends SimpleTagSupport {
    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();

        JspWriter out = getJspContext().getOut();

        Calendar calendar = Calendar.getInstance();

        int hours = calendar.get(Calendar.HOUR_OF_DAY);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DATE);

        String message;

        if (hours < 12) {
            message = "Good Morning!";
        } else if (hours < 16 && hours >= 12) {
            message = "Good Afternoon!";
        } else if (hours < 21 && hours >= 17) {
            message = "Good Evening!";
        } else {
            message = "Good Night!";
        }

        if (month == 1 && day == 1) {
            message += " and Happy New Years!";
        } else if (month == 2 && day == 14) {
            message += " and Happy Valentine's Day!";
        } else if (month == 7 && day == 4) {
            message += " and Happy Independence Day!";
        } else if (month == 10 && day == 31) {
            message += " and Happy Halloween!";
        } else if (month == 12 && day == 25) {
            message += " and Merry Christmas!";
        }

        out.println(message);
    }
}
