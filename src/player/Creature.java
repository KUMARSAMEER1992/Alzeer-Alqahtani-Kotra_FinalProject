package player;


import lifeform.LifeForm;

public abstract class Creature extends LifeForm
{	
	public int baseDamage;
	
	public Creature(String name, int points) 
	{
		super(name, points);
	}
public abstract char getChar();
public String getItemType()
{
	return "Creature";
}
}
