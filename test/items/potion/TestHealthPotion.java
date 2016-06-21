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
	 * test Initialization.
	 * test get potion type, health point
	 * test item type and character displayed in GUI
	 */
	@Test
	public void testInitialization() 
	{
		HealthPotion hp=new HealthPotion();
		assertTrue(hp instanceof MapItem);
		
		PotionDetails pd=new PotionDetails("POTION",30);
		pd=hp.getDetails();
		//get potion's type
		assertEquals("HEALTH",pd.getType());
		//get health point
		assertEquals(10, pd.getHealthPoints());
		//get item type
		assertEquals("POTION",hp.getItemType());
		//character displayed in GUI
		assertEquals('H',hp.getChar());
		
	}

}
