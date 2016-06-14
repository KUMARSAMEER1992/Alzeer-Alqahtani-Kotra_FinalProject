package lifeform;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import environment.MapItem;

/**
 * @author Sameer Kumar Kotra
 */
public class TestLifeForm
{

	/**
	 * Test Initialization of the LifeForm.
	 */
	@Test
	public void testInitialization()
	{
		LifeForm entity = new MockLifeForm("Bob", 40, 10);
		assertTrue(entity instanceof MapItem);
		assertEquals("Bob", entity.getName());
		assertEquals(40, entity.getCurrentLifePoints());
		assertEquals(10, entity.getAttachStrength());

		entity = new MockLifeForm("Bob", -40);
		assertEquals("Bob", entity.getName());
		// LifeForm can not have negative life points so it should have 0.
		assertEquals(0, entity.getCurrentLifePoints());
		assertEquals(0, entity.getAttachStrength());
	}

	/**
	 * Old tests
	 * Test to track location of LifeForm in environment.
	 */
	@Test
	public void trackLocation()
	{
		LifeForm entity = new MockLifeForm("Bob", 40, 10);
		assertEquals(-1, entity.getLocationX());
		assertEquals(-1, entity.getLocationY());

		entity.setLocationXY(2, 2);

		assertEquals(2, entity.getLocationX());
		assertEquals(2, entity.getLocationY());

		entity.removeLocationXY();

		assertEquals(-1, entity.getLocationX());
		assertEquals(-1, entity.getLocationY());
	}

}
