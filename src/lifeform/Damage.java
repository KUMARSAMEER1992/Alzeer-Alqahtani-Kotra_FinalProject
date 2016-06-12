package lifeform;

/**
 * @author Sameer Kumar Kotra
 */
public class Damage
{
	private String damageType;
	private int damagePoints;

	public Damage(String damageType, int damagePoints)
	{
		this.damageType = damageType;
		this.damagePoints = damagePoints;
	}

	public String getDamageType()
	{
		return damageType;
	}

	public void setDamageType(String damageType)
	{
		this.damageType = damageType;
	}

	public int getDamagePoints()
	{
		return damagePoints;
	}

	public void setDamagePoints(int damagePoints)
	{
		this.damagePoints = damagePoints;
	}

}
