/**
 * Created by Marlon Suyo on 4/4/2018.
 */
public class Points implements Score {
    private final NumericalPoints numericalPointsOne;
    private final NumericalPoints numericalPointsTwo;

    public Points(NumericalPoints numericalPointsOne, NumericalPoints numericalPointsTwo) {
        this.numericalPointsOne = numericalPointsOne;
        this.numericalPointsTwo = numericalPointsTwo;
    }

    public Score ballFor(Player player) {
        if(player == Player.ONE) {
            if(numericalPointsOne == NumericalPoints.LOVE)
                return new Points(NumericalPoints.FIFTEEN, numericalPointsTwo);
            else if(numericalPointsOne == NumericalPoints.FIFTEEN)
                return new Points(NumericalPoints.THIRTY, numericalPointsTwo);
            else
                return new Forty(Player.ONE, numericalPointsTwo);
        }
        else {
            if(numericalPointsTwo == NumericalPoints.LOVE)
                return new Points(numericalPointsOne, NumericalPoints.FIFTEEN);
            else if(numericalPointsTwo == NumericalPoints.FIFTEEN)
                return new Points(numericalPointsOne, NumericalPoints.THIRTY);
            else
                return new Forty(Player.TWO, numericalPointsOne);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Points points = (Points) o;

        if (numericalPointsOne != points.numericalPointsOne) return false;
        return numericalPointsTwo == points.numericalPointsTwo;
    }

    @Override
    public int hashCode() {
        int result = numericalPointsOne.hashCode();
        result = 31 * result + numericalPointsTwo.hashCode();
        return result;
    }
}
