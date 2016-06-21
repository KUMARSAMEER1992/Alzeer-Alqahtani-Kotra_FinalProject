package ui;

import static org.junit.Assert.assertEquals;

import javax.swing.JOptionPane;

import org.junit.Test;

/**
 * Test cases for the Legend panel of the display.
 * @author Sameer Kumar Kotra
 */
public class TestGameDisplayLegend
{

	/**
	 * tets Display.
	 */
	@Test
	public void test()
	{
		GameDisplay display = new GameDisplay();
		String[] lables = new String[]
		{ "P:player", "H:HealthPotion,I:PoisonAddon,J:AcidAddon", " S:Sword,R:Spear,M:Mace,T:Attachment",
				" K:Key,#:Wall,|:Door", " A:NormalArmor,C:AcidArmor,O:PoisionArmor",
				"N:NormalCreature,E:PoisionCreature,D:AcidCreature" };

		for (String s : lables)
		{

			assertEquals(JOptionPane.YES_OPTION, JOptionPane.showConfirmDialog(null, "Legend displayed \n" + s));
		}

	}

}
