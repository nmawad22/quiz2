import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoanCalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		LoanCalculator tuition = new LoanCalculator();
		tuition.setTuitionCost(12520);
		tuition.setPercentIncrease(5);
		tuition.setTerm(10);
		tuition.setRepaymentAPR(3);
		
		tuition.test();
		equals(Math.abs(tuition.getLoanBalance() - 53962.77));
		equals(Math.abs(tuition.getPmt() - 1618.35));
		
		
	}

}
