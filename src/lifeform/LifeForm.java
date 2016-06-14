package lifeform;

import environment.MapItem;

/**
 * This class consists members and functions related to LifeForm.
 * LifeForm is a MapItem.
 * @author Sameer Kumar Kotra
 */
public abstract class LifeForm implements MapItem
{
	/**
	 * String to store the name of the LifeForm.
	 */
	private String myName;

	/**
	 * int to store the life points of the LifeForm. It can be accessed by sub
	 * classes.
	 */
	protected int currentLifePoints;

	/**
	 * int to store the strength of the LifeForm.
	 */
	protected int attachStrength;

	/**
	 * int to store X coordinate in Environment.
	 */
	private int locationX;

	/**
	 * int to store Y coordinate in Environment.
	 */
	private int locationY;

	/**
	 * Create an instance of LifeForm with given values.
	 * @param name: The name of the life form.
	 * @param points :The current starting life points of the life form.
	 */
	public LifeForm(String name, int points)
	{
		myName = name;
		currentLifePoints = (points >= 0) ? points : 0;
		attachStrength = 0;
		// weapon = null;
		locationX = -1;
		locationY = -1;
	}

	/**
	 * Create an instance of LifeForm with given values.
	 * @param name: The name of the life form.
	 * @param points : The current starting life points of the life form.
	 * @param strength: The Strength of the LifeForm.
	 */
	public LifeForm(String name, int points, int strength)
	{
		this(name, points);
		this.attachStrength = (strength >= 0) ? strength : 0;
	}

	/**
	 * Returns the name of the LifeForm.
	 * @return the name of the life form.
	 */
	public String getName()
	{
		return myName;
	}

	/**
	 * Returns the current life points of a LifeForm.
	 * @return the amount of current life points the life form has.
	 */
	public int getCurrentLifePoints()
	{
		return currentLifePoints;
	}

	/**
	 * Reduces the damage from current life points.
	 * @param damage : specifies the damage to the LifeForm.
	 */
	public abstract void takeHit(Damage damage);

	/**
	 * Returns the strength of a LifeForm.
	 * @return the strength the life form has.
	 */
	public int getAttachStrength()
	{
		return attachStrength;
	}

	/**
	 * @return the x coordinate in environment.
	 */
	public int getLocationX()
	{
		return this.locationX;
	}

	/**
	 * @return the y coordinate in environment.
	 */
	public int getLocationY()
	{
		return this.locationY;
	}

	/**
	 * Sets the location X & Y value.
	 * @param x : value of X to be stored in LifeForm.
	 * @param y : value of Y to be stored in LifeForm.
	 */
	public void setLocationXY(int x, int y)
	{
		this.locationX = x;
		this.locationY = y;
	}

	/**
	 * Resets the location X , Y values.
	 */
	public void removeLocationXY()
	{
		this.locationX = -1;
		this.locationY = -1;
	}

	/**
	 * @return the damage caused by the LifeForm.
	 */
	public abstract Damage calculateDamage();

	/**
	 * Used to attack a LifeForm.
	 * lifeForm1.attack(lifeForm2).
	 * lifeForm1:attacker.
	 * lifeForm2:attacked.
	 * @param lifeForm2 : It is attached by the calling LifeForm.
	 */
	public void attack(LifeForm lifeForm2)
	{
		Damage damage = this.calculateDamage();
<<<<<<< HEAD
		 
=======

>>>>>>> master
		if (getCurrentLifePoints() > 0)
		{
			lifeForm2.takeHit(damage);
		}
	}

}
