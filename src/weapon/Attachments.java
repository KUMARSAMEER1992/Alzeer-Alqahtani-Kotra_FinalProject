package weapon;

public abstract class Attachments implements Weapon
{
	protected Weapon weapon;
	
	public abstract int calculateDamage();

}
