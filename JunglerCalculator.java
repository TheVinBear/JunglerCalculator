//Current Build
public class JunglerCalculator 
{
	public static void main(String[] args) 
	{
		//Spawn a champion, for test cases, Xin Zhao.
		Champion player1 = initializeChampion("XinZhao");
		
		//Initialize the jungle monsters.
		Monster miniWolf1 = new Monster("MurkWolf" , 0);
		Monster miniWolf2 = new Monster("MurkWolf" , 0);
		Monster bigWolf = new Monster("GreaterMurkWolf" , 0);
		Monster toad= new Monster("Gromp" , 0);
		Monster miniBlue1 = new Monster("Sentry" , 0);
		Monster miniBlue2 = new Monster("Sentry" , 0);
		Monster blueBuff = new Monster("BlueSentinel" , 0);
		Monster miniRed1 = new Monster("Cinderling" , 0);
		Monster miniRed2 = new Monster("Cinderling" , 0);
		Monster redBuff = new Monster("RedBrambleback" , 0);
		Monster miniRaptor1= new Monster("Raptor" , 0);
		Monster miniRaptor2 = new Monster("Raptor" , 0);
		Monster miniRaptor3 = new Monster("Raptor" , 0);
		Monster bigRaptor = new Monster("CrimsonRaptor" , 0);
		Monster miniKrug = new Monster("Krug" , 0);
		Monster bigKrug = new Monster("AncientKrug", 0);
		Monster crab = new Monster("ScuttleCrab" , 0);
		
		//Champion attacks the jungle until it is dead. Keeps count of how many attacks are performed.
		
		//Initialize the total attack counter, global timer, and attack timers.
		//Need to rethink how I'll handle the timers.
		int attackCounter = 0;
		double globalTimer = 115;
		double attackTimer = 0;
		
		//Attack the jungle.  
		do
		{
			//Increment the global and attack timers.
			globalTimer += 0.001;
			attackTimer += 0.001;
			
			player1.autoattack(toad);
			player1.autoattack(blueBuff);
			player1.autoattack(miniBlue1);
			player1.autoattack(miniBlue2);
			player1.autoattack(bigWolf);
			player1.autoattack(miniWolf1);
			player1.autoattack(miniWolf2);
			player1.autoattack(redBuff);
			player1.autoattack(miniRed1);
			player1.autoattack(miniRed2);
			player1.autoattack(miniRaptor1);
			player1.autoattack(miniRaptor2);
			player1.autoattack(miniRaptor3);
			player1.autoattack(bigRaptor);
			player1.autoattack(crab);
			player1.autoattack(miniKrug);
			player1.autoattack(bigKrug);
			
			//Makes the Champion attack if the attack cooldown is over.
			if(attackTimer >= player1.atkSpd)
			{
				//Champion performs an attack to decrement the target's HP.
				player1.autoattack();
				//Increment the attack counter.
				attackCounter++;
				//Displays the Current simulation time, current attack counter, and target HP.
				System.out.println("Time: " + displayTime(globalTimer) + ". Attack: " + attackCounter + ". EnemyHP: " + jungle.hp);
				//Resets the attack timer.
				attackTimer = 0;
			}
		}
		while(target.hp > 1);		
		
	}
	
	
	//Take the Champion name, and call the constructor to set the base statistics of the champion.
	static Champion initializeChampion(String champName)
	{
		Champion spawnedChampion = new Champion(champName);
		return spawnedChampion;
	}
	//Take the Monster name, and call the constructor to set the base statistics of the monster.
	static void initializeJungle()
	{
		
		
	}
	static Monster summonMonster(String mobName)
	{
		Monster newMonster = new Monster(mobName, 0);
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
