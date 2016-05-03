package mooc.vandy.java4android.buildings.logic;

/**
 * This is the House class file that extends Building.
 */
public class House extends Building {

    // TODO - Put your code here.
    private String mOwner;
    private boolean mPool;

    public House(int length, int width, int lotLength, int lotWidth) {
        super(length, width, lotLength, lotWidth);
    }

    public House(int length, int width, int lotLength, int lotWidth, String owner) {
        super(length, width, lotLength, lotWidth);
        mOwner = owner;
    }
    public House(int length, int width, int lotLength, int lotWidth, String owner, boolean pool) {
        super(length, width, lotLength, lotWidth);
        mOwner = owner;
        mPool = pool;
    }

    public String getOwner() {
        return mOwner;
    }

    public void setOwner(String mOwner) {
        this.mOwner = mOwner;
    }

    public boolean hasPool() {
        return mPool;
    }

    public void setPool(boolean mPool) {
        this.mPool = mPool;
    }
    public String toString(){
        String out ="Owner: ";
        if(mOwner!=null){
            out+=mOwner;
        }else{
            out+="n/a";
        }
        if(mPool)
            out+="; has a pool";
        if(calcBuildingArea()<calcLotArea())
            out+="; has a big open space";
        return out;
    }
    public boolean equals(Object o){
        if(o instanceof House){
            House otherHouse = (House) o;
            return calcBuildingArea() == otherHouse.calcBuildingArea()&&mPool==otherHouse.hasPool();
        }
        return false;
    }
}
