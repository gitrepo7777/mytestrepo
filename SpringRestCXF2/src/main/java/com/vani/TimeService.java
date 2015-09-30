package com.vani;

import java.util.Calendar;
import java.util.Locale;

import javax.ws.rs.Path;

import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Service("timeService")
@RequestMapping("/time")
public class TimeService {
	
	
	@RequestMapping(method=RequestMethod.GET)
    public @ResponseBody String getDateTime()
    {
        DateFormatter formatter = new DateFormatter("dd/MM/yyyy hh:mm:ss");
        String str = formatter.print(Calendar.getInstance().getTime(), Locale.getDefault());
        System.out.println(str);
        return str;
    }
}