package weapon;

import lifeform.Damage;
import environment.MapItem;

public interface Weapon extends MapItem
{
	public Damage calculateDamage();
	 
}
