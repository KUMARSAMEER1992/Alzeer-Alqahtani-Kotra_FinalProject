package items.armor;

import environment.Environment;
import environment.StringConstants;
import exception.ArmorException;
import player.Player;
import time.TimeObserver;

/**
 * Addon class for Armor.
 * ArmorAddon is an Armor.
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
	 * Creates an ArmorAddon with give armor and Rounds.
	 * @param armor : Armor to which add on to be added.
	 * @param maxRounds : Max Number of rounds the Armor can stay.
	 * @throws ArmorException if we try to add ArmorAddon to a ArmorAddon.
	 */
	public ArmorAddon(Armor armor, int maxRounds) throws ArmorException
	{
		if (armor instanceof ArmorAddon)
		{
			throw new ArmorException("You can add only 1 addon");
		}
		else
		{
			this.armor = armor;
			this.maxRounds = maxRounds;
		}
	}

	/**
	 * When the time is changed the timer notifies this method of the Observer.
	 * @param time : updated time
	 */
	@Override
	public void updateTime(int time)
	{
		Environment environment = Environment.getWorldInstance();
		maxRounds--;
		if (maxRounds <= 0)
		{
			Player player = Player.getPlayer();
			environment.removeTimerObserver(this);
			// environment.getTimer().removeTimeObserver(this);
			Armor temp = player.getArmor();
			if (temp instanceof ArmorAddon)
			{
				temp = ((ArmorAddon) temp).armor;
				player.setArmor(temp);
			}
		}
		environment.informDisplay();
	}

	/**
	 * @return the type of the item.
	 */
	@Override
	public String getItemType()
	{
		return StringConstants.ARMOR;
	}

	/**
	 * @return the max rounds remaining for Armor to be live.
	 */
	public int getMaxRounds()
	{
		return maxRounds;
	}

}
