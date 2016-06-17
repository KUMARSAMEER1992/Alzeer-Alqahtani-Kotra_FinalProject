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
import player.Player;

/**
 * @author Sameer Kumar Kotra
 */
public class GameDisplay
{
	public final static String EMPTY = ".";
	private JFrame frame;
	private JPanel infoPanel;
	private JPanel mapPanel;
	private JPanel mapArea;
	private JLabel[][] lables;
	private JLabel[] playerDetails;
	private int rows;
	private int cols;
	private JPanel legendPanel;
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
		playerDetails = new JLabel[4];
		for (int i = 0; i < 4; i++)
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
	}

	/**
	 * 
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
	 * 
	 */
	private void builbPlayerDetails()
	{
		// TODO Auto-generated method stub

		playerInfoPanel = new JPanel();
		playerInfoPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		infoPanel.add(playerInfoPanel, BorderLayout.CENTER);
		playerInfoPanel.setLayout(new GridLayout(9, 0, 0, 0));
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
	}

	/**
	 * 
	 */
	private void buildLegendPanel()
	{
		legendPanel = new JPanel();
		legendPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		infoPanel.add(legendPanel, BorderLayout.EAST);
		legendPanel.setLayout(new GridLayout(15, 0, 0, 0));

		JLabel lblNewLabel = new JLabel("Legend");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		legendPanel.add(lblNewLabel);

		legendPanel.add(new JLabel(" P:player"));
		legendPanel.add(new JLabel(" I:PoisonAddon"));
		legendPanel.add(new JLabel(" H:HealthPotion"));
		legendPanel.add(new JLabel(" J:AcidAddon"));
		legendPanel.add(new JLabel(" S:Sword"));
		legendPanel.add(new JLabel(" R:Spear"));
		legendPanel.add(new JLabel(" M:Mace"));
		legendPanel.add(new JLabel(" T:Attachment"));
		legendPanel.add(new JLabel(" K:Key"));
		legendPanel.add(new JLabel(" A:NormalArmor"));
		legendPanel.add(new JLabel(" C:AcidArmor"));
		legendPanel.add(new JLabel(" O:PoisionArmor"));
		legendPanel.add(new JLabel(" E:PoisionCreature"));
		legendPanel.add(new JLabel(" D:AcidCreature"));

	}

	/**
	 * 
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
		// playerDetails[3].setText(player.getKeys()+"");

	}

	private String getdisplayString(MapItem item)
	{
		if (item == null)
			return EMPTY;
		else
			return "" + item.getChar();
	}

}
