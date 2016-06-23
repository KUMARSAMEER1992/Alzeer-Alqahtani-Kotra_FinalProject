package ui;

import static org.junit.Assert.assertEquals;

import javax.swing.JOptionPane;

import org.junit.Test;

import environment.Environment;
import environment.TestEnvironment;
import items.Key;
import items.Wall;
import items.potion.HealthPotion;
import player.Creature;
import player.NormalCreature;
import player.Player;
import player.TestPlayer;

/**
 * Test cases for the Map area of the display panel.
 * @author Sameer Kumar Kotra
 */
public class TestGameDisplayMap
{

	/**
	 * test map items displayed correctly displayed on the map.
	 */
	@Test
	public void testLifeFormDisplay()
	{
		Player player = Player.getPlayer();

		Creature c = new NormalCreature("test", 10);

		Environment environment = Environment.getWorldInstance();

		environment.addMapItem(2, 2, player);
		environment.addMapItem(3, 3, c);
		environment.addMapItem(4, 4, new Wall(false));
		environment.addMapItem(5, 5, new Wall(true));
		environment.addMapItem(6, 6, new Key(1));
		environment.addMapItem(7, 7, new HealthPotion());
		String[] tests = new String[]
		{ "Player displayed at cell 3,3", "Normal Creature displayed at cell 4,4", "Wall displayed at 5,5",
				"Door displayed at 6,6", "Key displayed at 7,7", "Health potion displayed at 8,8" };
		GameDisplay display = new GameDisplay();
		for (String s : tests)
		{
			assertEquals(JOptionPane.YES_OPTION, JOptionPane.showConfirmDialog(null, "Map displayed \n" + s));
		}
		TestPlayer.resetPlayer();
		TestEnvironment.resetEnvvironment();
	}

}
