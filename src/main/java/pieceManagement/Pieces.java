package pieceManagement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pieces implements Iterable<Piece> {

    private List<Piece> pieces;

    public Pieces() {
        pieces = new ArrayList<>();
    }

    public List<Piece> getPieces() {
        return pieces;
    }

    public void addPiece(Piece piece){
        pieces.add(piece);
    }

    @Override
    public Iterator<Piece> iterator() {
        return this.pieces.iterator();
    }
}
