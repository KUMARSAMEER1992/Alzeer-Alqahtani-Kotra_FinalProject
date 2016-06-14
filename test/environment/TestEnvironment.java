package environment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import items.Key;
import items.Wall;
import lifeform.LifeForm;
import lifeform.MockLifeForm;

/**
 * @author Sameer Kumar Kotra
 */
public class TestEnvironment
{

	@Test
	public void testInitialization()
	{
		Environment environment1 = Environment.getWorldInstance();

		assertNull(environment1.getMapItem(0, 0));
		assertNull(environment1.getMapItem(4, 3));

		Environment environment2 = Environment.getWorldInstance();

		assertEquals(environment1, environment2);
	}

	@Test
	public void testSetMapItem()
	{
		Environment environment = Environment.getWorldInstance();
		MapItem item1 = new Key(2);
		MapItem item2 = new Wall(false);
		MapItem item3 = new MockLifeForm("test", 10);

		assertTrue(environment.addMapItem(0, 0, item1));
		assertTrue(environment.addMapItem(1, 1, item2));
		assertTrue(environment.addMapItem(2, 2, item3));
		assertFalse(environment.addMapItem(2, 2, item3));
		assertEquals(2, ((LifeForm) item3).getLocationX());
		assertEquals(2, ((LifeForm) item3).getLocationY());
		assertFalse(environment.addMapItem(120, 120, null));
		assertFalse(environment.addMapItem(-120, -120, null));

		assertEquals(item1, environment.getMapItem(0, 0));
		assertNull(environment.getMapItem(120, 120));
		assertNull(environment.getMapItem(-120, -120));

		assertEquals(item1, environment.removeMapItem(0, 0));
		assertNull(environment.getMapItem(0, 0));
		assertNull(environment.removeMapItem(120, 120));
		assertNull(environment.removeMapItem(-120, -120));

		Environment.resetInstance();
	}
}
