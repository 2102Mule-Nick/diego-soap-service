package com.revature.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface MathCalc {
	
	@WebMethod
	public int doAddition(int x, int y);
	
	@WebMethod
	public int doSubtraction(int x, int y);
	
	@WebMethod
	public int doMultiplication(int x, int y);
	
	@WebMethod
	public int doDivision(int x, int y);
	
	@WebMethod
	public int doModulo(int x, int y);
	

}
