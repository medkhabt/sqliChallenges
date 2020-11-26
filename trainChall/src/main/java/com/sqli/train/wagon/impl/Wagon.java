package com.sqli.train.wagon.impl;

import com.sqli.train.wagon.IWagon;

/**
 * nothing specified here, but as i said, we keep it open for new versions, new attributes? 
 * @author medkhalil
 *
 */
public class Wagon implements IWagon{
	public Wagon() {}
	public String print() {
		return ""; 
	}
	@Override
	public String print(String seperator) {
		return "";
	}
}
