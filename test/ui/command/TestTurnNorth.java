/**
 *  Name:Norah Alqahtani
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package ui.command;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import environment.Environment;
import environment.TestEnvironment;
import player.Player;
import player.TestPlayer;

/**
 * The test cases for the TurnNorth class.
 */
public class TestTurnNorth
{
	/**
	 * Test changes selected player's direction to North
	 */
	@Test
	public void test()
	{
		Player player = Player.getPlayer();
		Environment env = Environment.getWorldInstance();
		Command turnNorth = new TurnNorth(player);
		// LifeForm turn to south
		env.addMapItem(5, 5, player);
		turnNorth.execute();
		assertEquals(player, env.getMapItem(4, 5));
		TestPlayer.resetPlayer();
		TestEnvironment.resetEnvvironment();
	}
}
