//Monster statistics will be stored in the variables.
public class Monster 
{
	public double 
	hp,
	atkDmg,
	atkSpd,
	armor, 
	mr, 
	moveSpeed;
	//Constructor based on name of the monster, and eventually scaling based on timer.
	Monster(String mobName, double timer)
	{
		if(mobName == "hpMonster")
		{
			hp = 13290;
			atkDmg = 0;
			atkSpd = 0;
			armor = 0; 
			mr = 0; 
			moveSpeed = 0;
		}
		else if(mobName == "MurkWolf")
		{
			hp = 420;
			atkDmg = 16;
			atkSpd = 0.625;
			armor = 6; 
			mr = 0; 
			moveSpeed = 443;
		}
		else if(mobName == "GreaterMurkWolf")
		{
			hp = 1320;
			atkDmg = 42;
			atkSpd = 0.625;
			armor = 9; 
			mr = 0; 
			moveSpeed = 443;
		}
		else if(mobName == "Krug")
		{
			hp = 540;
			atkDmg = 35;
			atkSpd = 0.613;
			armor = 12; 
			mr = -10; 
			moveSpeed = 285;
		}
		else if(mobName == "AncientKrug")
		{
			hp = 1440;
			atkDmg = 73;
			atkSpd = 0.613;
			armor = 12; 
			mr = -10; 
			moveSpeed = 285;
		}
		else if(mobName == "BlueSentinel")
		{
			hp = 2000;
			atkDmg = 73;
			atkSpd = 0.493;
			armor = 20; 
			mr = 0; 
			moveSpeed = 200;
		}
		else if(mobName == "Sentry")
		{
			hp = 400;
			atkDmg = 12;
			atkSpd = 0.625;
			armor = 8; 
			mr = 0; 
			moveSpeed = 330;
		}
		else if(mobName == "RedBrambleback")
		{
			hp = 2000;
			atkDmg = 80;
			atkSpd = 0.6;
			armor = 20; 
			mr = 0; 
			moveSpeed = 330;
		}
		else if(mobName == "Cinderling")
		{
			hp = 400;
			atkDmg = 12;
			atkSpd = 0.599;
			armor = 12; 
			mr = 0; 
			moveSpeed = 330;
		}
		else if(mobName == "Raptor")
		{
			hp = 250;
			atkDmg = 16;
			atkSpd = 0.67;
			armor = 5; 
			mr = 0; 
			moveSpeed = 350;
		}
		else if(mobName == "CrimsonRaptor")
		{
			hp = 1200;
			atkDmg = 45;
			atkSpd = 0.67;
			armor = 15; 
			mr = 0; 
			moveSpeed = 350;
		}
		else if(mobName == "Gromp")
		{
			hp = 1600;
			atkDmg = 83;
			atkSpd = 0.63;
			armor = 15; 
			mr = 0; 
			moveSpeed = 330;
		}
		else if(mobName == "ScuttleCrab")
		{
			hp = 800;
			atkDmg = 35;
			atkSpd = 0.638;
			armor = 60; 
			mr = 60; 
			moveSpeed = 155;
		}
		
		else
		{
			hp = 0;
			atkDmg = 0;
			atkSpd = 0;
			armor = 0; 
			mr = 0; 
			moveSpeed = 0;
		}
	}
	
}
