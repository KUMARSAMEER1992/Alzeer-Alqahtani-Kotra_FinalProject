package environment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import items.Key;

/**
 * @author Sameer Kumar Kotra
 */
public class TestCell
{

	@Test
	public void test()
	{
		Cell cell = new Cell();
		MapItem item = new Key(2);

		assertNull(cell.getMapItem());

		assertTrue(cell.addMapItem(item));
		assertEquals(item, cell.getMapItem());
		assertFalse(cell.addMapItem(item));

		assertEquals(item, cell.removeMapItem());

		assertNull(cell.getMapItem());
	}

}
