//Champion statistics will be stored in the variables.
public class Champion 
{
	public double 
	hp, hpGrowth, hp5, hp5Growth, 
	mp, mpGrowth, mp5, mp5Growth, 
	atkDmg, atkGrowth, atkSpd, atkSpdGrowth, 
	armor, armorGrowth, mr, mrGrowth, 
	moveSpeed,range;
	
	//Makes champion attack Monster.
	Monster autoattack(Monster target)
	{
		target.hp = target.hp - atkDmg;		
		return target;
	}
	
	//Constructs Champion object, based on selected champion from runtime program.
	Champion(String champName)
	{
		if(champName == "Aatrox")
		{
			hp = 537.8;
			hpGrowth= 85;
			hp5= 6.59;
			hp5Growth= .5;
			mp= 0;
			mpGrowth= 0;
			mp5= 0;
			mp5Growth= 0;
			atkDmg= 60.376;
			atkGrowth= 3.2;
			atkSpd= 0.651;
			atkSpdGrowth= 0.03;
			armor= 24.384;
			armorGrowth= 3.8;
			mr= 32.1;
			mrGrowth= 1.25;
			moveSpeed= 345;
			range= 150;
		}
		else if(champName == "Ahri")
		{
			hp = 514.4;
			hpGrowth= 80;
			hp5= 6.505;
			hp5Growth= 0.6;
			mp= 334;
			mpGrowth= 50;
			mp5= 6;
			mp5Growth= 0.8;
			atkDmg= 53.04;
			atkGrowth= 3;
			atkSpd= 0.668;
			atkSpdGrowth= 0.02;
			armor= 20.88;
			armorGrowth= 3.5;
			mr= 30;
			mrGrowth= 0;
			moveSpeed= 330;
			range= 550;
		}
		else if(champName == "Akali")
		{
			hp = 587.8;
			hpGrowth= 85;
			hp5= 8.34;
			hp5Growth= 0.65;
			mp= 200;
			mpGrowth= 0;
			mp5= 50;
			mp5Growth= 0;
			atkDmg= 58.376;
			atkGrowth= 3.2;
			atkSpd= 0.694;
			atkSpdGrowth= 0.031;
			armor= 26.38;
			armorGrowth= 3.5;
			mr= 32.1;
			mrGrowth= 1.25;
			moveSpeed= 350;
			range= 125;
		}
		else if(champName == "Alistar")
		{
			hp = 613.36;
			hpGrowth= 102;
			hp5= 8.675;
			hp5Growth= 0.85;
			mp= 278.84;
			mpGrowth= 38;
			mp5= 6;
			mp5Growth= 0.8;
			atkDmg= 61.112;
			atkGrowth= 3.62;
			atkSpd= 0.625;
			atkSpdGrowth= 0.02125;
			armor= 24.38;
			armorGrowth= 3.5;
			mr= 32.1;
			mrGrowth= 1.25;
			moveSpeed= 330;
			range= 125;
		}
		else if(champName == "Amumu")
		{
			hp = 613.12;
			hpGrowth= 84;
			hp5= 8.875;
			hp5Growth= 0.85;
			mp= 287.2;
			mpGrowth= 40;
			mp5= 7.38;
			mp5Growth= 0.525;
			atkDmg= 53.3854;
			atkGrowth= 3.8;
			atkSpd= 0.638;
			atkSpdGrowth= 0.0218;
			armor= 23.544;
			armorGrowth= 3.3;
			mr= 32.1;
			mrGrowth= 1.25;
			moveSpeed= 335;
			range= 125;
		}
		else if(champName == "Anivia")
		{
			hp = 467.6;
			hpGrowth= 70;
			hp5= 5.57;
			hp5Growth= 0.55;
			mp= 346.04;
			mpGrowth= 53;
			mp5= 6;
			mp5Growth= 0.8;
			atkDmg= 51.376;
			atkGrowth= 3.2;
			atkSpd= 0.625;
			atkSpdGrowth= 0.0168;
			armor= 21.22;
			armorGrowth= 4;
			mr= 30;
			mrGrowth= 0;
			moveSpeed= 325;
			range= 600;
		}
		else if(champName == "Annie")
		{
			hp = 511.68;
			hpGrowth= 76;
			hp5= 5.42;
			hp5Growth= 0.55;
			mp= 334;
			mpGrowth= 50;
			mp5= 6;
			mp5Growth= 0.8;
			atkDmg= 50.41;
			atkGrowth= 2.625;
			atkSpd= 0.579;
			atkSpdGrowth= 0.0136;
			armor= 19.22;
			armorGrowth= 4;
			mr= 30;
			mrGrowth= 0;
			moveSpeed= 335;
			range= 575;
		}
		else if(champName == "Ashe")
		{
			hp = 527.72;
			hpGrowth= 79;
			hp5= 5.42;
			hp5Growth= 0.55;
			mp= 231.8;
			mpGrowth= 35;
			mp5= 6.97;
			mp5Growth= 0.4;
			atkDmg= 51.088;
			atkGrowth= 2.85;
			atkSpd= 0.658;
			atkSpdGrowth= 0.0333;
			armor= 21.212;
			armorGrowth= 3.4;
			mr= 30;
			mrGrowth= 0;
			moveSpeed= 325;
			range= 600;
		}
		else if(champName == "Azir")
		{
			hp = 524.4;
			hpGrowth= 80;
			hp5= 6.92;
			hp5Growth= 0.55;
			mp= 350.56;
			mpGrowth= 42;
			mp5= 6;
			mp5Growth= 0.8;
			atkDmg= 52;
			atkGrowth= 2.8;
			atkSpd= 0.625;
			atkSpdGrowth= 0.015;
			armor= 19.04;
			armorGrowth= 3;
			mr= 30;
			mrGrowth= 0;
			moveSpeed= 335;
			range= 525;
		}
		else if(champName == "Bard")
		{
			hp = 535;
			hpGrowth= 85;
			hp5= 5.4;
			hp5Growth= 0.55;
			mp= 350;
			mpGrowth= 50;
			mp5= 6;
			mp5Growth= 0.45;
			atkDmg= 52;
			atkGrowth= 3;
			atkSpd= 0.625;
			atkSpdGrowth= 0.01;
			armor= 25;
			armorGrowth= 4;
			mr= 30;
			mrGrowth= 0;
			moveSpeed= 330;
			range= 500;
		}
		else if(champName == "Blitzcrank")
		{
			hp = 582.6;
			hpGrowth= 95;
			hp5= 8.51;
			hp5Growth= 0.75;
			mp= 267.2;
			mpGrowth= 40;
			mp5= 6;
			mp5Growth= 0.8;
			atkDmg= 61.54;
			atkGrowth= 3.5;
			atkSpd= 0.625;
			atkSpdGrowth= 0.0113;
			armor= 24.38;
			armorGrowth= 3.5;
			mr= 32.1;
			mrGrowth= 1.25;
			moveSpeed= 325;
			range= 125;
		}
		else if(champName == "Brand")
		{
			hp = 507.68;
			hpGrowth= 76;
			hp5= 5.42;
			hp5Growth= 0.55;
			mp= 325.6;
			mpGrowth= 45;
			mp5= 8.005;
			mp5Growth= 0.6;
			atkDmg= 57.04;
			atkGrowth= 3;
			atkSpd= 0.625;
			atkSpdGrowth= 0.0136;
			armor= 21.88;
			armorGrowth= 3.5;
			mr= 30;
			mrGrowth= 0;
			moveSpeed= 340;
			range= 550;
		}
		else if(champName == "Braum")
		{
			hp = 576.16;
			hpGrowth= 87;
			hp5= 8.18;
			hp5Growth= 1;
			mp= 310.6;
			mpGrowth= 45;
			mp5= 6;
			mp5Growth= 0.8;
			atkDmg= 55.376;
			atkGrowth= 3.2;
			atkSpd= 0.644;
			atkSpdGrowth= 0.035;
			armor= 26.72;
			armorGrowth= 4;
			mr= 32.1;
			mrGrowth= 1.25;
			moveSpeed= 335;
			range= 125;
		}
		else if(champName == "Caitlyn")
		{
			hp = 524.4;
			hpGrowth= 80;
			hp5= 5.67;
			hp5Growth= 0.55;
			mp= 313.8;
			mpGrowth= 35;
			mp5= 7.42;
			mp5Growth= 0.55;
			atkDmg= 50.04;
			atkGrowth= 3;
			atkSpd= 0.625;
			atkSpdGrowth= 0.04;
			armor= 22.88;
			armorGrowth= 3.5;
			mr= 30;
			mrGrowth= 0;
			moveSpeed= 325;
			range= 650;
		}
		else if(champName == "Cassiopeia")
		{
			hp = 506;
			hpGrowth= 75;
			hp5= 5.69;
			hp5Growth= 0.5;
			mp= 370.8;
			mpGrowth= 60;
			mp5= 8.36;
			mp5Growth= 0.75;
			atkDmg= 52.376;
			atkGrowth= 3.2;
			atkSpd= 0.647;
			atkSpdGrowth= 0.0168;
			armor= 22.22;
			armorGrowth= 4;
			mr= 30;
			mrGrowth= 0;
			moveSpeed= 335;
			range= 550;
		}
		else if(champName == "Cho'Gath")
		{
			hp = 574.4;
			hpGrowth= 80;
			hp5= 8.925;
			hp5Growth= 0.85;
			mp= 272.2;
			mpGrowth= 40;
			mp5= 7.205;
			mp5Growth= 0.45;
			atkDmg= 61.156;
			atkGrowth= 4.2;
			atkSpd= 0.625;
			atkSpdGrowth= 0.0144;
			armor= 28.88;
			armorGrowth= 3.5;
			mr= 32.1;
			mrGrowth= 1.25;
			moveSpeed= 345;
			range= 125;
		}
		else if(champName == "Corki")
		{
			hp = 512.76;
			hpGrowth= 82;
			hp5= 5.42;
			hp5Growth= 0.55;
			mp= 305.16;
			mpGrowth= 37;
			mp5= 7.42;
			mp5Growth= 0.55;
			atkDmg= 51.24;
			atkGrowth= 3;
			atkSpd= 0.625;
			atkSpdGrowth= 0.023;
			armor= 23.38;
			armorGrowth= 3.5;
			mr= 30;
			mrGrowth= 0;
			moveSpeed= 325;
			range= 550;
		}
		else if(champName == "Darius")
		{
			hp = 582.24;
			hpGrowth= 93;
			hp5= 9.875;
			hp5Growth= 0.95;
			mp= 236;
			mpGrowth= 37.5;
			mp5= 6.585;
			mp5Growth= 0.35;
			atkDmg= 55.88;
			atkGrowth= 3.5;
			atkSpd= 0.679;
			atkSpdGrowth= 0.0265;
			armor= 29.88;
			armorGrowth= 3.5;
			mr= 32.1;
			mrGrowth= 1.25;
			moveSpeed= 340;
			range= 125;
		}
		else if(champName == "Diana")
		{
			hp = 589.2;
			hpGrowth= 90;
			hp5= 7.425;
			hp5Growth= 0.85;
			mp= 297.2;
			mpGrowth= 40;
			mp5= 6;
			mp5Growth= 0.8;
			atkDmg= 53.04;
			atkGrowth= 3;
			atkSpd= 0.625;
			atkSpdGrowth= 0.0225;
			armor= 26.048;
			armorGrowth= 3.6;
			mr= 32.1;
			mrGrowth= 1.25;
			moveSpeed= 345;
			range= 150;
		}
		else if(champName == "Dr.Mundo")
		{
			hp = 582.52;
			hpGrowth= 89;
			hp5= 7.76;
			hp5Growth= 0.75;
			mp= 0;
			mpGrowth= 0;
			mp5= 0;
			mp5Growth= 0;
			atkDmg= 61.27;
			atkGrowth= 3;
			atkSpd= 0.625;
			atkSpdGrowth= 0.028;
			armor= 26.88;
			armorGrowth= 3.5;
			mr= 32.1;
			mrGrowth= 1.25;
			moveSpeed= 345;
			range= 125;
		}
		else if(champName == "Draven")
		{
			hp = 557.76;
			hpGrowth= 82;
			hp5= 6.175;
			hp5Growth= 0.7;
			mp= 310.56;
			mpGrowth= 42;
			mp5= 8.04;
			mp5Growth= 0.65;
			atkDmg= 50.38;
			atkGrowth= 3.5;
			atkSpd= 0.679;
			atkSpdGrowth= 0.027;
			armor= 25.544;
			armorGrowth= 3.3;
			mr= 30;
			mrGrowth= 0;
			moveSpeed= 330;
			range= 550;
		}
		else if(champName == "Ekko")
		{
			hp = 580;
			hpGrowth= 80;
			hp5= 9;
			hp5Growth= 0.9;
			mp= 280;
			mpGrowth= 50;
			mp5= 6;
			mp5Growth= 0.8;
			atkDmg= 59;
			atkGrowth= 3;
			atkSpd= 0.644;
			atkSpdGrowth= 0.033;
			armor= 27;
			armorGrowth= 3;
			mr= 32.1;
			mrGrowth= 1.25;
			moveSpeed= 340;
			range= 125;
		}
		else if(champName == "Elise")
		{
			hp = 529.4;
			hpGrowth= 80;
			hp5= 5.705;
			hp5Growth= 0.6;
			mp= 324;
			mpGrowth= 50;
			mp5= 6;
			mp5Growth= 0.8;
			atkDmg= 50.54;
			atkGrowth= 3;
			atkSpd= 0.625;
			atkSpdGrowth= 0.0175;
			armor= 22.128;
			armorGrowth= 3.35;
			mr= 30;
			mrGrowth= 0;
			moveSpeed= 330;
			range= 550;
		}
		else if(champName == "Warwick")
		{
			hp = 592.64;
			hpGrowth= 98;
			hp5= 8.39;
			hp5Growth= 0.8;
			mp= 240.4;
			mpGrowth= 30;
			mp5= 8.105;
			mp5Growth= 0.6;
			atkDmg= 62.43;
			atkGrowth= 3.375;
			atkSpd= 0.679;
			atkSpdGrowth= 0.0288;
			armor= 25.88;
			armorGrowth= 3.5;
			mr= 32.1;
			mrGrowth= 1.25;
			moveSpeed= 345;
			range= 125;
		}
		else if(champName == "XinZhao")
		{
			hp = 591.16;
			hpGrowth= 87;
			hp5= 8.175;
			hp5Growth= 0.7;
			mp= 273.8;
			mpGrowth= 35;
			mp5= 7.255;
			mp5Growth= 0.45;
			atkDmg= 57.44;
			atkGrowth= 3.3;
			atkSpd= 0.672;
			atkSpdGrowth= 0.026;
			armor= 25.88;
			armorGrowth= 3.5;
			mr= 32.1;
			mrGrowth= 1.25;
			moveSpeed= 345;
			range= 175;
		}
		else
		{
			hp = 1;
			hpGrowth= 1;
			hp5= 1;
			hp5Growth= 1;
			mp= 1;
			mpGrowth= 1;
			mp5= 1;
			mp5Growth= 1;
			atkDmg= 1;
			atkGrowth= 1;
			atkSpd=1;
			atkSpdGrowth= 1;
			armor= 1;
			armorGrowth= 1;
			mr= 1;
			mrGrowth= 1;
			moveSpeed= 1;
			range= 1;
		}
	}
}
