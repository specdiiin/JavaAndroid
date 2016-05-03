package mooc.vandy.java4android.gate.logic;

/**
 * @@ Julie, please fill in here.
 */
public class Gate {
    // TODO -- Fill in your code here
    private boolean locked = true;
    private int swing = 0;
    public static final int OUT = -1;
    public static final int IN = 1;
    public boolean setSwing(int direction) {
        if (direction == OUT || direction == IN) {
            swing = direction;
            return true;
        }
        return false;
    }
    public boolean open(int direction) {
        if (direction == OUT || direction == IN) {
            swing = direction;
            locked = false;
            return true;
        }
        return false;
    }
    public void close() {
        locked = true;
    }
    public boolean isLocked() {
        return locked;
    }
    public int getSwingDirection() {
        return swing;
    }
    public int thru(int count) {
        return count * swing;
    }
    public String toString() {
        if (locked)
            return "This gate is locked";
        if (!locked && swing == 0)
            return "This gate is not locked and swings but the swing is not set properly";
        if (!locked && swing == 1)
            return "This gate is not locked and swings to enter the pen only";
        if (!locked && swing == -1)
            return "This gate is not locked and swings to exit the pen only";
        return "";
    }

}
