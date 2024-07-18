package it.univaq.disim.lpo.goosegame.core.gameService.impl;

import java.util.ArrayList;
import java.util.List;

public class CellServiceImpl {
    private final int number;
    private final boolean isEmpty;
    private String specialType;
    private List<Integer> playersOccupied;

    public CellServiceImpl(int number) {
        this.number = number;
        this.isEmpty = false;
        this.specialType = "N";
        this.playersOccupied = new ArrayList<>();
    }

    public CellServiceImpl() {
        this.number = 0;
        this.isEmpty = true;
        this.specialType = "";
        this.playersOccupied = new ArrayList<>();
    }

    public int getNumber() {
        return number;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setSpecialType(String specialType) {
        this.specialType = specialType;
    }

    public String getSpecialType() {
        return specialType;
    }

    public void addPlayer(int playerId) {
        playersOccupied.add(playerId);
    }

    public String getOccupiedPlayersString() {
        StringBuilder sb = new StringBuilder("| [");
        sb.append("-".repeat(Math.max(0, 6 - playersOccupied.size() )));
        if (!playersOccupied.isEmpty()) {
            for (int i = 0; i < playersOccupied.size(); i++) {
                sb.append(playersOccupied.get(i));
            }
        }
        sb.append("] ");
        return sb.toString();
    }
    
    
    
    @Override
    public String toString() {
        if (isEmpty) {
            return "          ";
        } else {
            
            return String.format("| %4d(%s)  ", number, specialType);
        }
    }

    public String toIntermediateString() {
    	String playersString = playersOccupied.isEmpty() ? "       " : String.format("%-6s", playersOccupied);
        return isEmpty ? "          " : getOccupiedPlayersString();
    }

    public String toTopOrBottomString() {
        return isEmpty ? "          " : "+----------";
    }
}
