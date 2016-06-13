package weapon;

import lifeform.Damage;

public class Swords extends GenericWeapon
{

	@Override
	public Damage calculateDamage()
	{
		Damage damage=new Damage("PLAYER",getBaseDamge()*3);
		return damage;
	}

	@Override
	public int getBaseDamge() 
	{
		return 20;
	}

	@Override
	public char getChar() 
	{
		return 'S';
	}

	

}
