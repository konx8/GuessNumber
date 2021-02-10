package com.PickNumber;

import java.util.Random;

public class Mechanics {

    Random rand = new Random();
    int random = rand.nextInt(101);

    public boolean checkNumbers(int userNumber){

        if(random == userNumber){
            System.out.println("Wygrana");
            return true;
        }else if (random > userNumber){
            System.out.println("liczba zamała");

        }else {
            System.out.println("liczba zaduza");
        }
        return false;
    }
}