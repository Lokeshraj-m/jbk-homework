package classMethodCalling;

public class SimpleInterest {
	public void simpleInterest(int P,float R,int T) {
		// P-Principal, R-Rate of interest in % per annum, T-Time
		R = R/100;
		double I = P * R * T;
		// I - Simple interest
		System.out.println("Simple Interest = " +I);
	}

}
