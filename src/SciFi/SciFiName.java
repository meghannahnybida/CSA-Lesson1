package SciFi;

/**
 * SciFiName gathers input from a user to generate a custom name that
 * sounds like it could be used in a science fiction book or movie.
 *
 * @author ckinnard
 * @version 3/4/16
 */

public class SciFiName
{
    /**
     * All input that you privide should be at least three letters long
     * or the program may crash (but feel free to test this!)
     */
    public static void main(String [] args) {
        System.out.println("If you provide me some information I will provide a Science Fiction name for you.");
        System.out.println("Please have all responses  be at least three characters long.");
        System.out.println("For best results, user lowercase letters with no spaces.\n");

        // notice this methd (print) does not print a newline
        System.out.print("Enter your first name: ");
        String firstName = UserInput.getString().toLowerCase();
        System.out.print("Enter your last name: ");
        String lastName = UserInput.getString().toLowerCase();
        System.out.print("Enter the city where you or one of your parents were born: ");
        String city = UserInput.getString().toLowerCase();
        System.out.print("Enter the name of your grammar school: ");
        String school = UserInput.getString().toLowerCase();
        System.out.print("Enter the first name of a sibling or other relative: ");
        String relativeName1 = UserInput.getString().toLowerCase();
        System.out.print("Enter the first name of a second sibling or relative: ");
        String relativeName2 = UserInput.getString().toLowerCase();

        // generate a sciFi name below this line
        String firstName1 = firstName.substring(0, 3);
        String firstName2 = lastName.substring(0, 2);
        String capFirstName = firstName1.substring(0, 1).toUpperCase() + firstName1.substring(1);
        System.out.println("Sci-fi first name: " + capFirstName + firstName2);

        String lastName1 = city.substring(0, 2);
        String lastName2 = school.substring(0, 3);
        String capLastName = lastName1.substring(0, 1).toUpperCase() + lastName1.substring(1);
        System.out.println("Sci-fi last name: " + capLastName + lastName2);

        int r = (int) (Math.random() * relativeName1.length() - 1);
        String relativeName3 = relativeName1.substring(r, relativeName1.length());
        String capOrigin = relativeName3.substring(0, 1).toUpperCase() + relativeName3.substring(1);
        int r2 = (int) (Math.random() * relativeName2.length() - 1);
        String relativeName4 = relativeName2.substring(r2, relativeName2.length());
        System.out.println("Sci-fi place of origin: " + capOrigin + relativeName4);

        System.out.println("Hello " + capFirstName + firstName2 + " " + capLastName + lastName2 + " of " + capOrigin +
                relativeName4 + ". Welcome!");

    }
}
