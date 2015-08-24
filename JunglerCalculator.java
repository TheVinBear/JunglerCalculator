/* To Do:
 * 	Insert other champions statistics into Constructor if-else statement.
 *	Create a way to track time, both for attack speed purposes, and output.
 *	Look into Threads
 *	put attack method in the champion and monster classes.
 *
 *Activity Log:
 *8/7/15 : Added more champion base stats to constructors. Added Armor calculation into attack method.
 *8/9/15 : Initialized jungle monsters individually with their stats.
 *
 *
 *
*/
public class JunglerCalculator 
{
	public static void main(String[] args) 
	{
		//Spawn a champion, for test cases, Warwick.
		Champion player1 = spawnChampion("Warwick");
		
		//Spawn a monster with HP of full jungle.
		Monster target = spawnMonster("hpMonster", 0);

		//Champion attacks the jungle until it is dead. Keeps count of how many attacks are performed.
		//Initialize the total attack counter, global timer, and attack timers.
		//Need to rethink how I'll handle the timers, look into threads.
		int attackCounter = 0;
		double globalTimer = 115;
		double attackTimer = 0;
		
		//Attack the jungle.  
		do
		{
			//Increment the global and attack timers.
			globalTimer += 0.001;
			attackTimer += 0.001;
			
			//Makes the Champion attack if the attack cooldown is over.
			if(attackTimer >= player1.atkSpd)
			{
				//Champion performs an attack to decrement the target's HP.
				player1.autoattack(target);
				//Increment the attack counter.
				attackCounter++;
				//Displays the Current simulation time, current attack counter, and target HP.
				System.out.println("Time: " + displayTime(globalTimer) + ". Attack: " + attackCounter + ". EnemyHP: " + target.hp);
				//Resets the attack timer.
				attackTimer = 0;
			}
		}
		while(target.hp > 1);		
		
	}
	
	//Take the Champion name, and call the constructor to set the base statistics of the champion.
	static Champion spawnChampion(String champName)
	{
		Champion newChampion = new Champion(champName);
		return newChampion;
	}
	//Take the Monster name, and call the constructor to set the base statistics of the monster.
	static Monster spawnMonster(String mobName, double timer)
	{
		Monster newMonster = new Monster(mobName, timer);
		return newMonster;
	}
	//Take a global timer of type Double, and converts it to a digital clock format.
	static String displayTime(double timerToConvert)
	{
		//Gets the minute value of the globalTimer.
		int minutes = (int) (timerToConvert / 60);
		
		//Gets the seconds value of the globalTimer.
		double seconds = timerToConvert / 60;
		while(seconds >= 1)
		{
			seconds--;
		}
		seconds = seconds * 60;
		
		//Truncate the seconds so 3 decimal places.
		seconds = seconds * 1000;
		seconds = (int)seconds;
		seconds = (double)seconds;
		seconds = seconds / 1000;
		
		//return the string in MM:SS.XXX format.
		String time = (minutes + ":" + seconds);
		return time;	
	}
}
