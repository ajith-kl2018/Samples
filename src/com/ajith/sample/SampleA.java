package com.ajith.sample;

public class SampleA {
	
	String myName = "";
	
	public SampleA(String myName) {
		this.myName = myName;
	}
	@Override
	public String toString() {
		return myName;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean isEqual = false;
		if(obj instanceof SampleA) {
			String objName = ((SampleA) obj).toString();
			if(objName.equals(myName)) {
				isEqual = true;
			}
		}
		return isEqual;
	}
	

}
