package menAreLike;

/**
 * @author david.kotlirevsky
 */
public class Man implements SexMaker{

    private boolean isRich;
    private boolean hasLeid;
    private boolean handsome;
    private boolean isDrunk;

    public static Man create(boolean isRich, boolean handsome, boolean isDrunk) {
        Man man = new Man();
        man.isRich = isRich;
        man.handsome =  handsome;
        man.isDrunk =  isDrunk;
        return man;
    }

    public boolean getLeid() {
        return hasLeid;
    }

    public boolean proposeTo(Woman woman) {
        boolean wasAccepted = woman.acceptMan(this);
        this.hasLeid = wasAccepted && woman.acceptFirstDateSex();
        woman.hasLeid(hasLeid);
        return wasAccepted;
    }

    public boolean isRich() {
        return isRich;
    }

    public boolean isHandsome() {
        return this.handsome;
    }

    public boolean fap() {
        return !hasLeid;
    }

    public boolean isDrunk() {
        return isDrunk;
    }
}
