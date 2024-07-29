package it.univaq.disim.lpo.goosegame.core.gameService.impl;

public class LabyrinthCell extends CellServiceImpl {
	public LabyrinthCell(int number) {
        super(number);
        setSpecialType("L");
    }
}
