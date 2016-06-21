package weapon;
import static org.junit.Assert.*;

import org.junit.Test;
/**
 * Test for Strong Attachment class
 * @author Dalal Alzeer
 *
 */
public class TestStrongAttachment
{
	/**
	 * test attachment of spear
	 */
	@Test
	public void test_spear()
	{
		Spears spear=new Spears();
		StrongAttachment strong=new StrongAttachment(spear);
		assertEquals(22,strong.getBaseDamage());

	}
	/**
	 * test attachment of sword
	 */
	@Test
	public void test_sword()
	{
		Swords sword = new Swords();
		StrongAttachment strong=new StrongAttachment(sword);
		assertEquals(25,strong.getBaseDamage());

	}
	/**
	 * test attachment of mace
	 */
	@Test
	public void test_mace()
	{
		Maces mace = new Maces();
		StrongAttachment strong=new StrongAttachment(mace);
		assertEquals(20,strong.getBaseDamage());
	}
	/**
	 * test character displayed in the map
	 */
	@Test
	public void test_character()
	{
		Spears spear=new Spears();
		StrongAttachment strong=new StrongAttachment(spear);
		assertEquals('G',strong.getChar());
	}

}
