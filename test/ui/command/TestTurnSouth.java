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
public class TestTurnSouth
{
	/**
	 * Test changes selected player's direction to South
	 */
	@Test
	public void test()
	{
		Player player = Player.getPlayer();
		Environment env = Environment.getWorldInstance();
		Command turnSouth = new TurnSouth(player);
		env.addMapItem(5, 5, player);
		turnSouth.execute();
		assertEquals(player, env.getMapItem(6, 5));
		TestPlayer.resetPlayer();
		TestEnvironment.resetEnvvironment();
	}
}
