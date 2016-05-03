package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide implements Operation{
    @Override
    public String operateWithTwoValues(int a, int b) {
        if(b==0){
            return "We can't divide to zero!";
        }else{
            return String.valueOf(a/b)+" R: "+String.valueOf(a%b);
        }

    }
}
