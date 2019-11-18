import java.io.*;
import java.util.Arrays;

class ChessBoardReader {

    Pieces read(String fileName, Pieces pieces) {

        try (BufferedReader br = new BufferedReader(new FileReader(new File(fileName)))) {

            br.readLine();
            for(int i=0; i<2; i++){
                String line = br.readLine();
                char[] lineArray = line.toCharArray();

                if(lineArray[1] == 'K'){
                    Piece k = new King(PieceColor.valueOf(Character.toString(lineArray[0])));
                    k.setPositionC(replaceColumnLetter(lineArray[3]));
                    k.setPositionR(Integer.parseInt(Character.toString(lineArray[4]))-1);

                    pieces.addPiece(k);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pieces;
    }

    private int replaceColumnLetter(char ch){
        int i = 10;
        switch (ch) {
            case 'A':
                i = 0;
                break;
            case 'B':
                i = 1;
                break;
            case 'C':
                i = 2;
                break;
            case 'D':
                i = 3;
                break;
            case 'E':
                i = 4;
                break;
            case 'F':
                i = 5;
                break;
            case 'G':
                i = 6;
                break;
            case 'H':
                i = 7;
                break;
        }
        return i;
    }
}
