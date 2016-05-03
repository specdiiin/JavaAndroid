package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add implements Operation{
    @Override
    public String operateWithTwoValues(int a, int b) {
        return String.valueOf(a+b);
    }

}
