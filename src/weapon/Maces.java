package weapon;

import lifeform.Damage;

public class Maces extends GenericWeapon
{

	@Override
	public Damage calculateDamage() 
	{
		return null;
	}

	@Override
	public int getBaseDamge() 
	{
		return 10;
	}

	@Override
	public char getChar() 
	{
		return 'G';
	}

}
