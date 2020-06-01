package com.company;

import CourseWork.Board;

public class Main {

    public static void main(String[] args) {
        String[] PlayBoard = new String[20];


     PlayBoard = Board.defaultArray(PlayBoard);
     Board.shuffle(PlayBoard);
     Board.renderBoard(PlayBoard);



    }

}



