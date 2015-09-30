package com.vani;

import java.util.Calendar;
import java.util.Locale;

import javax.ws.rs.Path;

import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Service;

@Service("timeService2")
@Path("/time2")
public class TimeService2 {
    public String getDateTime()
    {
        DateFormatter formatter = new DateFormatter("dd/MM/yyyy hh:mm:ss");
        String str = formatter.print(Calendar.getInstance().getTime(), Locale.getDefault());
        System.out.println(str);
        return str;
    }
}