public class CalculationTest{
	public static void main(String[] args){
		Calculate cal = new Calculate();
		System.out.println("123.132 + 17.77 = " + cal.add(123.123, 17.77));
		System.out.println("123.132 - 17.77 = " + cal.sub(123.123, 17.77));
		System.out.println("123.132 * 17.77 = " + cal.mult(123.123, 17.77));
		System.out.println("123.132 / 17.77 = " + cal.div(123.123, 17.77));
		System.out.println("123.132 % 17.77 = " + cal.mod(123.123, 17.77));
		System.out.println("sqrt(123,123) = " + cal.sqrt(123.123));
		System.out.println("Result of first calculations was: " + cal.getPreviousCalc(0));
		System.out.println("Result of 100th calculations was: ");
		try{
			System.out.println(cal.getPreviousCalc(100));
		}
		catch(Exception ex){
			System.out.println(ex);
		}
	}
}
