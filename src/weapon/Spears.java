package weapon;

import lifeform.Damage;

public class Spears extends GenericWeapon
{

	@Override
	public Damage calculateDamage() 
	{
		Damage damage=new Damage("PLAYER",getBaseDamge()*2);
		return damage;
	}

	@Override
	public int getBaseDamge() 
	{
		return 15;
	}

	@Override
	public char getChar() 
	{
		return 'R';
	}

}
