package Pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Nidorina extends Pokemon{
		public Nidorina (String name,int level) {
			super(name,level);
			super.setType(Type.POISON);
			super.setStats(70,62,67,55,55,56);
			super.setMove(new Rest(), new Scratch(),new FurySwipes());
		}
}
