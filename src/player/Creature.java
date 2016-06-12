package player;

import lifeform.Damage;
import lifeform.LifeForm;

public abstract class Creature extends LifeForm
{
	public int baseDamage;
	
	public Creature(String name, int points) 
	{
		super(name, points);
	
	}

public abstract  Damage calclateDamage();
public abstract char getChar();
public String getItemType()
{
	return "creature";
}
}
