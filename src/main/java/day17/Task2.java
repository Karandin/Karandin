package day17;

public class Task2 {
    public static void main(String[] args) {

    ChessBoard board = new ChessBoard(new ChessPiece[][]
            {{ChessPiece.ROOK_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.ROOK_BLACK, ChessPiece.KING_BLACK, ChessPiece.EMPTY},
            {ChessPiece.EMPTY, ChessPiece.ROOK_WHITE, ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.PAWN_BLACK, ChessPiece.PAWN_BLACK,ChessPiece.EMPTY,ChessPiece.PAWN_BLACK},
            {ChessPiece.PAWN_BLACK,ChessPiece.EMPTY,ChessPiece.HORSE_BLACK,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.PAWN_BLACK,ChessPiece.EMPTY},
            {ChessPiece.QUEEN_BLACK,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.ELEPHANT_WHITE,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY},
            {ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.ELEPHANT_BLACK,ChessPiece.PAWN_WHITE,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY},
            {ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.ELEPHANT_WHITE, ChessPiece.PAWN_WHITE,ChessPiece.EMPTY,ChessPiece.EMPTY},
            {ChessPiece.PAWN_WHITE,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.QUEEN_WHITE,ChessPiece.EMPTY,ChessPiece.PAWN_WHITE,ChessPiece.EMPTY,ChessPiece.PAWN_WHITE},
            {ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.ROOK_WHITE, ChessPiece.KING_WHITE,ChessPiece.EMPTY}});

    board.print();
    }
}
