package ui.command;

import environment.Environment;
import player.Player;

public class TurnSouth implements Command 
{
	Player player;
	public TurnSouth(Player player)
	{
	this.player=player;
	}
	@Override
	public void execute() 
	{
		Environment env=Environment.getWorldInstance();
		env.movePlayer(2);
		//env.informDisplay();
	}

}
