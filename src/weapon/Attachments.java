package weapon;

import lifeform.Damage;

public abstract class Attachments implements Weapon
{
	protected Weapon weapon;
	
	public abstract Damage calculateDamage();

}
