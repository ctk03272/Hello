package com.ctk0327.infrean;
import org.junit.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        Calendar c=new GregorianCalendar(Calendar.YEAR, Calendar.MONTH,
                Calendar.DAY_OF_MONTH);
        System.out.println("Hello world");
        double a=Math.random();
        EmailSender emailSender=new EmailSender("cc","bb");
        
        EmailSender emailSender3=new EmailSender("cc","cc");
        EmailSender emailSender2=new EmailSender("cc","cc");
        emailSender.setAddress("cc","bb");
    }
}
