package examples.pltw.org.collegeapp;

import java.util.ArrayList;

/**
 * Created by wdumas on 4/8/16.
 */
public class Family {
    private static final String TAG = Family.class.getName();

    private static Family sFamily;

    private ArrayList<FamilyMember> family = new ArrayList<>();

    private Family() {
        family = new ArrayList<>();
        family.add(new Guardian("Elon","Musk", "truck driver"));
        family.add(new Guardian("Frodo","Baggins", "Hobbit"));
        family.add(new Guardian("The","Onceler", "Enviro Student"));
        family.add(new Guardian("Dean","Martin", "Mother"));
        family.add(new Sibling());

    }

    public static Family get() {
        if (sFamily == null) {
            sFamily = new Family();
        }
        return sFamily;

    }

    public ArrayList<FamilyMember> getFamily() {
        return family;
    }

    public void setFamily(ArrayList<FamilyMember> family) {
        this.family = family;
    }
}
