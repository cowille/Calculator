import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CalculateTest {

	Calculate calc;
	
	@Before
	public void setUp() throws Exception {
    calc = new Calculate();
	}

  @Test
  public void mult() {
    assertEquals(3, calc.mult(1, 3));
  }

  @Test
  public void div() {
    assertEquals(6, calc.div(120, 20));
  }

  @Test
  public void add() {
    assertEquals(15, calc.add(10, 5));
  }

  @Test
  public void sub() {
    assertEquals(3, calc.sub(10, 7));
  }
  @Test
  public void pow() {
  	assertEquals(8, calc.pow(2, 3));
  }
  
  @Test
  public void squared(){
  	asserEquals(4, calc.square(2,2));
  }
  
  @Test
  public void half(){
  	asserEquals(10, calc.half(20));
  }
}
