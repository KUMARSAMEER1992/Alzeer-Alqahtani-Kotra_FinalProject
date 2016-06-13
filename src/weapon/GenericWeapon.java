package weapon;

public abstract class GenericWeapon implements Weapon
{
	private int baseDamage;
	private int damage;
	private int points;
	
	public abstract int getBaseDamge();
	public abstract char getChar();
	public String getItemType()
	{
		return "Weapon";
	}


}
