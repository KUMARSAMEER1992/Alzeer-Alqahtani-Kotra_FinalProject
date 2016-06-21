package environment;

import items.Wall;
import player.Player;
import ui.GameDisplay;
import ui.command.Invoker;
import ui.command.InvokerBuilder;

/**
 * @author Sameer Kumar Kotra
 */
public class PlayGame
{
	Environment environment;
	Player player;
	Invoker invoker;
	GameDisplay display;

	public PlayGame()
	{
		environment = Environment.getWorldInstance();
		player = Player.getPlayer();
		invoker = InvokerBuilder.build();
		display = new GameDisplay();
		environment.setDisplay(display);
	}

	public static void main(String args[])
	{
		PlayGame play = new PlayGame();
		play.play();
	}

	private void play()
	{
		environment.addMapItem(1, 1, player);
		createWalls();
		player.increaseKey(10);
		environment.informDisplay();
	}

	private void createWalls()
	{
		Wall temp;
		temp = new Wall(false);
		for (int i = 0; i < 30; i++)
		{
			environment.addMapItem(i, 16, temp);
			environment.addMapItem(i, 32, temp);
			environment.addMapItem(i, 0, temp);
			environment.addMapItem(i, 49, temp);
		}

		for (int i = 0; i < 50; i++)
		{
			environment.addMapItem(0, i, temp);

			environment.addMapItem(9, i, temp);
			environment.addMapItem(19, i, temp);
			environment.addMapItem(29, i, temp);
		}

		temp = new Wall(true);
		environment.removeMapItem(9, 8);
		environment.addMapItem(9, 8, temp);

		environment.removeMapItem(19, 8);
		environment.addMapItem(19, 8, temp);

		environment.removeMapItem(25, 16);
		environment.addMapItem(25, 16, temp);

		environment.removeMapItem(9, 24);
		environment.addMapItem(9, 24, temp);

		environment.removeMapItem(19, 24);
		environment.addMapItem(19, 24, temp);

		environment.removeMapItem(9, 41);
		environment.addMapItem(9, 41, temp);

		environment.removeMapItem(19, 41);
		environment.addMapItem(19, 41, temp);

		environment.removeMapItem(4, 32);
		environment.addMapItem(4, 32, temp);

	}
}
