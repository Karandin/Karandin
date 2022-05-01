package day17;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
    String [] arr = new String[8];
        for(int i = 0; i < 4; i++) {
            arr[i] = ChessPiece.PAWN_WHITE.getMeaning();
            System.out.print(arr[i] + " ");
        }
        for(int i = 4; i < 8; i++) {
            arr[i] = ChessPiece.ROOK_BLACK.getMeaning();
            System.out.print(arr[i] + " ");
        }
    }
}