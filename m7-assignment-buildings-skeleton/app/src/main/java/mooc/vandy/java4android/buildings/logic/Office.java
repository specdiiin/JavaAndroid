package mooc.vandy.java4android.buildings.logic;

/**
 * This is the office class file, it is a subclass of Building.
 */
public class Office extends Building {

    // TODO - Put your code here.
    private String mBusinessName;
    private int mParkingSpaces;
    private static int sTotalOffices = 0;

    public Office(int length, int width, int lotLength, int lotWidth) {
        super(length, width, lotLength, lotWidth);
        sTotalOffices++;
    }

    public Office(int length, int width, int lotLength, int lotWidth, String businessName) {
        super(length, width, lotLength, lotWidth);
        sTotalOffices++;
        mBusinessName = businessName;
    }

    public Office(int length, int width, int lotLength, int lotWidth, String businessName, int parkingSpaces) {
        super(length, width, lotLength, lotWidth);
        sTotalOffices++;
        mBusinessName = businessName;
        mParkingSpaces = parkingSpaces;
    }

    public String getBusinessName() {
        return mBusinessName;
    }

    public void setBusinessName(String mBusinessName) {
        this.mBusinessName = mBusinessName;
    }

    public int getParkingSpaces() {
        return mParkingSpaces;
    }

    public void setParkingSpaces(int mParkingSpaces) {
        this.mParkingSpaces = mParkingSpaces;
    }

    public String toString() {
        String out ="Business: ";
        if(mBusinessName==null)
            return out+="unoccupied"+" (total offices: "+sTotalOffices+")";
        return out+=mBusinessName+"; has "+mParkingSpaces+" parking spaces (total offices: "+sTotalOffices+")";
    }

    public boolean equals(Object o) {
        if(o instanceof Office){
            Office otherOffice = (Office) o;
            if(mParkingSpaces==otherOffice.getParkingSpaces()&&calcBuildingArea()==otherOffice.calcBuildingArea())
                return true;
        }
        return false;
    }
}
