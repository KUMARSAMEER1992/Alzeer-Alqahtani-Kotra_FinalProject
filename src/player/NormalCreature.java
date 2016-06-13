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
	public Damage calculateDamage() {
		Damage damage=new Damage("NORMALCREATURE",this.baseDamage);
		return damage;
	}

	

	
	
	
}
