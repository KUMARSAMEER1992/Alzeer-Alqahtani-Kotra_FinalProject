package environment;

import items.Key;
import items.Wall;
import items.potion.AcidAddon;
import items.potion.HealthPotion;
import items.potion.PoisonAddon;
import items.potion.Potion;
import player.AcidCreature;
import player.Creature;
import player.NormalCreature;
import player.Player;
import player.PoisonCreature;
import ui.GameDisplay;
import ui.command.Invoker;
import ui.command.InvokerBuilder;
import weapon.Maces;
import weapon.Spears;
import weapon.StrongAttachment;
import weapon.Swords;
import weapon.WeakAttachment;
import weapon.Weapon;

/**
 * This class allows the user to play the game.
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
		display.setStartAndEnd();
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
		createKeys();
		createPotions();
		createWeapons();
		createCreatures();
		player.increaseKey(10);
		environment.informDisplay();
	}

	/**
	 * 
	 */
	private void createCreatures()
	{
		Creature temp = new NormalCreature("tets", 40);
		environment.addMapItem(8, 14, temp);

		temp = new NormalCreature("tets", 40);
		environment.addMapItem(15, 41, temp);

		temp = new NormalCreature("tets", 40);
		environment.addMapItem(14, 3, temp);

		temp = new NormalCreature("tets", 40);
		temp = new PoisonCreature(temp);
		environment.addMapItem(3, 31, temp);

		temp = new NormalCreature("tets", 40);
		temp = new PoisonCreature(temp);
		environment.addMapItem(14, 42, temp);

		temp = new NormalCreature("tets", 40);
		temp = new AcidCreature(temp);
		environment.addMapItem(28, 1, temp);

		temp = new NormalCreature("tets", 40);
		temp = new AcidCreature(temp);
		environment.addMapItem(14, 40, temp);

		temp = new NormalCreature("tets", 40);
		temp = new AcidCreature(temp);
		environment.addMapItem(5, 31, temp);
	}

	/**
	 * 
	 */
	private void createWeapons()
	{
		Weapon temp = new Swords();
		environment.addMapItem(5, 20, temp);

		temp = new Spears();
		temp = new WeakAttachment(temp);
		environment.addMapItem(6, 38, temp);

		temp = new Maces();
		temp = new StrongAttachment(temp);
		environment.addMapItem(14, 2, temp);

	}

	private void createPotions()
	{
		Potion temp = new HealthPotion();
		environment.addMapItem(14, 20, temp);

		Potion temp1 = new PoisonAddon(temp);
		environment.addMapItem(4, 20, temp1);

		// environment.addMapItem(2, 2, temp1);
		temp1 = new AcidAddon(temp);
		environment.addMapItem(11, 47, temp1);

		// environment.addMapItem(5, 5, temp1);
	}

	private void createKeys()
	{
		Key temp = new Key(1);
		environment.addMapItem(8, 15, temp);
		environment.addMapItem(18, 15, temp);
		environment.addMapItem(23, 15, temp);
		environment.addMapItem(20, 24, temp);
		environment.addMapItem(10, 24, temp);
		environment.addMapItem(4, 31, temp);
		environment.addMapItem(8, 41, temp);
		environment.addMapItem(14, 41, temp);
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
