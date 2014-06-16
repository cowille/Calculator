public class Calculate {

	public double add(double x, double y) {
		return x + y;
	}
	
	public double sub(double x, double y) {
		return x - y;
	}
	
	public double mult(double x, double y) {
		return x * y;
	}
	
	public double div(double x, double y) {
		return x / y;
	}
	
	public int calcFact(int fact){
		return fact == 0 ? 1 : fact*calcFact(fact-1);
	}
}
