package weapon;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * Test for weak Attachment class
 * @author Dalal Alzeer
 *
 */
public class TestWeakAttachment
{

	/**
	 * test attachment of spear
	 */
	@Test
	public void test_spear() 
	{
		Spears spear=new Spears();
		WeakAttachment weak=new WeakAttachment(spear);
		assertEquals(12,weak.getBaseDamage());
	}
	/**
	 * test attachment of sword
	 */
	@Test
	public void test_sword()
	{
		Swords sword = new Swords();
		WeakAttachment weak=new WeakAttachment(sword);
		assertEquals(15,weak.getBaseDamage());
	}
	/**
	 * test attachment of mace
	 */
	@Test
	public void test_mace()
	{
		Maces mace = new Maces();
		WeakAttachment weak=new WeakAttachment(mace);
		assertEquals(10,weak.getBaseDamage());
	}
	/**
	 * test character displayed in the map
	 */
	@Test
	public void test_character()
	{
		Spears spear=new Spears();
		WeakAttachment weak=new WeakAttachment(spear);
		assertEquals('W',weak.getChar());
	}


}
