package environment;

import javax.swing.JOptionPane;

import items.Key;
import items.Wall;
import items.armor.ArmorAddon;
import items.armor.ArmorFactory;
import items.potion.Potion;
import items.potion.PotionDetails;
import lifeform.LifeForm;
import player.Player;
import time.SimpleTimer;
import ui.GameDisplay;
import weapon.Weapon;

/**
 * This class contains contains details of Environment.
 * It is a Singleton Class.
 * @author Sameer Kumar Kotra
 */
public class Environment
{
	/**
	 * final int to store no of rows of the Environment.
	 */
	public final static int ROWS = 30;
	/**
	 * final int to store no of columns of the environment.
	 */
	public final static int COLS = 50;

	/**
	 * Environment to store instance.
	 */
	private static Environment theWorld;

	/**
	 * Array of Cell to store multiple Cells.
	 */
	private Cell[][] cells;

	/**
	 * GameDispaly to hold display instance.
	 */
	private GameDisplay display;

	/**
	 * Simple timer to keep track of the time.
	 */
	private SimpleTimer timer;

	/**
	 * Create an instance of Environment which has the given number of rows and
	 * Columns to store Cells.
	 * Constructor is private to create single ton pattern.
	 */
	private Environment()
	{
		cells = new Cell[ROWS][COLS];
		timer = new SimpleTimer(1000);
		timer.start();
		for (int i = 0; i < ROWS; i++)
		{
			for (int j = 0; j < COLS; j++)
			{
				cells[i][j] = new Cell();
			}
		}
	}

	/**
	 * Singleton method.
	 * @return the Environment instance.
	 */
	public static Environment getWorldInstance()
	{
		if (theWorld == null)
			theWorld = new Environment();
		return theWorld;
	}

	/**
	 * Singleton method.
	 * Reset the instance of Environment used for testing.
	 */
	static void resetInstance()
	{
		theWorld = null;
	}

	/**
	 * Returns the MapItem at cells[row][col].
	 * @return the MapItem at specified location.
	 */
	public MapItem getMapItem(int row, int col)
	{
		if (row >= 0 && row < ROWS && col >= 0 && col < COLS)
		{
			return cells[row][col].getMapItem();
		}
		else
		{
			return null;
		}
	}

	/**
	 * Adds the MapItem to the Cell at cells[row][col]. Will not add if the row
	 * and column are invalid or if LifeForm already in the Cell.
	 * @param row: Row at which LifieForm to be added.
	 * @param col: column at which LifieForm to be added.
	 * @param item: MapItem object to be store in the Cell.
	 * @return true if added, false otherwise.
	 */
	public boolean addMapItem(int row, int col, MapItem item)
	{
		if (row >= 0 && row < ROWS && col >= 0 && col < COLS)
		{
			boolean temp = cells[row][col].addMapItem(item);
			if (temp && item instanceof LifeForm)
			{
				((LifeForm) item).setLocationXY(row, col);
			}
			return temp;
		}
		else
		{
			return false;
		}
	}

	/**
	 * Removes the MapItem at the cells[row][col].
	 * @return MapItem removed, null if none is present.
	 */
	public MapItem removeMapItem(int row, int col)
	{
		if (row >= 0 && row < ROWS && col >= 0 && col < COLS)
		{
			MapItem temp = cells[row][col].removeMapItem();
			return temp;
		}
		else
		{
			return null;
		}
	}

	/**
	 * moves the Player in the direction specified.
	 * @param direction: the direction in which player to be moved.
	 */
	public void movePlayer(int direction)
	{
		LifeForm player = Player.getPlayer();
		int x = player.getLocationX();
		int y = player.getLocationY();
		int temp;
		switch (direction)
		{
		case 0:
			temp = x - 1;
			if (checkCordinates(temp, y))
			{
				if (isEmpty(temp, y))
				{
					swapLocation(x, y, temp, y);
				}
				else
				{
					if (isWeapon(temp, y))
					{
						updatePlayerWeapon(x, y, temp, y);
					}
					else if (checkItem(temp, y))
					{
						swapLocation(x, y, temp, y);
					}

				}
			}
			break;
		case 1:
			temp = y + 1;
			if (checkCordinates(x, temp))
			{
				if (isEmpty(x, temp))
				{
					swapLocation(x, y, x, temp);
				}
				else
				{
					if (isWeapon(x, temp))
					{
						updatePlayerWeapon(x, y, x, temp);
					}
					else if (checkItem(x, temp))
					{
						swapLocation(x, y, x, temp);
					}
				}
			}
			break;
		case 2:
			temp = x + 1;
			if (checkCordinates(temp, y))
			{
				if (isEmpty(temp, y))
				{
					swapLocation(x, y, temp, y);
				}
				else
				{
					if (isWeapon(temp, y))
					{
						updatePlayerWeapon(x, y, temp, y);
					}
					else if (checkItem(temp, y))
					{
						swapLocation(x, y, temp, y);
					}
				}
			}
			break;
		case 3:
			temp = y - 1;
			if (checkCordinates(x, temp))
			{
				if (isEmpty(x, temp))
				{
					swapLocation(x, y, x, temp);
				}
				else
				{
					if (isWeapon(x, temp))
					{
						updatePlayerWeapon(x, y, x, temp);
					}
					else if (checkItem(x, temp))
					{
						swapLocation(x, y, x, temp);
					}
				}
			}
			break;
		}
	}

	/**
	 * Picks the the weapon if no weapon is there with Player.
	 * If player has a weapon it asks the player weather to exchange or not.If
	 * yes exchanges the weapon and moves Player else the Player stays at same
	 * location.
	 * @param xOld : Old x coordinates of the player.
	 * @param yOld : Old y coordinates of the player.
	 * @param xNew : New y coordinates of the player.
	 * @param yNew : New y coordinates of the player.
	 */
	private void updatePlayerWeapon(int xOld, int yOld, int xNew, int yNew)
	{
		Player player = Player.getPlayer();
		if (player.getWeapon() == null)
		{
			Weapon weapon = (Weapon) cells[xNew][yNew].removeMapItem();
			player.pickUp(weapon);
			swapLocation(xOld, yOld, xNew, yNew);
		}
		else
		{
			int option = JOptionPane.showConfirmDialog(null, "Do you want to swap weapons?");
			if (option == JOptionPane.YES_OPTION)
			{
				Weapon temp = player.dropWeapon();
				Weapon weapon = (Weapon) cells[xNew][yNew].removeMapItem();
				player.pickUp(weapon);
				swapLocation(xOld, yOld, xNew, yNew);
				cells[xOld][yOld].addMapItem(temp);
			}
		}
	}

	/**
	 * checks weather the item at that location is a weapon or not.
	 * @param row : x coordinate of the location.
	 * @param col : y coordinate of the location.
	 * @return true if it is a weapon else returns false.
	 */
	private boolean isWeapon(int row, int col)
	{
		if (cells[row][col].getMapItem().getItemType().equals(StringConstants.WEAPON))
		{
			return true;
		}
		return false;
	}

	/**
	 * Determines the item at the cell and performs the respective action.
	 * @param row : x coordinate of the location.
	 * @param col : y coordinate of the location.
	 * @return true if operation success else returns false.
	 */
	private boolean checkItem(int row, int col)
	{
		Player player = Player.getPlayer();
		switch (cells[row][col].getMapItem().getItemType())
		{
		case StringConstants.KEY:
			Key key = (Key) cells[row][col].removeMapItem();
			player.increaseKey(key.getKeys());
			return true;
		case StringConstants.WALL:
			Wall wall = (Wall) cells[row][col].getMapItem();
			if (wall.isDoor() && !wall.isOpen())
			{
				if (player.decreaseKey())
				{
					cells[row][col].removeMapItem();
					return true;
				}
			}
			return false;
		case StringConstants.POTION:
			PotionDetails details = ((Potion) cells[row][col].removeMapItem()).getDetails();
			updatePlayerPortion(details);
			return true;
		}
		return false;
	}

	/**
	 * Reads the PortionDetails and updates the player accordingly.
	 * @param details : Portion details contains the details of the portion.
	 */
	private void updatePlayerPortion(PotionDetails details)
	{
		Player player = Player.getPlayer();
		if (details.getType().equals(StringConstants.HEALTH))
		{
			player.increaseCurrentLifePoints(details.getHealthPoints());
		}
		else
		{
			ArmorAddon armor = ArmorFactory.buildArmor(player.getArmor(), details);
			timer.addTimeObserver(armor);
			player.setArmor(armor);
		}
	}

	/**
	 * Checks for the Creatures in 4 directions and attacks if present.
	 * @param row : x coordinate of the location.
	 * @param col : y coordinate of the location.
	 */
	private void checkAttackCondition(int row, int col)
	{
		if (checkCordinates(row - 1, col) && !isEmpty(row - 1, col) && isCreature(row - 1, col))
		{
			attack(row - 1, col);
		}

		if (checkCordinates(row + 1, col) && !isEmpty(row + 1, col) && isCreature(row + 1, col))
		{
			attack(row + 1, col);
		}

		if (checkCordinates(row, col - 1) && !isEmpty(row, col - 1) && isCreature(row, col - 1))
		{
			attack(row, col - 1);
		}

		if (checkCordinates(row, col + 1) && !isEmpty(row, col + 1) && isCreature(row, col + 1))
		{
			attack(row, col + 1);
		}
	}

	/**
	 * Checks the item present the location is Creature or not.
	 * @param row : x coordinate of the location.
	 * @param col : y coordinate of the location.
	 * @return true if it is a Creature else returns false.
	 */
	private boolean isCreature(int row, int col)
	{
		if (cells[row][col].getMapItem().getItemType().equals(StringConstants.CREATURE))
		{
			return true;
		}
		return false;
	}

	/**
	 * Player attacks the Creature the attack continues until either player or
	 * the creature is dead.
	 * @param row : x coordinate of the location.
	 * @param col : y coordinate of the location.
	 */
	private void attack(int row, int col)
	{
		Player player = Player.getPlayer();
		LifeForm creature = (LifeForm) cells[row][col].getMapItem();
		while (isLive(creature))
		{
			player.attack(creature);
			creature.attack(player);
		}
		if (player.getCurrentLifePoints() == 0)
		{
			JOptionPane.showMessageDialog(null, "Player Dead Game Complete");
			removeMapItem(player.getLocationX(), player.getLocationY());
			endGame();
		}
		if (creature.getCurrentLifePoints() == 0)
		{
			removeMapItem(row, col);
		}
	}

	/**
	 * Checks weather the player or the Creature in attack dead.
	 * @param creature : Creature to check
	 * @return
	 */
	private boolean isLive(LifeForm creature)
	{
		Player player = Player.getPlayer();
		if (player.getCurrentLifePoints() > 0 && creature.getCurrentLifePoints() > 0)
		{
			return true;
		}
		return false;
	}

	/**
	 * Checks weather the Cell is empty or not.
	 * @param row : x coordinate of the location.
	 * @param col : y coordinate of the location.
	 * @return true if empty else return false.
	 */
	private boolean isEmpty(int row, int col)
	{
		if (cells[row][col].getMapItem() == null)
			return true;
		else
			return false;
	}

	/**
	 * Checks the validity of the coordinates .
	 * @param x : Row to be checked.
	 * @param y : Column to be checked.
	 * @return true if LifeForm can be moved else returns false.
	 */
	private boolean checkCordinates(int x, int y)
	{
		if (x >= 0 && x < ROWS && y >= 0 && y < COLS)
		{
			return true;
		}
		return false;
	}

	/**
	 * Moves the LifeForm from old location to new location in the Environment.
	 * @param xOld : Old row of the LifeForm
	 * @param yOld : Old column of the LifeForm
	 * @param xNew : New row of the LifeForm
	 * @param yNew : New column of the LifeForm
	 */
	private void swapLocation(int xOld, int yOld, int xNew, int yNew)
	{
		MapItem player = cells[xOld][yOld].removeMapItem();
		addMapItem(xNew, yNew, player);
		if (xNew == ROWS - 2 && yNew == COLS - 2)
		{
			JOptionPane.showMessageDialog(null, "Game Complete");
			endGame();
		}
		checkAttackCondition(xNew, yNew);
	}

	/**
	 * TODO
	 */
	private void endGame()
	{
		timer.stopTimer();
		try
		{
			Thread.sleep(1500);
		}
		catch (InterruptedException e)
		{
			System.out.println(e);
		}
		System.exit(0);
	}

	/**
	 * Updates display about that Environment has changed.
	 */
	public void informDisplay()
	{
		if (display != null)
		{
			display.update();
		}
	}

	/**
	 * Sets the Display object to Environment.
	 * @param display : Display to be added.
	 */
	public void setDisplay(GameDisplay display)
	{
		this.display = display;
	}

	/**
	 * removes the observer from the list.
	 * @param armorAddon
	 */
	public void removeTimerObserver(ArmorAddon observer)
	{
		timer.removeTimeObserver(observer);
	}

}
