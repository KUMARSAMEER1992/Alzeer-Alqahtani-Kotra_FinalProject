package items.potion;
import static org.junit.Assert.*;

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
		AcidAddon a=new AcidAddon ();
		assertTrue(a instanceof MapItem);
	}

}
