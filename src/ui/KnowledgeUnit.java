package ui;
import model.Company;
import model.KnowledgeUnitType;
import java.util.Scanner;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class KnowledgeUnit {
    public static Company greenSQA = new Company("Green SQA");
    public static Scanner in = new Scanner(System.in);

    /**
    * Prints the name of a required date (e.g. start date) reads a date formated (dd-mm-yyyy) from console
    * and returns the date in Calendar data type.
    * Usage:
    * {@code Calendar birthdate = createDate("birthdate")} 
    * @param requiredDate The name of the date needed
    * @return
    */
    public static Calendar readDate(String requiredDate) {
        boolean run = true;
        Calendar date = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        
        while (run) {
            System.out.print("Enter " + requiredDate + " (dd-mm-yyyy): ");
            String dateString = in.nextLine();
            
            try {
                date.setTime(dateFormat.parse(dateString));
                run = false;
            }
            catch (Exception e) {
                System.out.println("Invalid date format.");
            }
        }
        return date;
    }

    public static String DateToString(Calendar date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy"); // Date format can be - or /
        String dateToString = dateFormat.format(date.getTime());
        return dateToString;
    }

    public static int menu() {
        boolean runMenu = true;
        String selectionString = null;
        int selection = 0;

        while(runMenu) {
            System.out.println("1. Create project");
            System.out.println("2. End a project stage");
            System.out.println("3. Register Capsule");
            System.out.println("4. Approve capsule");
            System.out.println("5. Publish capsule");
            System.out.print("Selection: ");
            selectionString = in.nextLine();

            try {
                selection = Integer.parseInt(selectionString);
                runMenu = false;
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid Selection. Please try again.\n");
            }
        }
        return selection;
    }

    public static void main(String args[]) {
        KnowledgeUnitType mType = KnowledgeUnitType.DOMAIN;
        System.out.println(mType);

        int selection = menu();
        System.out.println("Selection: " + selection);
        System.out.println("This code does not do anything... not yet.");
    }
}
