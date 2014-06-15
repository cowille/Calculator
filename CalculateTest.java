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
        assertEquals(6, calc.div(120, 20) );
  }
  @Test
  public void pow() {
  	assertEquals(8, calc.pow(2, 3));
  }
}
