package mooc.vandy.java4android.gate.logic;

import java.util.Random;

import mooc.vandy.java4android.gate.ui.OutputInterface;

/**
 * This executable Android app will use your Gate.java class.  We have
 * supplied you with the code necessary to execute as an app.  You
 * must fill in the logic.
 */
public class FillTheCorral {
    /**
     * Reference to the OutputInterface.
     */
    private OutputInterface mOut;

    /**
     * Constructor initializes the field.
     */
    FillTheCorral(OutputInterface out) {
        mOut = out;
    }

    // TODO -- Fill your code in here
    public void setCorralGates(Gate[] gates, Random random) {
        for (Gate gate : gates) {
            if (random.nextBoolean()) {
                gate.open(Gate.IN);
            } else {
                gate.open(Gate.OUT);
            }
        }
    }

    public boolean anyCorralAvailable(Gate[] gates) {
        for (Gate gate : gates) {
            if (gate.getSwingDirection() == Gate.IN && !gate.isLocked())
                return true;
        }
        return false;
    }

    public void corralSnails(Gate[] gates, Random random) {
        int pastureNumberSnails = 5;
        int attempts = 0;
        if (anyCorralAvailable(gates)) {
            do {
                int qty = random.nextInt(pastureNumberSnails) + 1;
                int coralIndex = random.nextInt(gates.length);
                if (gates[coralIndex].isLocked()) {
                    mOut.println(qty + " snails are trying to move through locked coral " + coralIndex + ".");
                } else if (gates[coralIndex].getSwingDirection() == Gate.IN) {
                    pastureNumberSnails -= qty;
                    mOut.println(qty + " snails are trying to move through entry coral " + coralIndex + ".");
                } else {
                    pastureNumberSnails += qty;
                    mOut.println(qty + " snails are trying to move through exit coral " + coralIndex + ".");
                }
                attempts++;
                mOut.println("There are currently " + pastureNumberSnails + " snails still in the pasture.");
            } while (pastureNumberSnails != 0);
            mOut.println("It took " + attempts + " attempts to coral all of the snails.");
        }

    }
}
