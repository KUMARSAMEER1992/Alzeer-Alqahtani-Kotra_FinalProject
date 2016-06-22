/**
 *  Name:Norah Alqahtani
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */

package ui.command;

import player.Player;

/**
 * This Interface contains the methods declarations related to execute command.
 */
public interface Command 
{
	/**
	 * To execute command that player press it in invoker 
	 */
	public void execute();
	
	public Player getReceiver();
}
