package boardManagement;

import pieceManagement.Pieces;

class Board {

    private String[][] board;
    private ChessBoardReader cbr;

    Board(ChessBoardReader cbr) {
        board = new String[8][8];
        this.cbr = cbr;
    }

    String[][] getBoard() {
        return board;
    }

    void createEmptyBoard(){
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                board[i][j] = "  ";
            }
        }
    }

    void updateBoard(){

        Pieces pieces = cbr.read();

        if(pieces.getPieces().size() > 0){
            pieces.forEach(piece ->
            {
                int r = piece.getPositionR();
                int c = piece.getPositionC();
                board[r][c] = "" + piece.getColor() + piece.getFigure().toString();
            });
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for(int r=0; r<board.length;r++) {
            str.append("|");
            for (int c = 0; c < board.length; c++) {
                String s = board[r][c];
                //str.append(s.equals("0") ? " " : s);
                str.append(s);
                str.append("|");
            }
            str.append("\n");
        }
        return str.toString();

    }
}
