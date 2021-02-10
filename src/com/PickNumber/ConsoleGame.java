package com.PickNumber;

import java.util.Scanner;

public class ConsoleGame {

    Mechanics mech = new Mechanics();
    Scanner scanner = new Scanner(System.in);

    boolean check = false;

    public int setNumber(){
        String pickedNumber = scanner.nextLine();
        int n = Integer.parseInt(pickedNumber);
        return n;
    }

    public void start() {
        while (!check) {
            if (mech.checkNumbers(setNumber())) {
                check = true;
            }
        }
    }
}
