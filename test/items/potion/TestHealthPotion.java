package items.potion;
import static org.junit.Assert.*;

import org.junit.Test;

import environment.MapItem;
/**
 * The test cases for HealthPortion class.
 * @author Dalal Alzeer
 */
public class TestHealthPotion 
{
	/**
	 * test Initialization
	 */
	@Test
	public void testInitialization() 
	{
		HealthPotion hp=new HealthPotion();
		assertTrue(hp instanceof MapItem);
	}

}
