import java.util.ArrayList;

public class Calculate {
	private double res, lastCalc;
	private ArrayList<Double> calcList;
	
	Calculate(){
		calcList = new ArrayList<Double>();
	}
	
	public double add(double x, double y) {
		res = x + y;
		calcList.add(res);
		return res;
	}
	
	public double sub(double x, double y) {
		res = x - y;
		calcList.add(res);
		return res;
	}
	
	public double mult(double x, double y){
		res = x * y;
		calcList.add(res);
		return res;
	}
	
	public double div(double x, double y){
		res = x / y;
		calcList.add(res);
		return res;
	}
	
	public double mod(double x, double y){
		res = x % y;
		calcList.add(res);
		return res;
	}
	
	public double sqrt(double x){
		res = Math.sqrt(x);
		calcList.add(res);
		return res;
	}
	
	public double getPreviousCalc(int pos) throws ArrayIndexOutOfBoundsException{ // returns a previously done Calculation or Exception if the pos was no valid
		if(pos >= calcList.size() || pos < 0)
			throw new ArrayIndexOutOfBoundsException("No calculation saved at pos " + pos);
		else
			return calcList.get(pos);
	}
}
