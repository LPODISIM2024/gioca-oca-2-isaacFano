package it.univaq.disim.lpo.goosegame.core;

import it.univaq.disim.lpo.goosegame.core.game.Gioco;

import it.univaq.disim.lpo.goosegame.core.gameService.GiocoService;
import it.univaq.disim.lpo.goosegame.core.gameService.InizializzaPartitaException;
import it.univaq.disim.lpo.goosegame.core.gameService.impl.GiocoServiceImpl;

public class Runner {
//    public static void main(String[] args) {
//        int x = 16; // Numero finale che si vuole raggiungere
//        BoardServiceImpl board = new BoardServiceImpl(x);
//
//        // Esempio: Impostare casella speciale (ad esempio ponte) sulla casella (0, 0)
//        board.setSpecialType(0, 0, "P");
//
//        // Esempio: Aggiungere giocatori sulla casella (0, 0)
//        board.addPlayer(0, 0, 1);
//        board.addPlayer(0, 0, 5);
//        board.addPlayer(0, 0, 4);
//        board.addPlayer(0, 0, 1);
//        board.addPlayer(0, 0, 5);
//        board.addPlayer(0, 0, 4);
//        
//        // Stampare la griglia
//        board.printBoard();
//    }
	
	
    public static void main(String[] args) {
        GiocoService gs = new GiocoServiceImpl();
        try {
            Gioco g = gs.inizializzaPartita();
            gs.gioca(g);
            
        } catch (InizializzaPartitaException e) {
            System.out.println("Va bene non vuoi giocare");
        }
    
    }
}
