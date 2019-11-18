class Printer {

    void printBoard(Board board){
        for(int r=0; r<board.getBoard().length;r++){
            System.out.print("|");
            for(int c=0; c<board.getBoard()[0].length; c++){
                String s = board.getBoard()[r][c];
                System.out.printf("%2s|", s.equals("0") ? " " : s);
            }
            System.out.println();
        }
    }
}
