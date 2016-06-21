package weapon;
import environment.MapItem;
import lifeform.Damage;

/**
 * Interface to declare weapon methods.
 * @author Dalal Alzeer
 */
public interface Weapon extends MapItem
{
	
	/**
	 * Calculates the damage done by a weapon.
	 * @return the damage.
	 */
	public Damage calculateDamage();
	/**
	 * @return the base damage of the weapon.
	 */
	public int getBaseDamage();
	

}
