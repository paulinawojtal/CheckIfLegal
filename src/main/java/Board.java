class Board {

    private char[][] board;

    Board() {
        board = new char[8][8];
    }

    char[][] getBoard() {
        return board;
    }

    void updatedBoard(Pieces pieces){
        pieces.forEach(piece ->
        {
            int r = piece.getPositionR();
            int c = piece.getPositionC();
            board[r][c] = piece.getFigure().toString().charAt(0);
        });

    }
}
