package player;

import environment.StringConstants;
import items.armor.Armor;
import lifeform.Damage;
import lifeform.LifeForm;
import weapon.Weapon;
/**
 * Player class consists methods related to Player. Player is a LifeForm.
 * @author Dalal Alzeer
 */
public class Player extends LifeForm
{
	private static Player player;
	private Weapon weapon;
	private Armor armor;
	private Damage damage;
	private int keyNum;
	
	/**
	 * Create an instance of player with given values.
	 * @param name
	 * @param points
	 * @param Strength
	 */
	private Player(String name, int points, int Strength)
	{
		super(name, points, Strength);
		keyNum = 0;
	}
	/**
	 * Singleton method.
	 * @return Player instance
	 */
	public static Player getPlayer()
	{
		if (player == null)
			player = new Player("bob", 50, 5);

		return player;
	}
	/**
	 * @return the character that displayed in the map
	 */
	@Override
	public char getChar()
	{
		return 'P';
	}
	/**
	 * @return the type of the item.
	 */
	@Override
	public String getItemType()
	{
		return "PLAYER";
	}
	/**
	 * Reduces the damage from current life points.
	 */
	@Override
	public void takeHit(Damage damage)
	{
		this.damage = damage;
		if (armor != null)
		{
			damage = armor.reduceDamage(damage);
		}
		if (damage.getDamagePoints() > 0)
		{
			currentLifePoints = currentLifePoints - damage.getDamagePoints();
			if (currentLifePoints < 0)
				currentLifePoints = 0;
		}
	}
	/**
	 * reset instance after each test
	 */
	static void resetInstance()
	{
		player = null;
	}
	/**
	 * calculate player Damage
	 */
	@Override
	public Damage calculateDamage()
	{

		if (weapon == null)
		{
			Damage damage = new Damage(StringConstants.PLAYER, super.getAttachStrength());
			return damage;
		}
		else
		{
			return new Damage(StringConstants.PLAYER, weapon.getBaseDamage());
		}
	}
	/**
	 * pickup a weapon 
	 * @param weapon
	 */
	public void pickUp(Weapon weapon)
	{
		if (this.weapon == null)
		{
			this.weapon = weapon;
		}
	}
	/**
	 * drop the weapon
	 * @return
	 */
	public Weapon dropWeapon()
	{
		Weapon temp = weapon;
		this.weapon = null;
		return temp;
	}
	/**
	 * to increase player life points
	 * @param lf
	 */
	public void increaseCurrentLifePoints(int lf)
	{
		if (currentLifePoints > 0)
			currentLifePoints = currentLifePoints + lf;
	}
	/**
	 * @return player's weapon
	 */
	public Weapon getWeapon()
	{
		return weapon;
	}
	/**
	 * increase number of keys with player
	 * @param keys
	 */
	public void increaseKey(int keys)
	{
		keyNum += keys;
	}
	/**
	 * decrease number of keys with player
	 */
	public boolean decreaseKey()
	{
		if (keyNum > 0)
		{
			keyNum--;
			return true;
		}
		else
			return false;
	}
	/**
	 * set armor for player
	 * @param r
	 */
	public void setArmor(Armor r)
	{
		armor = r;
	}
	/**
	 * @return player's armor 
	 */
	public Armor getArmor()
	{
		return armor;
	}

}
