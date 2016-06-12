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
	public void test() 
	{
		LifeForm entity = new MockLifeForm("Bob", 40, 10);
		Creature normal= new NormalCreature("p",30);
		Damage damage= new Damage("NormalCreature",10);
		assertTrue(normal instanceof MapItem);
		entity.attack(normal);
		assertEquals(20,normal.getCurrentLifePoints());
		
	}

}
