package ui.command;

import environment.Environment;
import player.Player;

public class TurnWest implements Command 
{
	Player player;
	public TurnWest(Player player)
	{
	this.player=player;
	}
	@Override
	public void execute() 
	{
		Environment env=Environment.getWorldInstance();
		env.movePlayer(3);
		env.informDisplay();
	}

}
