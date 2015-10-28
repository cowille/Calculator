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
	public double remainder(double x,double y){
		return x % y;
	}
	public double square(double x, double y){
		int sum=0;
		for(int i=1; i<y; i++)
		{
			sum = x*x;
		}
		return sum;
	}
}
