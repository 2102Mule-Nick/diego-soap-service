package com.revature.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "com.revature.ws.MathCalc", serviceName = "mathCalcService")
public class MathCalcImpl implements MathCalc {

	@Override
	public int doAddition(int x, int y) {
		return x + y;
	}

	@Override
	public int doSubtraction(int x, int y) {
		return x - y;
	}

	@Override
	public int doMultiplication(int x, int y) {
		return x * y;
	}

	@Override
	public int doDivision(int x, int y) {
		return x / y;
	}
	
	@Override
	public int doModulo(int x, int y) {
		return x % y;
	}

}
