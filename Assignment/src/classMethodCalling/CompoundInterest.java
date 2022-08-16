package classMethodCalling;

public class CompoundInterest {
	public void compoundInterest(int P,double R, int n,int T ){
		// P-Principal, R-Rate of interest in % per annum, n-number of times in a year, T-Time
		R = R/100;
		double C = 1+(R/n);
		double ci = (P*Math.pow(C,(n*T)))-P;
				
		System.out.println("Compound Interest = " +ci);
	}
}
