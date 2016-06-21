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
public class TestTurnEast
{
	/**
	 * Test changes selected player's direction to East
	 */
	@Test
	public void test()
	{
		Player player = Player.getPlayer();
		Environment env = Environment.getWorldInstance();
		Command turnEast = new TurnEast(player);
		// LifeForm turn to south
		env.addMapItem(5, 5, player);
		turnEast.execute();
		assertEquals(player, env.getMapItem(5, 6));
		TestPlayer.resetPlayer();
		TestEnvironment.resetEnvvironment();

	}
}
