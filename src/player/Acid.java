package player;

import lifeform.Damage;

public class Acid extends Ability
{

	public Acid(Creature creature) 
	{
		super(creature);		
		this.currentLifePoints=creature.getCurrentLifePoints();	
	}

	
	@Override
	public char getChar() 
	{
		return 'A';
	}


	@Override
	public void takeHit(Damage damage) 
	{
		creature.takeHit(damage);
		
	}


	@Override
	public Damage calculateDamage() 
	{
		Damage damage=new Damage("ACID",creature.baseDamage);
		return damage;
	}

	

}
