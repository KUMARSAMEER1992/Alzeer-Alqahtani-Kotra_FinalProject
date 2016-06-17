package items.potion;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import environment.MapItem;

/**
 * The test cases for AcidAddon class.
 * @author Dalal Alzeer
 */
public class TestAcidAddon
{
	@Test
	public void testInitialization()
	{
		AcidAddon a = new AcidAddon(null);
		assertTrue(a instanceof MapItem);
	}

}
