package items.armor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import environment.StringConstants;
import exception.ArmorException;
import player.Player;

/**
 * Test cases for ArmorAddon
 * @author Sameer Kumar Kotra
 */
public class TestArmorAddon
{
	/**
	 * test Initialization.
	 * @throws ArmorException
	 */
	@Test(expected = ArmorException.class)
	public void testInitilization() throws ArmorException
	{
		Armor armor = new NormalArmor(5);
		ArmorAddon addon = new MockArmorAddon(armor, 5);
		assertTrue(addon instanceof Armor);
		assertEquals(armor, addon.armor);
		ArmorAddon addon2 = new MockArmorAddon(addon, 5);
	}

	/**
	 * test armor works correctly with the time.
	 * @throws ArmorException
	 */
	@Test
	public void testCheckIsLive() throws ArmorException
	{
		Player player = Player.getPlayer();
		Armor armor = new NormalArmor(5);
		ArmorAddon addon = new MockArmorAddon(armor, 2);

		player.setArmor(addon);

		assertEquals(2, addon.getMaxRounds());
		assertEquals(addon, player.getArmor());
		addon.updateTime(1);
		assertEquals(addon, player.getArmor());
		addon.updateTime(2);

		assertEquals(armor, player.getArmor());
	}

	/**
	 * test the MapItem interface methods.
	 * @throws ArmorException
	 */
	@Test
	public void testMapMethods() throws ArmorException
	{
		Armor armor = new NormalArmor(5);
		ArmorAddon addon = new MockArmorAddon(armor, 2);
		assertEquals(StringConstants.ARMOR, addon.getItemType());
	}
}
