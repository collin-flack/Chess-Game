package com.company;

import com.company.chess.main.board.Board;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Board board = Board.createStandardBoard();

        System.out.println(board);
    }
}
