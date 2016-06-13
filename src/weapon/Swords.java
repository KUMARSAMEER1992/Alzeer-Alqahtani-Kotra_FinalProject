package weapon;

public class Swords extends GenericWeapon
{

	@Override
	public int calculateDamage()
	{
		return 0;
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
