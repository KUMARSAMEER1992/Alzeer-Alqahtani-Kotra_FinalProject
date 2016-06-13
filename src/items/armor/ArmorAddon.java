package items.armor;

import exception.ArmorException;
import time.TimeObserver;

/**
 * @author Sameer Kumar Kotra
 */
public abstract class ArmorAddon implements Armor, TimeObserver
{
	/**
	 * Armor to store armor.
	 */
	protected Armor armor;

	/**
	 * int to store max Rounds of Armor.
	 */
	private int maxRounds;

	/**
	 * int to store current round of Armor.
	 */
	private int currentRound;

	public ArmorAddon(Armor armor, int maxRounds) throws ArmorException
	{
		int counter = 0;
		Armor temp = armor;
		currentRound = 0;
		this.maxRounds = maxRounds;
		while (true)
		{
			if (temp instanceof ArmorAddon)
			{
				temp = ((ArmorAddon) temp).armor;
				counter++;
			}
			else
			{
				break;
			}
		}
		if (counter < 1)
		{
			this.armor = armor;
		}
		else
		{
			throw new ArmorException("You can add only 1 addon");
		}
	}

	@Override
	public void updateTime(int time)
	{
		currentRound++;
	}

	public boolean isLive()
	{
		if (currentRound < maxRounds)
			return true;
		else
			return false;
	}

	@Override
	public String getItemType()
	{
		return "ARMOR";
	}
}
