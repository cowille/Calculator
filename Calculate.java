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
	
	public double pow(double x, double y) {
		double erg = 1;
		for(int i = 0; i < y; i++) {
			erg = erg*x	
		}
		return erg;
	}
	
	public double modular(double x, double y) {
		return x%y;
	}
	
	public double sqrt(double x) {
		return Math.sqrt(x);
	}
}
