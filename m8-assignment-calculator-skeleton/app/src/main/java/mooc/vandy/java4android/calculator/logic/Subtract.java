package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract implements Operation{
    @Override
    public String operateWithTwoValues(int a, int b) {
        return String.valueOf(a-b);
    }
}
