package com.company;

import java.util.ArrayList;

public class jungle {


    public void sayAge(int age){
        System.out.println("my age is " + age);
    }

    public void sayName(String naam){
        System.out.println("my name is " + naam);
    }

    public void sayroepnaam(String roepnaam){
        System.out.println("mijn roepnaam is " + roepnaam);
    }

   public static void main (String[] args) {

        aap s = new aap();
        s.sayName("h");
        s.sayAge(19);
        s.sayroepnaam("hasoo");

    }
}