class Creator {

    private String fileName;

    Creator(String fileName) {
        this.fileName = fileName;
    }

    Board createBoard(){
        Board board = new Board();
        board.createBoard();
        ChessBoardReader cbr = new ChessBoardReader();
        Pieces pieces = new Pieces();

        board.updatedBoard(cbr.read(fileName, pieces));
        return board;
    }

}
