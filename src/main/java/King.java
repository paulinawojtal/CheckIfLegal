class King extends Piece {


    King(PieceColor color) {
        super(color);
        if(color == PieceColor.W){
            setFigure(PieceFigure.K);
        } else{
            setFigure(PieceFigure.k);
        }
    }



}
