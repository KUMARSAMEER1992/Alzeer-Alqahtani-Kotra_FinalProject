package weapon;
import static org.junit.Assert.*;
import lifeform.Damage;

import org.junit.After;
import org.junit.Test;
/**
 * The test cases for Attachments class.
 * @author Dalal Alzeer
 */
public class TestAttachments 
{
	/**
	 * test Mace attachment.
	 */
	@Test
	public void testMace() 
	{
		//Test mace attachment after calculate base damage of mace
		Maces mace = new Maces();
		Attachments a=new Attachments(mace);
		assertEquals(10,a.attachmentDamage);
	}
	/**
	 * test Sword attachment.
	 */
	@Test
	public void testSword() 
	{
		//Test Sword attachment after calculate base damage of Sword
		Swords sword=new Swords();
		Attachments a1=new Attachments(sword);
		assertEquals(25,a1.getBaseDamage());
	}
	/**
	 * test Spear attachment.
	 */
	@Test
	public void testSpear() 
	{
		//Test Spear attachment after calculate base damage of Spear
		Spears spear=new Spears();
		Attachments a2=new Attachments(spear);
		assertEquals(17,a2.getBaseDamage());
	}
	/**
	 * test calculate damage
	 */
	@Test
	public void testcalculateDamage() 
	{
		Spears spear=new Spears();
		Damage damage = new Damage("WEAPON", 5);
		Attachments attachment=new Attachments(spear);
		damage=attachment.calculateDamage();
		assertEquals(17,attachment.getBaseDamage());
	}
	/**
	 * test getChar,getWeaponType and getItemType
	 */
	@Test
	public void test() 
	{
		Spears spear=new Spears();
		Attachments attachment=new Attachments(spear);
		//character that displayed in the map
		assertEquals('T',attachment.getChar());
		//getWeaponType
		assertEquals("Spears",attachment.getWeaponType());
		//getItemType
		assertEquals("WEAPON",attachment.getItemType());
		
	}
	
}
