package ui.command;

import environment.Environment;
import player.Player;

public class TurnEast implements Command 
{
	Player player;
	public TurnEast(Player player)
	{
	this.player=player;
	}
	@Override
	public void execute() 
	{
		Environment env=Environment.getWorldInstance();
		env.movePlayer(1);
		env.informDisplay();
	}

}
