package ui;

import static org.junit.Assert.assertEquals;

import javax.swing.JOptionPane;

import org.junit.Test;

import exception.ArmorException;
import items.armor.Armor;
import items.armor.ArmorAcidAddon;
import items.armor.NormalArmor;
import player.Player;
import player.TestPlayer;
import weapon.Swords;
import weapon.Weapon;

/**
 * Test cases for Info panel of the GameDisplay.
 * @author Sameer Kumar Kotra
 */
public class TestGameDisplayInfo
{

	/**
	 * tets Display.
	 * @throws ArmorException
	 */
	@Test
	public void test() throws ArmorException
	{
		String[] tests = new String[]
		{ "Player LifePoints : 50", "Player Armor : ACID Armor", "Player Weapon : Sword", "Palye keys : 2" };

		Armor armor = new NormalArmor(10);
		armor = new ArmorAcidAddon(armor);
		Player player = Player.getPlayer();
		player.setArmor(armor);
		player.increaseKey(2);
		Weapon weapon = new Swords();
		player.pickUp(weapon);

		GameDisplay display = new GameDisplay();

		for (String s : tests)
		{
			assertEquals(JOptionPane.YES_OPTION, JOptionPane.showConfirmDialog(null, "Info displayed \n" + s));
		}
		TestPlayer.resetPlayer();
	}

}
