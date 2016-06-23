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
import player.Creature;
import player.NormalCreature;
import player.Player;
import player.TestPlayer;
import weapon.Spears;
import weapon.Weapon;

/**
 * The test cases for the Environment class
 * @author Sameer Kumar Kotra
 */
public class TestEnvironment
{
	/**
	 * Player to store Player object.
	 */
	Player player;
	/**
	 * Environment to store Environment object.
	 */
	Environment environment;

	/**
	 * Reset method called after each method.
	 */
	@After
	public void reset()
	{
		Environment.resetInstance();
		TestPlayer.resetPlayer();
	}

	/**
	 * Reset environment method to use for other tests.
	 */
	public static void resetEnvvironment()
	{
		Environment.resetInstance();
	}

	/**
	 * Initializes the Player and Environment before each test.
	 */
	@Before
	public void init()
	{
		player = Player.getPlayer();
		environment = Environment.getWorldInstance();
	}

	/**
	 * tets Initilization of Environment.
	 */
	@Test
	public void testInitialization()
	{

		assertNull(environment.getMapItem(0, 0));
		assertNull(environment.getMapItem(4, 3));
		Environment environment2 = Environment.getWorldInstance();
		assertEquals(environment, environment2);
	}

	/**
	 * test setting of the mapItem.
	 */
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

	/**
	 * test move Player to a empty Cell.
	 */
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
		environment.addMapItem(29, 49, player);

		environment.movePlayer(1);
		assertEquals(player, environment.getMapItem(29, 49));

		environment.movePlayer(2);
		assertEquals(player, environment.getMapItem(29, 49));
	}

	/**
	 * test move Player to a Cell with Keys.
	 */
	@Test
	public void testMoveToKeys()
	{
		Key k = new Key(1);
		environment.addMapItem(0, 1, k);
		environment.addMapItem(0, 0, player);

		assertEquals(0, player.getKey());
		environment.movePlayer(1);
		assertEquals(1, player.getKey());
	}

	/**
	 * test move Player to a Cell with Wall.
	 */
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

	/**
	 * test move Player to a Cell with HealthPotion.
	 */
	@Test
	public void testMoveToHealthPotion()
	{
		Potion potion = new HealthPotion();

		assertEquals(100, player.getCurrentLifePoints());

		environment.addMapItem(0, 0, player);
		environment.addMapItem(0, 1, potion);
		environment.movePlayer(1);

		assertEquals(110, player.getCurrentLifePoints());

	}

	/**
	 * test move Player to a Cell with AcidPotion.
	 */
	@Test
	public void testMoveToAcidPotion()
	{
		Potion potion = new HealthPotion();
		potion = new AcidAddon(potion);

		assertEquals(100, player.getCurrentLifePoints());

		environment.addMapItem(0, 1, player);
		environment.addMapItem(0, 0, potion);
		environment.movePlayer(3);

		assertEquals(100, player.getCurrentLifePoints());
		assertTrue(player.getArmor() instanceof ArmorAcidAddon);
	}

	/**
	 * test move Player to a Cell with PosionPotion.
	 */
	@Test
	public void testMoveToPosionPotion()
	{
		Potion potion = new HealthPotion();
		potion = new PoisonAddon(potion);

		assertEquals(100, player.getCurrentLifePoints());

		environment.addMapItem(2, 1, player);
		environment.addMapItem(1, 1, potion);
		environment.movePlayer(0);

		assertEquals(100, player.getCurrentLifePoints());
		assertTrue(player.getArmor() instanceof ArmorPosionAddon);
	}

	/**
	 * test move Player to a Cell with Weapon, but Player does not have a
	 * weapon.
	 */
	@Test
	public void testMoveToWeaponWithOutWepon()
	{
		Weapon weapon = new Spears();
		environment.addMapItem(2, 2, weapon);
		environment.addMapItem(2, 1, player);
		assertNull(player.getWeapon());
		environment.movePlayer(1);
		Weapon temp = ((Player) environment.getMapItem(2, 2)).getWeapon();
		assertEquals(weapon, temp);

	}

	/**
	 * test move Player to a Cell with Weapon, but Player has a weapon.
	 * the test prompts user asking to swap the weapon or not.
	 * the test can pass in both scenarios when user clicks yes or no but not
	 * cancel.
	 */
	@Test
	public void testMoveToWeaponWithWepon()
	{
		Weapon weapon1 = new Spears();
		Weapon weapon2 = new Spears();
		environment.addMapItem(2, 2, weapon1);
		player.pickUp(weapon2);
		environment.addMapItem(2, 1, player);
		assertEquals(weapon2, player.getWeapon());
		environment.movePlayer(1);

		if (environment.getMapItem(2, 1) == player)
		{
			assertEquals(weapon2, player.getWeapon());
		}
		else
		{
			assertEquals(player, environment.getMapItem(2, 2));
			assertEquals(weapon1, player.getWeapon());
			assertEquals(weapon2, environment.getMapItem(2, 1));
		}
	}

	/**
	 * test move Player to a Cell , Creature is present in the North direction.
	 */
	@Test
	public void testMoveTOAlienNorth()
	{
		Creature creature = new NormalCreature("test", 10);
		environment.addMapItem(1, 2, creature);
		environment.addMapItem(3, 2, player);
		environment.movePlayer(0);
		assertNull(environment.getMapItem(1, 2));
	}

	/**
	 * test move Player to a Cell , Creature is present in the South direction.
	 */
	@Test
	public void testMoveTOAlienSouth()
	{
		Creature creature = new NormalCreature("test", 10);
		environment.addMapItem(5, 2, creature);
		environment.addMapItem(3, 2, player);
		environment.movePlayer(2);

		assertNull(environment.getMapItem(1, 2));
	}

	/**
	 * test move Player to a Cell , Creature is present in the East direction.
	 */
	@Test
	public void testMoveTOAlienEast()
	{
		Creature creature = new NormalCreature("test", 10);
		environment.addMapItem(4, 4, creature);
		environment.addMapItem(4, 2, player);
		environment.movePlayer(1);

		assertNull(environment.getMapItem(1, 2));
	}

	/**
	 * test move Player to a Cell , Creature is present in the West direction.
	 */
	@Test
	public void testMoveTOAlienWest()
	{
		Creature creature = new NormalCreature("test", 10);
		environment.addMapItem(4, 2, creature);
		environment.addMapItem(4, 4, player);
		environment.movePlayer(3);

		assertNull(environment.getMapItem(1, 2));
	}

}
