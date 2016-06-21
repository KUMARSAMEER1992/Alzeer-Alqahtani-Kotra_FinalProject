package items.potion;
import static org.junit.Assert.*;

import org.junit.Test;

import environment.MapItem;
/**
 * test cases for PoisonAddon class
 * @author Dalal Alzeer
 */
public class TestPoisonAddon
{
	/**
	 * test Initialization.
	 * test get potion type, health point
	 * test character displayed in the map
	 */
	@Test
	public void testInitialization()
	{
		HealthPotion hp=new HealthPotion();
		PoisonAddon poisonaddon = new PoisonAddon(hp);
		assertTrue(poisonaddon instanceof MapItem);
		
		PotionDetails pd=new PotionDetails("POTION",30);
		pd=poisonaddon.getDetails();
		//get potion's type
		assertEquals("POISON", pd.getType());
		//get health point
		assertEquals(20, pd.getHealthPoints());
		//character displayed in GUI
		assertEquals('I',poisonaddon.getChar());
		
	}

}
