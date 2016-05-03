package mooc.vandy.java4android.diamonds.logic;

import android.util.Log;
import mooc.vandy.java4android.diamonds.ui.OutputInterface;

/**
 * This is where the logic of this App is centralized for this assignment.
 * <p>
 * The assignments are designed this way to simplify your early
 * Android interactions.  Designing the assignments this way allows
 * you to first learn key 'Java' features without having to beforehand
 * learn the complexities of Android.
 */
public class Logic
       implements LogicInterface {
    /**
     * This is a String to be used in Logging (if/when you decide you
     * need it for debugging).
     */
    public static final String TAG = Logic.class.getName();

    /**
     * This is the variable that stores our OutputInterface instance.
     * <p>
     * This is how we will interact with the User Interface [MainActivity.java].
     * <p>
     * It is called 'out' because it is where we 'out-put' our
     * results. (It is also the 'in-put' from where we get values
     * from, but it only needs 1 name, and 'out' is good enough).
     */
    private OutputInterface mOut;

    /**
     * This is the constructor of this class.
     * <p>
     * It assigns the passed in [MainActivity] instance (which
     * implements [OutputInterface]) to 'out'.
     */
    public Logic(OutputInterface out){
        mOut = out;
    }

    /**
     * This is the method that will (eventually) get called when the
     * on-screen button labeled 'Process...' is pressed.
     */
    public void process(int size) {

        // TODO -- add your code here
        printHeaderAndFooter(size);
        printBody(size);
        printHeaderAndFooter(size);

    }

    public void printBody(int size) {
        if (size == 1) {
            mOut.println("|<>|");
        } else if (size > 1) {
            int temp = size;
            for (int j = 0; j < size * 2 - 1; j++) {
                String row = "|";
                if (j < size) {
                    for (int i = 0; i < size * 2; i++) {
                        if (j == size - 1 && (i == 0 || i == size * 2 - 1)) {
                            if (i == 0) {
                                row += "<";
                            } else {
                                row += ">";
                            }
                        } else if (i == temp - 1 && !(i == 0)) {
                            row += "/";
                        } else if (i == 2 * size - temp && !(i == size - 1)) {
                            row += "\\";
                        } else if (2 * size - temp > i && i > temp - 1) {
                            if (j % 2 == 0) {
                                row += "=";
                            } else {
                                row += "-";
                            }
                        } else {
                            row += " ";
                        }
                    }
                    temp--;
                } else {

                    for (int i = size * 2; i > 0; i--) {
                        if (i == temp + 2 && !(i == 0)) {
                            row += "/";
                        } else if (i == size * 2 - (temp + 1)) {
                            row += "\\";
                        } else if (size * 2 - (temp + 1) > i && i > temp + 2) {
                            if (j % 2 == 0) {
                                row += "=";
                            } else {
                                row += "-";
                            }
                        } else {
                            row += " ";
                        }
                    }
                    temp++;
                }
                row += "|";
                mOut.println(row);
            }
        } else {
            mOut.println("You are using negative size!!! Please use only positive one");
        }
    }
    // TODO -- add your code here
    private void printHeaderAndFooter(int size){
        String row="+";
        for(int i=0;i<size;i++){
            row+="--";
        }
        row+="+";
        mOut.println(row);
    }

}
