package weapon;

public class Maces extends GenericWeapon
{

	@Override
	public int calculateDamage() 
	{
		return 0;
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
