package player;

import static org.junit.Assert.*;
import lifeform.Damage;
import lifeform.LifeForm;
import lifeform.MockLifeForm;

import org.junit.Test;

import environment.MapItem;

public class TestPison 
{

	@Test
	public void testTakeHit() 
	{
		Creature normal1= new NormalCreature("p",30);
		Creature normal2= new NormalCreature("p",50);
		Ability poison1 = new Poison(normal1);
		Ability poison2 = new Poison(normal2);
		assertTrue(poison1 instanceof MapItem);
		poison1.attack(poison2);
		System.out.println(poison2.getCurrentLifePoints());
		assertEquals(45,poison2.getCurrentLifePoints());	
	}
}
