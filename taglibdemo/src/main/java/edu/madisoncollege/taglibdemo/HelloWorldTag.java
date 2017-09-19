package edu.madisoncollege.taglibdemo;

import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;

/**
 * Created by sarah on 9/12/2017.
 */
public class HelloWorldTag extends SimpleTagSupport {
    @Override
     public void doTag() throws JspException, IOException {
        super.doTag();
        JspWriter out = getJspContext().getOut();
        out.println("Hello World");
    }
}
