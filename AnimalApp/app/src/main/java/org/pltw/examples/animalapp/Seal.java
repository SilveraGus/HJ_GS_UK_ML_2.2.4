package org.pltw.examples.animalapp;

/**
 * Created by HarshaJagarlamudi on 1/31/2018.
 */

public class Seal extends Animal implements Fun {
    public Seal(){}  //step 14

    public String say() {
        return "arf";
    }

    public String play(){  //step 25
        return "The seal bounces a ball off its nose.";
    }
}
