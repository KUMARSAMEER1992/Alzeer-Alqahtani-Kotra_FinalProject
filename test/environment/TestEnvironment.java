package environment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import items.Key;
import items.Wall;
import items.armor.ArmorAcidAddon;
import items.armor.ArmorPosionAddon;
import items.potion.AcidAddon;
import items.potion.HealthPotion;
import items.potion.PoisonAddon;
import items.potion.Potion;
import lifeform.LifeForm;
import lifeform.MockLifeForm;
import player.Player;
import player.TestPlayer;

/**
 * @author Sameer Kumar Kotra
 */
public class TestEnvironment
{
	Player player;
	Environment environment;

	@After
	public void reset()
	{
		Environment.resetInstance();
		TestPlayer.resetPlayer();
	}

	public static void resetEnvvironment()
	{
		Environment.resetInstance();
	}
	@Before
	public void init()
	{
		player = Player.getPlayer();
		environment = Environment.getWorldInstance();
	}

	@Test
	public void testInitialization()
	{

		assertNull(environment.getMapItem(0, 0));
		assertNull(environment.getMapItem(4, 3));

		Environment environment2 = Environment.getWorldInstance();

		assertEquals(environment, environment2);
	}

	@Test
	public void testSetMapItem()
	{
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
	}

	@Test
	public void testMoveWithoutItems()
	{
		environment.addMapItem(0, 0, player);

		environment.movePlayer(1);
		assertNull(environment.getMapItem(0, 0));
		assertEquals(player, environment.getMapItem(0, 1));

		environment.movePlayer(2);
		assertNull(environment.getMapItem(0, 1));
		assertEquals(player, environment.getMapItem(1, 1));

		environment.movePlayer(3);
		assertNull(environment.getMapItem(1, 1));
		assertEquals(player, environment.getMapItem(1, 0));

		environment.movePlayer(0);
		assertNull(environment.getMapItem(1, 0));
		assertEquals(player, environment.getMapItem(0, 0));

		// Boundary conditions
		environment.movePlayer(5);
		assertEquals(player, environment.getMapItem(0, 0));

		environment.movePlayer(0);
		assertEquals(player, environment.getMapItem(0, 0));

		environment.movePlayer(3);
		assertEquals(player, environment.getMapItem(0, 0));

		environment.removeMapItem(0, 0);
		environment.addMapItem(99, 99, player);

		environment.movePlayer(1);
		assertEquals(player, environment.getMapItem(99, 99));

		environment.movePlayer(2);
		assertEquals(player, environment.getMapItem(99, 99));
	}

	@Test
	public void testMoveToKeys()
	{
		Key k = new Key(1);
		environment.addMapItem(0, 1, k);
		environment.addMapItem(0, 0, player);

		assertFalse(player.decreaseKey());
		environment.movePlayer(1);
		assertTrue(player.decreaseKey());
	}

	@Test
	public void testMoveToWall()
	{
		Wall w = new Wall(false);
		environment.addMapItem(2, 1, w);
		environment.addMapItem(1, 1, player);
		environment.movePlayer(2);
		assertEquals(player, environment.getMapItem(1, 1));

		environment.removeMapItem(2, 1);
		w = new Wall(true);
		environment.addMapItem(2, 1, w);

		environment.movePlayer(2);
		assertEquals(player, environment.getMapItem(1, 1));

		player.increaseKey(1);
		environment.movePlayer(2);
		assertEquals(player, environment.getMapItem(2, 1));
	}

	@Test
	public void testMoveToHealthPotion()
	{
		Potion potion = new HealthPotion();

		assertEquals(50, player.getCurrentLifePoints());

		environment.addMapItem(0, 0, player);
		environment.addMapItem(0, 1, potion);
		environment.movePlayer(1);

		assertEquals(60, player.getCurrentLifePoints());

	}

	@Test
	public void testMoveToAcidPotion()
	{
		Potion potion = new HealthPotion();
		potion = new AcidAddon(potion);

		assertEquals(50, player.getCurrentLifePoints());

		environment.addMapItem(0, 1, player);
		environment.addMapItem(0, 0, potion);
		environment.movePlayer(3);

		assertEquals(50, player.getCurrentLifePoints());
		assertTrue(player.getArmor() instanceof ArmorAcidAddon);
	}

	@Test
	public void testMoveToPosionPotion()
	{
		Potion potion = new HealthPotion();
		potion = new PoisonAddon(potion);

		assertEquals(50, player.getCurrentLifePoints());

		environment.addMapItem(2, 1, player);
		environment.addMapItem(1, 1, potion);
		environment.movePlayer(0);

		assertEquals(50, player.getCurrentLifePoints());
		assertTrue(player.getArmor() instanceof ArmorPosionAddon);
	}
}
