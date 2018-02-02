package examples.pltw.org.collegeapp;

/**
 * Created by Gustavo Silvera on 2/1/2018.
 */

public class Sibling extends FamilyMember {

    public Sibling () {
        super();
    }

    public Sibling (String firstName, String lastName) {
        super(firstName, lastName);
    }

    public String toString() {
        return getFirstName() +" "+ getLastName();
    }
}
