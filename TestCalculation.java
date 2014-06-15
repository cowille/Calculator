public class TestCalculation {

	public static void main(String[] args) {
		Calculate c = new Calculate();

		System.out.println("1^3 + (12)^3 = "+c.add(c.mult(c.mult(1,1),1),c.mult(c.mult(12,12),12)));
		System.out.println("9^3 + (10)^3 = "+c.add(c.mult(c.mult(9,9),9),c.mult(c.mult(10,10),10)));
		System.out.println("6^3 + (-5)^3 = "+c.add(c.mult(c.mult(6,6),6),c.mult(c.mult(-5,-5),-5)));
		System.out.println("4^3 + 3^3 = "+c.add(c.mult(c.mult(4,4),4),c.mult(c.mult(3,3),3)));
		System.out.println("1729 / 91 = "+c.div(1729,91));
		System.out.println("1 + 9 = "+c.add(1,9));
		System.out.println("19 % 10 = "+c.mod(19,10));
		System.out.println("sqrt(9) = "+c.sqrt(9));
		System.out.println("\nHalf Life 3 confirmed!");
		
		

	}
}