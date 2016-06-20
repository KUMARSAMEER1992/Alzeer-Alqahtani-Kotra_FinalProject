package items.potion;
import environment.StringConstants;
/**
 * PotionFactory class to create potions
 * @author Dalal Alzeer
 *
 */

public class PotionFactory 
{
	/**
	 * to create potion based on the type
	 * @param type
	 * @return Potion
	 */
	public static Potion createPotion(String type)
	{ 
		Potion potion=new HealthPotion();
		if (type.equals(StringConstants.ACID))
			{
			potion = new AcidAddon(potion);	
			}
			else if (type.equals(StringConstants.POISON))
				{
				potion = new PoisonAddon(potion);	
				}
		return potion;
				
	}
}
