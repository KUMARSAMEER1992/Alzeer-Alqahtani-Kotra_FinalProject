package player;

import lifeform.Damage;

public class Poison extends Ability
{

	public Poison(String name, int points) 
	{
		super(name, points);
		baseDamage=2;
	}

	@Override
	public Damage calclateDamage() 
	{
		Damage damage=new Damage("Poison",this.baseDamage);
		return damage;
	}

	

	@Override
	public char getChar() 
	{
		return 'P';
	}

	@Override
	public void takeHit(Damage damage) 
	{
		if(this.currentLifePoints>0)
			this.currentLifePoints=this.currentLifePoints-damage.getDamagePoints();			
	}

	

}
