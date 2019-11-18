public abstract class Piece {

    private PieceColor color;
    private PieceFigure figure;
    private int positionC;
    private int positionR;

    Piece(PieceColor color) {
        this.color = color;
    }

    PieceFigure getFigure() {
        return figure;
    }

    public PieceColor getColor() {
        return color;
    }

    void setFigure(PieceFigure figure) {
        this.figure = figure;
    }

    void setPositionC(int positionC) {
        this.positionC = positionC;
    }

    void setPositionR(int positionR) {
        this.positionR = positionR;
    }

    int getPositionC() {
        return positionC;
    }

    int getPositionR() {
        return positionR;
    }

    @Override
    public String toString() {
        return "Piece{" +
                "color=" + color +
                ", figure=" + figure +
                ", positionC=" + positionC +
                ", positionR=" + positionR +
                '}';
    }
}
