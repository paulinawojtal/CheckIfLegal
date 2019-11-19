package boardManagement;

import pieceManagement.King;
import pieceManagement.Piece;
import pieceManagement.PieceColor;
import pieceManagement.Pieces;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

class ChessBoardReader {

    private String fileName;
    private Pieces pieces;

    public ChessBoardReader(String fileName, Pieces pieces) {
        this.fileName = fileName;
        this.pieces = pieces;
    }

    public String getFileName() {
        return fileName;
    }

    public Pieces getPieces() {
        return pieces;
    }

    Pieces read() {

        Pieces pieces = new Pieces();
        List<String> lines;

        try {
            lines = Files.readAllLines(Paths.get(fileName));

            String turn;

            for (String line : lines) {
                if (line.startsWith("W") || line.startsWith("B")) {
                    Piece p = new King(PieceColor.valueOf(Character.toString(line.charAt(0))));
                    p.setPositionC(line.charAt(3)-'A');
                    p.setPositionR(line.charAt(4) - '0');
                    pieces.addPiece(p);
                } else if(line.startsWith(">")){
                    turn = line;
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pieces;
    }
}
