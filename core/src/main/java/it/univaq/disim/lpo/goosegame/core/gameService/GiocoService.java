package it.univaq.disim.lpo.goosegame.core.gameService;

import it.univaq.disim.lpo.goosegame.core.game.*;

public interface GiocoService{
	public void gioca(Gioco gioco);
	/*
	 * Questo metodo inizializza la partita
	 * 
	 */
	public Gioco inizializzaPartita() throws InizializzaPartitaException;
	
}
