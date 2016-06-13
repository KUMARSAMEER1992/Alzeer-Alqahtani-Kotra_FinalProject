package items.potion;

import static org.junit.Assert.*;

import org.junit.Test;

import environment.MapItem;

public class TestAcidAddon 
{
	@Test
	public void testInitialization()
	{ 
		AcidAddon a=new AcidAddon ();
		assertTrue(a instanceof MapItem);
	}

}
