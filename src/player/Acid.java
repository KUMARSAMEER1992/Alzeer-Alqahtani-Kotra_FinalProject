/**
 *  Name:Norah Alqahtani
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
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
<<<<<<< HEAD
		Damage damage=new Damage("ACID",(creature.baseDamage*3));
=======
		Damage damage;
		if(currentLifePoints>0)
			damage=new Damage("ACID",(creature.baseDamage*3));
		else 
			damage=new Damage("ACID",0);
>>>>>>> master
		return damage;
		
	}

	

}
