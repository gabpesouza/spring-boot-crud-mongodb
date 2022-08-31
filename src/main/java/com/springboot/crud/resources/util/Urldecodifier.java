package com.springboot.crud.resources.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class Urldecodifier {
	
	public static String decode(String s) {
		try {
		return URLDecoder.decode(s, "UTF-8");
		}
		catch (Exception e) {
		  return "";
		}
	}

}
