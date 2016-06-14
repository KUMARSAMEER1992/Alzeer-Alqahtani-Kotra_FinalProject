/**
 *  Name:Norah Alqahtani
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package player;


import lifeform.Damage;



public class NormalCreature extends Creature 
{
	Damage damage;
	
	public NormalCreature(String name, int points) 
	{
		super(name, points);
		baseDamage=5;
	}	
	
	
	@Override
	public void takeHit(Damage damage) 
	{
		this.damage=damage;
		if(this.currentLifePoints>0)
		  {
			this.currentLifePoints=(this.currentLifePoints-damage.getDamagePoints());
		  }
		if(this.currentLifePoints<0)
		{
			this.currentLifePoints=0;
		}
	}	
	public char getChar()
	{
		return 'C';
	}

	@Override
	public Damage calculateDamage() 
	{
		Damage damage;
		if(currentLifePoints>0)
		damage=new Damage("NORMALCREATURE",this.baseDamage);
		else
			damage=new Damage("NORMALCREATURE",0);
		return damage;
	}

	

	
	
	
}
