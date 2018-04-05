/**
 * Created by Marlon Suyo on 4/4/2018.
 */
public enum NumericalPoints {
    LOVE("0"), FIFTEEN("15"), THIRTY("30");

    private final String numericalPoints;

    NumericalPoints(String numericalPoints) {
        this.numericalPoints = numericalPoints;
    }

    String showNumericalPoints() {
        return numericalPoints;
    }
}
