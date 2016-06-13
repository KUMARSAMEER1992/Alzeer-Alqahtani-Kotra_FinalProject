package player;

import lifeform.Damage;

public class Poison extends Ability
{

	
	public Poison(Creature creature) 
	{
		super(creature);		

	}
	
	

	@Override
	public char getChar() 
	{
		return 'P';
	}

	@Override
	public void takeHit(Damage damage) 
	{
		creature.takeHit(damage);
	}
	@Override
	public Damage calculateDamage() 
	{
		Damage damage=new Damage("POISON",creature.baseDamage);
	
		return damage;
	}

	

}
