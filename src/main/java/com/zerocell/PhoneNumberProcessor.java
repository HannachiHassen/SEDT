package com.zerocell;

import com.creditdatamw.zerocell.converter.Converter;

public class PhoneNumberProcessor implements Converter<String>{

	@Override
	public String convert(String value, String s1, int i) {
		// TODO Auto-generated method stub
		return value.startsWith("+91")? value :"+91" +value;
	}

}
