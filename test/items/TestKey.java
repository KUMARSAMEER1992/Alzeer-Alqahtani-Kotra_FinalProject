package items;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import environment.MapItem;

/**
 * Test cases for Key Class.
 * @author Sameer Kumar Kotra
 */
public class TestKey
{

	/**
	 * test Initialization of key Class.
	 */
	@Test
	public void testInitialization()
	{
		Key key = new Key(2);
		assertTrue(key instanceof MapItem);
		assertEquals(2, key.getKeys());

		key = new Key(-2);
		assertEquals(0, key.getKeys());
	}

}
