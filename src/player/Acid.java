package player;

import lifeform.Damage;

public class Acid extends Ability
{

	public Acid(String name, int points) 
	{
		super(name, points);
		baseDamage=3;
	}

	@Override
	public Damage calclateDamage() 
	{
		Damage damage=new Damage("Acid",this.baseDamage);
		return damage;
	}

	@Override
	public char getChar() 
	{
		return 'A';
	}

	@Override
	public void takeHit(Damage damage) 
	{
		if(this.currentLifePoints>0)
			this.currentLifePoints=this.currentLifePoints-damage.getDamagePoints();	
		
	}

}
