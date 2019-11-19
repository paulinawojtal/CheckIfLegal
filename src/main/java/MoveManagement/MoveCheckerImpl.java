package MoveManagement;

import pieceManagement.Piece;
import pieceManagement.Pieces;

import java.util.List;

public class MoveCheckerImpl implements MoveChecker {

    private Piece checkedPiece;
    private Pieces pieces;

    public MoveCheckerImpl(String color, Pieces pieces) {
        this.pieces = pieces;
        checkedPiece = choosePiece(color);
    }

    private Piece choosePiece(String color){
        for(Piece p : pieces){
            if(color.equals(p.getColor())){
                return p;
            }
        }
        return pieces.getPieces().get(0);
    }

    @Override
    public List<int[]> availableMoves() {
        return null;
    }

    @Override
    public List<int[]> legalMoves() {
        return null;
    }
}
