package mooc.vandy.java4android.gate.logic;

import java.util.Random;

import mooc.vandy.java4android.gate.ui.OutputInterface;

/**
 * This executable Android App will use your Gate class.  We have
 * supplied you will the code necessary to execute as an app.  You
 * must fill in the missing logic below.
 */
public class HerdManager {
    /**
     * Reference to the output.
     */
    private OutputInterface mOut;

    /**
     * Constructor initializes the field.
     */
    public HerdManager(OutputInterface out) {
        mOut = out;
    }

    // TODO -- Fill your code in here
    public static final int HERD = 24;


    public void setGates(Gate in, Gate out) {
        in.open(Gate.IN);
        out.open(Gate.OUT);
    }

    public void simulateHerd(Gate eastGate, Gate westGate, Random random) {
        int penNumberSnails = HERD;
        int pastureNumberSnails = 0;
        mOut.println("There are currently "+penNumberSnails+" snails in the pen and "+pastureNumberSnails+" snails in the pasture");
        for (int i=0;i<10;i++) {
            if(pastureNumberSnails==0){
                int qty = random.nextInt(HERD)+1;
                eastGate.thru(qty);
                pastureNumberSnails = qty;
                penNumberSnails -=qty;
                mOut.println("There are currently "+penNumberSnails+" snails in the pen and "+pastureNumberSnails+" snails in the pasture");
            }else{
                if(random.nextBoolean()){
                    int qty = random.nextInt(penNumberSnails)+1;
                    eastGate.thru(qty);
                    pastureNumberSnails += qty;
                    penNumberSnails -=qty;
                    mOut.println("There are currently "+penNumberSnails+" snails in the pen and "+pastureNumberSnails+" snails in the pasture");
                }else{
                    int qty = random.nextInt(pastureNumberSnails)+1;
                    westGate.thru(qty);
                    pastureNumberSnails -= qty;
                    penNumberSnails +=qty;
                    mOut.println("There are currently "+penNumberSnails+" snails in the pen and "+pastureNumberSnails+" snails in the pasture");
                }
            }
        }
    }
}
