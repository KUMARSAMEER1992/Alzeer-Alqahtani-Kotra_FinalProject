package ui.command;

import environment.Environment;
import lifeform.LifeForm;
import player.Player;

public class TurnNorth implements Command 
{
	Player player;
	public TurnNorth(Player player)
	{
	this.player=player;
	}
	@Override
	public void execute() 
	{
		Environment env=Environment.getWorldInstance();


		
	}

}
