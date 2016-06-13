/**
 * @author Sameer Kumar Kotra
 */
package environment;

/**
 * @author Sameer Kumar Kotra
 */
public class Environment
{
	// TODO
	public final static int ROWS = 100;
	public final static int COLS = 100;

	/**
	 * Environment to store instance.
	 */
	private static Environment theWorld;

	private Cell[][] cells;

	/**
	 * Create an instance of Environment which has the given number of rows and
	 * Columns to store Cells.
	 * Constructor is private to create single ton pattern.
	 * @param row: Number of rows
	 * @param col :Number of columns.
	 */
	private Environment()
	{
		cells = new Cell[ROWS][COLS];
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
	 * Returns the Life form at cells[row][col].
	 * @return the LifeForm at specified location.
	 */
	public MapItem getMapItem(int row, int col)
	{
		if (row < ROWS && col < COLS)
		{
			return cells[row][col].getMapItem();
		}
		else
		{
			return null;
		}
	}

	/**
	 * Adds the LifeForm to the Cell at cells[row][col]. Will not add if the row
	 * and column are invalid or if LifeForm already in the Cell.
	 * @param row: Row at which LifieForm to be added.
	 * @param col: column at which LifieForm to be added.
	 * @param entity: LifeForm object to be store in the Cell.
	 * @return true if added, false otherwise.
	 */
	public boolean addMapItem(int row, int col, MapItem item)
	{
		if (row < ROWS && col < COLS)
		{
			return cells[row][col].addMapItem(item);
		}
		else
		{
			return false;
		}
	}

	/**
	 * Removes the LifeForm at the cells[row][col].
	 * @return LifeForm removed, null if none is present.
	 */
	public MapItem removeMapItem(int row, int col)
	{
		if (row < ROWS && col < COLS)
		{
			MapItem temp = cells[row][col].removeMapItem();
			return temp;
		}
		else
		{
			return null;
		}
	}

}
