import java.awt.font.NumericShaper;

/**
 * Created by Marlon Suyo on 4/4/2018.
 */
public class Forty implements Score {
    private final Player forty;
    private final NumericalPoints numericalPoints;

    public Forty(Player player, NumericalPoints numericalPoints) {
        forty = player;
        this.numericalPoints = numericalPoints;
    }

    public Score ballFor(Player player) {
        if(player.equals(forty)) {
            return new Win(forty);
        }
        else {
            if(numericalPoints == NumericalPoints.LOVE)
                return new Forty(forty, NumericalPoints.FIFTEEN);
            else if(numericalPoints == NumericalPoints.FIFTEEN)
                return new Forty(forty, NumericalPoints.THIRTY);
            else
                return new Deuce();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Forty forty1 = (Forty) o;

        if (forty != forty1.forty) return false;
        return numericalPoints == forty1.numericalPoints;
    }

    @Override
    public int hashCode() {
        int result = forty.hashCode();
        result = 31 * result + numericalPoints.hashCode();
        return result;
    }
}
