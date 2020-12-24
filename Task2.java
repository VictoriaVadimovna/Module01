package com.alevel.module01;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        String[][] chess = new String[][]{
                {"A8", "B8", "C8", "D8", "E8", "F8", "G8", "H8"},
                {"A7", "B7", "C7", "E7", "F7", "G7", "H7"},
                {"A6", "B6", "C6", "E6", "F6", "G6", "H6"},
                {"A5", "B5", "C5", "E5", "F5", "G5", "H5"},
                {"A4", "B4", "C4", "E4", "F4", "G4", "H4"},
                {"A3", "B3", "C3", "E3", "F3", "G3", "H3"},
                {"A2", "B2", "C2", "E2", "F2", "G2", "H2"},
                {"A1", "B1", "C1", "E1", "F1", "G1", "H1"}
        };
        System.out.println("Введите текущую координату коня");
        Scanner scan = new Scanner(System.in);
        String koordKonya = scan.nextLine();

        System.out.println("Введите ход конем ");
        Scanner sca = new Scanner(System.in);
        String hodKon = sca.nextLine();




    }

    class Kon {
        String start;

        String hodKon();


    }
}
