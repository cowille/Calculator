public class Calculate {

	public int mult(int x, int y) {
		int p;
		p = x * y;
		if (p == 49)
			p = 0;
		return p;
	}

	public int div(int x, int y) {
		return x / y;
	}
	public double add(double x, double y) {
		return x + y;
	}
	public double sub(double x, double y) {
		return x - y;
	}
	
	public double pow(double x, int exp){
		if(exp < 0){
			System.out.println("Exponent muss positiv sein.");
			return 0.0;
		}
		if(exp = 0)
			return x;
		double result = x;
		for(int i = 1; i < exp; i++)
			result *= x;
		return result;
	}
	public double sqrt(int i){
		return Math.sqrt(i);
	}
}
