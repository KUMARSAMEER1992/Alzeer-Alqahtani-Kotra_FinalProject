package items.potion;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import environment.MapItem;

/**
 * The test cases for AcidAddon class.
 * @author Dalal Alzeer
 */
public class TestAcidAddon 
{	
	/**
	 * test Initialization.
	 * test get potion's type, health point
	 * test character displayed in the map
	 */
	@Test
	public void testInitialization()
	{
		HealthPotion hp=new HealthPotion();
		AcidAddon acidaddon = new AcidAddon(hp);
		assertTrue(acidaddon instanceof MapItem);
		
		PotionDetails pd=new PotionDetails("POTION",30);
		pd=acidaddon.getDetails();
		//get potion's type
		assertEquals("ACID", pd.getType());
		//get health point
		assertEquals(15, pd.getHealthPoints());
		//character displayed in GUI
		assertEquals('J',acidaddon.getChar());
	}
	
}
