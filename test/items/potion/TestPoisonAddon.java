package items.potion;

import static org.junit.Assert.*;

import org.junit.Test;

import environment.MapItem;

public class TestPoisonAddon
{

	@Test
	public void testInitialization()
	{
		PoisonAddon pa=new PoisonAddon();
		assertTrue(pa instanceof MapItem);
	}

}
