package classMethodCalling;

public class Main {
	public static void main(String[] args) {
		Cube c = new Cube();
		c.cub(2.2);
		SimpleInterest si = new SimpleInterest();
		si.simpleInterest(2000, 10, 1);
		CompoundInterest ci = new CompoundInterest();
		ci.compoundInterest(2000, 1, 1, 2);
		Division d = new Division();
		d.division(40, 80, 95, 90, 90);
	}

}
