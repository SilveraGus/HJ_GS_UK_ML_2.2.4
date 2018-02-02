package org.pltw.examples.animalapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.ArrayList;

public class AnimalActivity extends ActionBarActivity {

    public static TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);
        output = (TextView)findViewById(R.id.output);

        ArrayList<Animal> animals = new ArrayList<Animal>();  //step 15

        Duck duck = new Duck();  //step 10
        Fish fish = new Fish();
        Seal seal = new Seal();  //step 14
        Fox fox = new Fox();

        animals.add(duck);  //step 16
        animals.add(fish);  //step 18 and 20
        animals.add(seal);


        /*
        this.output.append("\nDuck say " + duck.say());  //step 11 and 12
        this.output.append("\nFish goes " + animals.get(1).say());  //step 17
        */

        for(int i = 0; i < animals.size(); i++){  //step 21 and 32
            if (animals.get(i) instanceof Seal) {
                this.output.append("\n" + ((Seal)animals.get(i)).play());  //step 26
            }
            if (animals.get(i) instanceof Fox) {
                this.output.append("\n" + ((Fox)animals.get(i)).play());  //step 26
            }
            this.output.append("\n" + animals.get(i) + " goes " + (animals.get(i)).say());
        }

        for(Animal a : animals){  //step 22
            this.output.append("\n" + a + " goes " + a.say());
            if (a instanceof Seal) {  //step 27
                this.output.append("\n" + ((Seal)a).play());  //step 26
            }
        }

        this.output.append("\nThe object at index 1: " + animals.get(1)); // step 19
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_animal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
