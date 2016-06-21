package weapon;
import static org.junit.Assert.*;
import lifeform.Damage;

import org.junit.Test;

import player.Creature;
import player.NormalCreature;
import player.Player;
/**
 * The test cases for Maces class.
 * @author Dalal Alzeer
 */
public class TestMaces 
{
	/**
	 * Test initialization and damage of Mace.
	 */
	@Test
	public void test() 
	{
		//Test initialization
		Player p=Player.getPlayer();
		Creature normal= new NormalCreature("p",30);
		Maces mace = new Maces();
		assertEquals(5,mace.getBaseDamage());
		//test damage
		p.pickUp(mace);
		p.attack(normal);
		assertEquals(25,normal.getCurrentLifePoints());
	}
	/**
	 * test calculateDamage
	 */
	@Test
	public void testCalculateDamage() 
	{
		Maces mace = new Maces();
		Damage damage=new Damage("WEAPON",10);
		damage=mace.calculateDamage();
		assertEquals(5,damage.getDamagePoints());
	}
	/**
	 * test getChar/getWeaponType
	 */
	@Test
	public void testGetChar_GetWeaponType() 
	{
		Maces mace = new Maces();
		assertEquals('M',mace.getChar());
		assertEquals("Maces",mace.getWeaponType());
	}
	

}
