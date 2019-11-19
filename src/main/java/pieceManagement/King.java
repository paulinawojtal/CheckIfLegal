package pieceManagement;

import MoveManagement.KingMove;

import java.util.List;

public class King extends Piece {

    private KingMove defaultMoves;

    public King(PieceColor color) {
        super(color);
        setFigure(PieceFigure.K);
        defaultMoves = new KingMove();
    }

    @Override
    public int getPositionC() {
        return super.getPositionC();
    }

    @Override
    public int getPositionR() {
        return super.getPositionR();
    }

    public List<int[]> generateDefaultMoves(){
        return defaultMoves.initializeDefaultMoves(getPositionR(), getPositionC());
    }
}
