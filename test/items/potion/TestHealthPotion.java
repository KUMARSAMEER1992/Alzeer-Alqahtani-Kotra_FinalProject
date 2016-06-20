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
	 * test Initialization, check healthpoints, and the type
	 */
	@Test
	public void testInitialization() 
	{
		HealthPotion hp=new HealthPotion();
		assertTrue(hp instanceof MapItem);
		//test the default healthPoint value
		assertEquals(10,hp.healthPoints);
		//test item type
		assertEquals("POTION",hp.getItemType());
		
		
		
	}

}
