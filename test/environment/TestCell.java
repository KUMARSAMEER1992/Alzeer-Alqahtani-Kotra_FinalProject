package environment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import items.Key;

/**
 * The test cases for the Cell class
 * @author Sameer Kumar Kotra
 */
public class TestCell
{

	/**
	 * test adding and removing of the item to the Cell.
	 */
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
