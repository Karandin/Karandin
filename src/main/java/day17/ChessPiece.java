package day17;

public enum ChessPiece {

    KING_WHITE(100.0, "♔"), KING_BLACK(100.0, "♚"),
    QUEEN_WHITE(9.0, "♕"), QUEEN_BLACK(9.0, "♛"),
    ROOK_WHITE(5.0, "♖"), ROOK_BLACK(5.0, "♜"),
    ELEPHANT_WHITE(3.5, "♗"), ELEPHANT_BLACK(3.5, "♝"),
    HORSE_WHITE(3.0, "♘"), HORSE_BLACK(3.0, "♞"),
    PAWN_WHITE(1.0, "♙"), PAWN_BLACK(1.0, "♟"),
    EMPTY (-1, "_");

    private double value;
    private String meaning;

    public String getMeaning() {
        return meaning;
    }

    ChessPiece (double value, String meaning) {
        this.value = value;
        this.meaning = meaning;

    }
}
