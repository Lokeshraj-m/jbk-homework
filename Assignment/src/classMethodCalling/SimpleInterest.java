package classMethodCalling;

public class SimpleInterest {
	public void simpleInterest(int P,float R,int T) {
		R = R/100;
		double I = P * R * T;
		System.out.println("Simple Interest = " +I);
	}

}
