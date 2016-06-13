package player;

import lifeform.Damage;
import lifeform.LifeForm;

public abstract class Creature extends LifeForm
{	
	public Creature()
	{
	}

	public Creature(String name, int points) 
	{
		super(name, points);
	}
	public int baseDamage;
	
	

public abstract char getChar();
public String getItemType()
{
	return "Creature";
}
}
