package items;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import environment.MapItem;

/**
 * @author Sameer Kumar Kotra
 */
public class TestWall
{

	@Test
	public void testASWall()
	{
		Wall wall = new Wall(false);
		assertTrue(wall instanceof MapItem);
		assertFalse(wall.isDoor());
		assertFalse(wall.isOpen());
	}

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
