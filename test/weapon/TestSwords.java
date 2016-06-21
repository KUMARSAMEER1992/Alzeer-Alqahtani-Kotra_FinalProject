package weapon;
import static org.junit.Assert.*;
import lifeform.Damage;


import org.junit.Test;

import player.Creature;
import player.NormalCreature;
import player.Player;
/**
 * The test cases for Swords class.
 * @author Dalal Alzeer
 */
public class TestSwords 
{
	/**
	 * Test initialization and damage of Sword.
	 */
	@Test
	public void test()
	{
		//Test initialization
		Player p=Player.getPlayer();
		Creature normal= new NormalCreature("p",30);
		Swords sword = new Swords();
		assertEquals(10,sword.getBaseDamage());
		//Test damage
		p.pickUp(sword);
		p.attack(normal);
		assertEquals(20,normal.getCurrentLifePoints());
	}
	/**
	 * test calculateDamage damage
	 */
	@Test
	public void testCalculateDamage() 
	{
		Swords sword = new Swords();
		Damage damage=new Damage("WEAPON",0);
		damage=sword.calculateDamage();
		assertEquals(10,damage.getDamagePoints());
	}
	/**
	 * test getChar
	 */
	@Test
	public void testGetChar_GetWeaponType() 
	{
		Swords sword = new Swords();
		assertEquals('S',sword.getChar());
	}


}
