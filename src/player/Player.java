package player;

import environment.StringConstants;
import items.armor.Armor;
import lifeform.Damage;
import lifeform.LifeForm;
import weapon.Weapon;

public class Player extends LifeForm
{
	private static Player player;
	private Weapon weapon;
	private Armor armor;
	private Damage damage;
	int keyNum;

	private Player(String name, int points, int Strength)
	{
		super(name, points, Strength);
		keyNum = 0;

	}

	public static Player getPlayer()
	{
		if (player == null)
			player = new Player("bob", 50, 5);

		return player;
	}

	@Override
	public char getChar()
	{

		return 'P';
	}

	@Override
	public String getItemType()
	{
		return "Player";
	}

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

	static void resetInstance()
	{
		player = null;
	}

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

	public void pickUp(Weapon weapon)
	{
		if (this.weapon == null)
		{
			this.weapon = weapon;
		}
	}

	public Weapon dropWeapon()
	{
		Weapon temp = weapon;
		this.weapon = null;
		return temp;
	}

	public void increaseCurrentLifePoints(int lf)
	{
		if (currentLifePoints > 0)
			currentLifePoints = currentLifePoints + lf;
	}

	public Weapon getWeapon()
	{
		return weapon;
	}

	public void increaseKey(int keys)
	{
		keyNum += keys;
	}

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

	public void setArmor(Armor r)
	{
		armor = r;
	}

	public Armor getArmor()
	{
		return armor;
	}

}
