package it.univaq.disim.lpo.goosegame.core;

import it.univaq.disim.lpo.goosegame.core.gameService.impl.BoardServiceImpl;

public class Runner {
    public static void main(String[] args) {
        int x = 16; // Numero finale che si vuole raggiungere
        BoardServiceImpl board = new BoardServiceImpl(x);

        // Esempio: Impostare casella speciale (ad esempio ponte) sulla casella (0, 0)
        board.setSpecialType(0, 0, "P");

        // Esempio: Aggiungere giocatori sulla casella (0, 0)
        board.addPlayer(0, 0, 1);
        board.addPlayer(0, 0, 5);
        board.addPlayer(0, 0, 4);
        board.addPlayer(0, 0, 1);
        board.addPlayer(0, 0, 5);
        board.addPlayer(0, 0, 4);
        
        // Stampare la griglia
        board.printBoard();
    }
}
