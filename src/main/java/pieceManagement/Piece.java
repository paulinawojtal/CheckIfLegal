package pieceManagement;

import MoveManagement.DefaultMove;

import java.util.List;

public abstract class Piece {

    private PieceColor color;
    private PieceFigure figure;
    private int positionC;
    private int positionR;
    private List<int[]> defaultMoves;

    Piece(PieceColor color) {
        this.color = color;
    }

    public List<int[]> getDefaultMoves() {
        return defaultMoves;
    }

    public void creteDefaultMoves() {
        defaultMoves = generateDefaultMoves();
    }

    public PieceFigure getFigure() {
        return figure;
    }

    public PieceColor getColor() {
        return color;
    }

    void setFigure(PieceFigure figure) {
        this.figure = figure;
    }

    public void setPositionC(int positionC) {
        this.positionC = positionC;
    }

    public void setPositionR(int positionR) {
        this.positionR = positionR;
    }

    public int getPositionC() {
        return positionC;
    }

    public int getPositionR() {
        return positionR;
    }

    public abstract List<int[]> generateDefaultMoves();

    @Override
    public String toString() {
        return "pieceManagement.Piece{" +
                "color=" + color +
                ", figure=" + figure +
                ", positionC=" + positionC +
                ", positionR=" + positionR +
                '}';
    }
}
