package org.pltw.examples.animalapp;

/**
 * Created by HarshaJagarlamudi on 2/1/2018.
 */

public class Fox extends Animal implements Fun{  //step 28
    public Fox(){}

    public String say(){  //step 31
        return "moo";
    }

    public String play(){  //step 29
        return "The fox chases mice and digs holes!";
    }
}
