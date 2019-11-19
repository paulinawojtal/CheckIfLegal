package boardManagement;

import pieceManagement.King;
import pieceManagement.Piece;
import pieceManagement.Pieces;

public class Creator {

    private String fileName;

    public Creator(String fileName) {
        this.fileName = fileName;
    }

    public Board createBoard(){
        Pieces pieces = new Pieces();
        ChessBoardReader cbr = new ChessBoardReader(fileName, pieces);
        cbr.read();

        Board board = new Board(cbr);
        board.createEmptyBoard();
        System.out.println(board.toString());
        board.updateBoard();
        System.out.println(board.toString());

        return board;
    }

}
