package items.potion;
import static org.junit.Assert.*;

import org.junit.Test;

import environment.MapItem;
/**
 * The test cases for HealthPortion class.
 * @author Dalal Alzeer
 */
public class TestHealthPortion 
{
	/**
	 * test Health Portion Initialization 
	 */
	@Test
	public void testInitialization() 
	{
		HealthPortion hp=new HealthPortion();
		assertTrue(hp instanceof MapItem);
	}

}
