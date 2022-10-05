package Labajava2;

import Pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Program {
	
		public static void main(String[] args) {
			Battle b = new Battle();
			HoopaConfined HoopaConfined=new HoopaConfined("Lemon",1);
			Aipom Aipom = new Aipom ("Lemon2",1);
			Ambipom Ambipom = new Ambipom ("Lemon3",1);
			NidoranF NidoranF = new NidoranF("Bamboo",1);
			Nidorina Nidorina = new Nidorina("Bamboo2",1);
			Nidoqeen Nidoqeen = new Nidoqeen("Bamboo3",1);
			b.addAlly(Aipom);
			b.addAlly(Ambipom);
			b.addAlly(HoopaConfined);
			
			b.addFoe(NidoranF);
			b.addFoe(Nidorina);
			b.addFoe(Nidoqeen);
			b.go();	
	}
		
}
