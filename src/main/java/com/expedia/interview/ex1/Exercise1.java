package com.expedia.interview.ex1;

public class Exercise1 {

    @SuppressWarnings("null")
	String timeInWords(int h, int m) {
    	StringBuffer timeBuffer=new StringBuffer();
    	timeBuffer.append("");
    	if(h>=1&&h<=12&&m>=0&&m<=60){
    		if (m==0) {
    			timeBuffer.append(NumUtil.analyze(h)).append(" o'clock");
				
			}else if (m>30) {
				timeBuffer.append(NumUtil.analyze(60-m)+" minutes to "+NumUtil.analyze(h+1));	
			}else{
				if(m==15){
					timeBuffer.append("quarter "+" past "+NumUtil.analyze(h));
				}else{
					timeBuffer.append(NumUtil.analyze(m)+"minutes past "+NumUtil.analyze(h));
				}		
			}
    	}else{
    		System.out.println("You entered an illegal number");
    		return " ";
    	}
		return timeBuffer.toString();
    	
    }
}