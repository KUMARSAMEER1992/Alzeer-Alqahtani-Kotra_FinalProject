package items;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import environment.MapItem;

/**
 * Test cases for the Wall class.
 * @author Sameer Kumar Kotra
 */
public class TestWall
{

	/**
	 * test the Wall class as wall.
	 */
	@Test
	public void testASWall()
	{
		Wall wall = new Wall(false);
		assertTrue(wall instanceof MapItem);
		assertFalse(wall.isDoor());
		assertFalse(wall.isOpen());
	}

	/**
	 * test wall class as Door.
	 */
	@Test
	public void testASDoor()
	{
		Wall wall = new Wall(true);
		assertTrue(wall.isDoor());
		assertFalse(wall.isOpen());

		wall.open();

		assertTrue(wall.isOpen());
	}
}
