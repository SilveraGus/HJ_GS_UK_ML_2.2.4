package examples.pltw.org.collegeapp;

/**
 * Created by wdumas on 4/8/16.
 */
public class Guardian extends FamilyMember {
    private String occupation;

    public Guardian () {
        super();
        occupation = "unknown";
    }

    public Guardian (String firstName, String lastName) {
        super(firstName, lastName);
        occupation = "unknown";
    }
    public Guardian (String firstName, String lastName, String o) {
        super(firstName, lastName);
        occupation = o;
    }
    public String getOccupation() {
        return occupation;
    }
    public String toString() {
        return getFirstName() +" "+ getLastName() +"\n"+ occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
