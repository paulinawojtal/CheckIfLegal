class Printer {

    void printBoard(Board board){
        for(int r=0; r<board.getBoard().length;r++){
            System.out.print("|");
            for(int c=0; c<board.getBoard()[0].length; c++){
                char ch = board.getBoard()[r][c];
                System.out.printf("%2s |", ch == 0 ? " " : ch);
            }
            System.out.println();
        }
    }
}
