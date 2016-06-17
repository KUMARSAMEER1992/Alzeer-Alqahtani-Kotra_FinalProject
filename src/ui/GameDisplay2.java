package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;

import environment.Environment;

/**
 * @author Sameer Kumar Kotra
 */
public class GameDisplay2
{
	public final static String EMPTY = "#";
	private JFrame frame;
	private JPanel legendPanel;
	private JPanel mapPanel;
	private JPanel mapArea;
	private JLabel[][] lables;
	private int rows;
	private int cols;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		GameDisplay2 window = new GameDisplay2();
	}

	/**
	 * Create the application.
	 */
	public GameDisplay2()
	{
		rows = Environment.ROWS;
		cols = Environment.COLS;
		rows = 40;
		cols = 100;
		lables = new JLabel[rows][cols];
		for (int i = 0; i < rows; i++)
		{
			for (int j = 0; j < cols; j++)
			{
				lables[i][j] = new JLabel(EMPTY);
				// lables[i][j].setBorder(new LineBorder(new Color(0, 0, 0), 1,
				// true));
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
		frame.setBounds(0, 0, 850, 715);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));

		buildLegendPanel();
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

	/**
	 * 
	 */
	private void buildLegendPanel()
	{
		legendPanel = new JPanel();
		frame.getContentPane().add(legendPanel, BorderLayout.EAST);
		legendPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		legendPanel.setLayout(new GridLayout(10, 1, 2, 2));

		JLabel legendLabel = new JLabel("   Legend");
		legendLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		legendLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		legendPanel.add(legendLabel);
		legendPanel.add(new JLabel("  H - Human"));
		legendPanel.add(new JLabel("  A - Alien"));
		legendPanel.add(new JLabel("  N - North"));
		legendPanel.add(new JLabel("  E - East"));
		legendPanel.add(new JLabel("  S - South"));
		legendPanel.add(new JLabel("  W - West"));
		legendPanel.add(new JLabel("  PI - Pistol"));
		legendPanel.add(new JLabel("  Pl - Plasma Gun  "));
		legendPanel.add(new JLabel("  CH - Chain Gun"));

	}

}
