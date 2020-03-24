package com.company;

import java.util.ArrayList;

public class jungle {
    String name;

    public void sayName(){
        System.out.println("my name!");
    }

    public void sayName(String naam){
        System.out.println("my name is " + naam);
    }

   public static void main (String[] args) {

        aap s = new aap();
        s.sayName("h");

    }
}