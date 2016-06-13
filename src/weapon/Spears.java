package weapon;

public class Spears extends GenericWeapon
{

	@Override
	public int calculateDamage() 
	{
		return 0;
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
