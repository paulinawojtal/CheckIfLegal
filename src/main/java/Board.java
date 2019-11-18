class Board {

    private String[][] board;

    Board() {
        board = new String[8][8];
    }

    void createBoard(){
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                board[i][j] = " ";
            }
        }
    }
    String[][] getBoard() {
        return board;
    }

    void updatedBoard(Pieces pieces){
        if(pieces.getPieces().size() > 0){
            pieces.forEach(piece ->
            {
                int r = piece.getPositionR();
                int c = piece.getPositionC();
                board[r][c] = piece.getColor() + piece.getFigure().toString();
            });
        }
    }
}
