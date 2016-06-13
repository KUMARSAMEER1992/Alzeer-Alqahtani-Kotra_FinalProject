package player;

import static org.junit.Assert.*;
import lifeform.Damage;
import lifeform.LifeForm;
import lifeform.MockLifeForm;

import org.junit.Test;

import environment.MapItem;

public class TestNormalCreature 
{
	
	@Test
	public void testAttack() 
	{
		Creature normal1= new NormalCreature("p",30);
		Creature normal2= new NormalCreature("p",50);
		assertTrue(normal1 instanceof MapItem);
		normal1.attack(normal2);
		assertEquals(45,normal2.getCurrentLifePoints());
		
		
	}

}
