package com.springboot.crud.resources.util;

import java.net.URLDecoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Urldecodifier {
	
	public static String decode(String s) {
		try {
		return URLDecoder.decode(s, "UTF-8");
		}
		catch (Exception e) {
		  return "";
		}
	}
	
	public static Date dateConverter(String s,Date date) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		return sdf.parse(s);
	}

}
