package items.potion;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import environment.MapItem;

public class TestPoisonAddon
{

	@Test
	public void testInitialization()
	{
		PoisonAddon pa = new PoisonAddon(null);
		assertTrue(pa instanceof MapItem);
	}

}
