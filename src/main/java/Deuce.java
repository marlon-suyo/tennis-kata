/**
 * Created by Marlon Suyo on 4/4/2018.
 */
public class Deuce implements Score {
    public Deuce() {

    }

    public Score ballFor(Player player) {
        return new Advantage(player);
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Deuce;
    }
}
