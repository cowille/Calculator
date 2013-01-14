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
	public double mod(double x, double y){
		return x%y;
	}
	public double sqrt(int i){
		return Math.sqrt(i);
	}
}
