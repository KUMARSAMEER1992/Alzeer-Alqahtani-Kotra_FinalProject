package items.armor;

import environment.MapItem;
import lifeform.Damage;

/**
 * Interface for Armor.
 * @author Sameer Kumar Kotra
 */
public interface Armor extends MapItem
{

	/**
	 * calculates the remaining damage after Armor absorbs the damage.
	 * @param damage : original damage.
	 * @return the reduced damage.
	 */
	public Damage reduceDamage(Damage damage);
}
