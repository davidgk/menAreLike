package menAreLike;

/**
 * @author david.kotlirevsky
 */
public class Woman implements SexMaker{

    private boolean isBeautifull ;
    private boolean hasLeid;
    private boolean acceptFirstDateSex;
    private boolean isWhore;

    public static Woman create(boolean isBeautiful, boolean acceptFirstDateSex, boolean isWhore) {
        Woman woman = new Woman();
        woman.isBeautifull = isBeautiful;
        woman.acceptFirstDateSex = acceptFirstDateSex;
        woman.isWhore = isWhore;
        return woman;
    }

    public boolean getLeid() {
        return hasLeid;
    }

    public boolean acceptMan(Man man) {
        if (this.isWhore || theyAreInParty(man) || theyAreHot(man)) return true;
        if(this.onlyCaresMoney() ){
            return man.isRich();
        }
        return false;
    }

    private boolean theyAreHot(Man man) {
        return man.isHandsome() && this.acceptFirstDateSex;
    }

    private boolean theyAreInParty(Man man) {
        return man.isDrunk() && !this.isBeautifull;
    }

    private boolean onlyCaresMoney() {
        return this.isWhore;
    }

    public boolean acceptFirstDateSex() {
        return acceptFirstDateSex;
    }

    public void hasLeid(boolean hasLeid) {
        this.hasLeid = hasLeid;
    }
}
