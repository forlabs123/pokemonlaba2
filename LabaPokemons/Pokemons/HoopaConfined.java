package Pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class HoopaConfined extends Pokemon{
	public HoopaConfined (String name,int level) {
		super(name,level);
		super.setType(Type.PSYCHIC,Type.GHOST);
		super.setStats(80,110,60,150,130,70);
		super.setMove(new DreamEater(), new Rest(),new Confusion(), new Facade());
	}
}
