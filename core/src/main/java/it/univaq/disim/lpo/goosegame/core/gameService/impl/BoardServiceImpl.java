package it.univaq.disim.lpo.goosegame.core.gameService.impl;

import java.util.ArrayList;
import java.util.List;

public class BoardServiceImpl{
    private final List<List<CellServiceImpl>> grid;
    private final int n;
    private final int m;

    public BoardServiceImpl(int x) {
        this.n = (int) Math.ceil(Math.sqrt(x));
        this.m = n;
        this.grid = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<CellServiceImpl> row = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                row.add(new CellServiceImpl());
            }
            grid.add(row);
        }
        fillSpiral(x);
    }

    private void fillSpiral(int x) {
        int number = 1;
        int minRow = 0, maxRow = n - 1;
        int minCol = 0, maxCol = m - 1;

        while (number <= x) {
            number = fillTopEdge(minRow++, minCol, maxCol, number, x);
            number = fillRightEdge(maxCol--, minRow, maxRow, number, x);
            number = fillBottomEdge(maxRow--, minCol, maxCol, number, x);
            number = fillLeftEdge(minCol++, minRow, maxRow, number, x);
        }
    }

    private int fillTopEdge(int row, int minCol, int maxCol, int number, int x) {
        for (int i = minCol; i <= maxCol && number <= x; i++) {
            grid.get(row).set(i, new CellServiceImpl(number++));
        }
        return number;
    }

    private int fillRightEdge(int col, int minRow, int maxRow, int number, int x) {
        for (int i = minRow; i <= maxRow && number <= x; i++) {
            grid.get(i).set(col, new CellServiceImpl(number++));
        }
        return number;
    }

    private int fillBottomEdge(int row, int minCol, int maxCol, int number, int x) {
        for (int i = maxCol; i >= minCol && number <= x; i--) {
            grid.get(row).set(i, new CellServiceImpl(number++));
        }
        return number;
    }

    private int fillLeftEdge(int col, int minRow, int maxRow, int number, int x) {
        for (int i = maxRow; i >= minRow && number <= x; i--) {
            grid.get(i).set(col, new CellServiceImpl(number++));
        }
        return number;
    }

    public void setSpecialType(int row, int col, String specialType) {
        grid.get(row).get(col).setSpecialType(specialType);
    }

    public void addPlayer(int row, int col, int playerId) {
        grid.get(row).get(col).addPlayer(playerId);
    }

    public void printBoard() {
        for (List<CellServiceImpl> row : grid) {
            row.forEach(cell -> System.out.print(cell.toTopOrBottomString()));
            System.out.println("+");
            row.forEach(cell -> System.out.print(cell.toString()));
            System.out.println("|");
            row.forEach(cell -> System.out.print(cell.toIntermediateString()));
            System.out.println("|");
        }
        grid.get(n - 1).forEach(cell -> System.out.print(cell.toTopOrBottomString()));
        System.out.println("+");
    }
}