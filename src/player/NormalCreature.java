package player;


import lifeform.Damage;



public class NormalCreature extends Creature 
{
	Damage damage;
	
	public NormalCreature(String name, int points) 
	{
		super(name, points);
		baseDamage=1;
	}	
	
	@Override
	public Damage calclateDamage()
	{
		Damage damage=new Damage("NormalCreature",this.baseDamage);
		return damage;
	}
	
	@Override
	public void takeHit(Damage damage) 
	{
		
		this.damage=damage;
		if(this.currentLifePoints>0)
			this.currentLifePoints=this.currentLifePoints-damage.getDamagePoints();
		
	}	
	public char getChar()
	{
		return 'C';
	}

	

	
	
	
}
