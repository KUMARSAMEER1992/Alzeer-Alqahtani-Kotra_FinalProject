package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;

import environment.Environment;
import environment.MapItem;
import items.armor.Armor;
import items.armor.ArmorAddon;
import player.Player;

/**
 * This class Displays the Environment.
 * @author Sameer Kumar Kotra
 */
public class GameDisplay
{
	/**
	 * Empty String to be displayed when cell is empty.
	 */
	public final static String EMPTY = ".";

	/**
	 * JFrame to display main content.
	 */
	private JFrame frame;
	/**
	 * JFrame to display info panel.
	 */
	private JPanel infoPanel;
	/**
	 * JFrame to display Map Content.
	 */
	private JPanel mapPanel;
	/**
	 * JFrame to display the Cells in Environment.
	 */
	private JPanel mapArea;
	/**
	 * JLables to store Display details of each Cell.
	 */
	private JLabel[][] lables;
	/**
	 * JLables to store Player details of each Cell.
	 */
	private JLabel[] playerDetails;
	/**
	 * int to store the number of rows displayed in the Map.
	 */
	private int rows;
	/**
	 * int to store the number of columns displayed in the Map.
	 */
	private int cols;
	/**
	 * JFrame to display legend panel.
	 */
	private JPanel legendPanel;
	/**
	 * JFrame to display info Player Details.
	 */
	private JPanel playerInfoPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		GameDisplay window = new GameDisplay();
	}

	/**
	 * Create the application.
	 */
	public GameDisplay()
	{
		rows = Environment.ROWS;
		cols = Environment.COLS;
		playerDetails = new JLabel[5];
		for (int i = 0; i < 5; i++)
		{
			playerDetails[i] = new JLabel(EMPTY);
		}
		lables = new JLabel[rows][cols];
		for (int i = 0; i < rows; i++)
		{
			for (int j = 0; j < cols; j++)
			{
				lables[i][j] = new JLabel(EMPTY);
			}
		}
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame();
		frame.setBounds(0, 0, 950, 715);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));

		buildInfoPanel();
		buildMapPanel();
		update();
	}

	/**
	 * Builds the content of the Map Panel.
	 */
	private void buildMapPanel()
	{
		mapPanel = new JPanel();
		mapPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		frame.getContentPane().add(mapPanel, BorderLayout.CENTER);
		mapPanel.setLayout(new BorderLayout(0, 0));
		JPanel mapName = new JPanel();
		mapPanel.add(mapName, BorderLayout.NORTH);
		JLabel lblMap = new JLabel("Map");
		lblMap.setFont(new Font("Tahoma", Font.BOLD, 15));
		mapName.add(lblMap);
		JScrollPane scrollPane = new JScrollPane();
		mapPanel.add(scrollPane, BorderLayout.CENTER);

		mapArea = new JPanel();
		// mapPanel.add(mapArea, BorderLayout.CENTER);
		scrollPane.setViewportView(mapArea);

		mapArea.setLayout(new GridLayout(rows, cols, 0, 0));

		for (int i = 0; i < rows; i++)
		{
			for (int j = 0; j < cols; j++)
			{
				mapArea.add(lables[i][j]);
			}
		}

	}

	/**
	 * Builds the content of the Info Panel.
	 */
	private void buildInfoPanel()
	{
		infoPanel = new JPanel();
		infoPanel.setName("Legend");
		frame.getContentPane().add(infoPanel, BorderLayout.EAST);
		infoPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		infoPanel.setLayout(new BorderLayout(0, 0));

		buildLegendPanel();
		builbPlayerDetails();
	}

	/**
	 * Builds the content of the Player Details Panel.
	 */
	private void builbPlayerDetails()
	{
		playerInfoPanel = new JPanel();
		playerInfoPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		infoPanel.add(playerInfoPanel, BorderLayout.CENTER);
		playerInfoPanel.setLayout(new GridLayout(11, 1, 0, 0));
		JLabel lblNewLabel = new JLabel("Info");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		playerInfoPanel.add(lblNewLabel);

		playerInfoPanel.add(new JLabel(" LifePoints "));
		playerInfoPanel.add(playerDetails[0]);

		playerInfoPanel.add(new JLabel(" Armor "));
		playerInfoPanel.add(playerDetails[1]);

		playerInfoPanel.add(new JLabel(" Weapon "));
		playerInfoPanel.add(playerDetails[2]);

		playerInfoPanel.add(new JLabel(" Keys "));
		playerInfoPanel.add(playerDetails[3]);

		playerInfoPanel.add(new JLabel(" Round "));
		playerInfoPanel.add(playerDetails[4]);
	}

	/**
	 * Builds the content of the Legend Panel.
	 */
	private void buildLegendPanel()
	{

		legendPanel = new JPanel();
		legendPanel.setAlignmentY(0.0f);
		legendPanel.setAlignmentX(0.0f);
		legendPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		infoPanel.add(legendPanel, BorderLayout.EAST);
		legendPanel.setLayout(new GridLayout(19, 1, 0, 0));

		JLabel lblNewLabel = new JLabel("Legend");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		legendPanel.add(lblNewLabel);

		legendPanel.add(new JLabel(" P:player"));
		legendPanel.add(new JLabel(" I:PoisonPotion"));
		legendPanel.add(new JLabel(" H:HealthPotion"));
		legendPanel.add(new JLabel(" J:AcidPotion"));
		legendPanel.add(new JLabel(" S:Sword"));
		legendPanel.add(new JLabel(" R:Spear"));
		legendPanel.add(new JLabel(" M:Mace"));
		legendPanel.add(new JLabel(" W:weakAttachment"));
		legendPanel.add(new JLabel(" G:strongAttachment"));
		legendPanel.add(new JLabel(" K:Key"));
		legendPanel.add(new JLabel(" #:Wall"));
		legendPanel.add(new JLabel(" !:Door"));
		legendPanel.add(new JLabel(" A:NormalArmor"));
		legendPanel.add(new JLabel(" C:AcidArmor"));
		legendPanel.add(new JLabel(" O:PoisionArmor"));
		legendPanel.add(new JLabel(" N:NormalCreature"));
		legendPanel.add(new JLabel(" E:PoisionCreature"));
		legendPanel.add(new JLabel(" D:AcidCreature"));

	}

	/**
	 * Updates the display according to changes in the Environment.
	 */
	public void update()
	{
		Environment environment = Environment.getWorldInstance();
		Player player = Player.getPlayer();
		for (int i = 0; i < rows; i++)
		{
			for (int j = 0; j < cols; j++)
			{
				lables[i][j].setText(getdisplayString(environment.getMapItem(i, j)));
			}
		}
		playerDetails[0].setText(" " + player.getCurrentLifePoints());
		playerDetails[1].setText(" " + getdisplayString(player.getArmor()));
		playerDetails[2].setText(" " + getdisplayString(player.getWeapon()));
		playerDetails[3].setText(player.getKey() + "");
		Armor temp = player.getArmor();
		if (temp != null && temp instanceof ArmorAddon)
		{
			int rounds = ((ArmorAddon) temp).getMaxRounds();
			playerDetails[4].setText(rounds + "");
		}
		else
		{
			playerDetails[4].setText(EMPTY);
		}
	}

	/**
	 * Gets the String to be displayed on the Map.
	 * @param item : item in the Cell.
	 * @return the String related to the item or returns empty if cell is null.
	 */
	private String getdisplayString(MapItem item)
	{
		if (item == null)
			return EMPTY;
		else
			return "" + item.getChar();
	}

	/**
	 * sets the start cell and end cell colors in the game.
	 */
	public void setStartAndEnd()
	{
		lables[rows - 2][cols - 2].setOpaque(true);
		lables[rows - 2][cols - 2].setBackground(Color.GREEN);
		lables[1][1].setOpaque(true);
		lables[1][1].setBackground(Color.RED);
	}
}
