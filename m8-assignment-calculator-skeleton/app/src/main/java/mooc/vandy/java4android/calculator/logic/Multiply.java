package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply implements Operation{
    @Override
    public String operateWithTwoValues(int a, int b) {
        return String.valueOf(a*b);
    }
}
