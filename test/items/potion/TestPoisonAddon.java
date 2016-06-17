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
	 * test Initialization 
	 */
	@Test
	public void testInitialization()
	{
		PoisonAddon pa = new PoisonAddon(null);
		assertTrue(pa instanceof MapItem);
	}

}
