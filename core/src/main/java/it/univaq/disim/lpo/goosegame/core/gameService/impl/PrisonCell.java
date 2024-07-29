package it.univaq.disim.lpo.goosegame.core.gameService.impl;

public class PrisonCell extends CellServiceImpl {
	public PrisonCell(int number) {
        super(number);
        setSpecialType("P");
    }
}
