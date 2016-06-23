import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import environment.TestCell;
import environment.TestEnvironment;
import items.TestKey;
import items.TestWall;
import items.armor.TestArmorAcidAddon;
import items.armor.TestArmorAddon;
import items.armor.TestArmorFactory;
import items.armor.TestArmorPoisonArmor;
import items.armor.TestNormalArmor;
import items.potion.TestAcidAddon;
import items.potion.TestHealthPotion;
import items.potion.TestPoisonAddon;
import items.potion.TestPotionAddon;
import items.potion.TestPotionDetails;
import items.potion.TestPotionFactory;
import lifeform.TestLifeForm;
import player.TestAbility;
import player.TestAcidCreature;
import player.TestCreature;
import player.TestNormalCreature;
import player.TestPlayer;
import player.TestPoisonCreature;
import time.TestSimpleTimer;
import ui.TestGameDisplayInfo;
import ui.TestGameDisplayLegend;
import ui.TestGameDisplayMap;
import ui.command.TestInvoker;
import ui.command.TestInvokerBuilder;
import ui.command.TestTurnEast;
import ui.command.TestTurnNorth;
import ui.command.TestTurnSouth;
import ui.command.TestTurnWest;
import weapon.TestAttachments;
import weapon.TestGenericWeapon;
import weapon.TestMaces;
import weapon.TestSpears;
import weapon.TestStrongAttachment;
import weapon.TestSwords;
import weapon.TestWeakAttachment;

/**
 * @author Sameer Kumar Kotra
 */
@RunWith(Suite.class)
@SuiteClasses(
{ TestCell.class, TestEnvironment.class, TestArmorAcidAddon.class, TestArmorAddon.class, TestArmorFactory.class,
		TestArmorPoisonArmor.class, TestNormalArmor.class, TestAcidAddon.class, TestHealthPotion.class,
		TestPoisonAddon.class, TestPotionAddon.class, TestPotionDetails.class, TestPotionFactory.class, TestKey.class,
		TestWall.class, TestLifeForm.class, TestAbility.class, TestAcidCreature.class, TestCreature.class,
		TestNormalCreature.class, TestPlayer.class, TestPoisonCreature.class, TestSimpleTimer.class, TestInvoker.class,
		TestInvokerBuilder.class, TestTurnEast.class, TestTurnNorth.class, TestTurnSouth.class, TestTurnWest.class,
		TestGameDisplayInfo.class, TestGameDisplayLegend.class, TestGameDisplayMap.class, TestAttachments.class,
		TestGenericWeapon.class, TestMaces.class, TestSpears.class,TestSwords.class, TestStrongAttachment.class,
		TestWeakAttachment.class })
public class AllGameTests
{

}
