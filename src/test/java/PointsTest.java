import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;


/**
 * Created by Marlon Suyo on 4/4/2018.
 */
public class PointsTest {
    @Test
    public void whenPlayerOneScoresIncrementScoreFromLoveToFifteen() throws Exception {
        Points points = new Points(NumericalPoints.LOVE, NumericalPoints.LOVE);
        Score actual = points.ballFor(Player.ONE);

        Score expected = new Points(NumericalPoints.FIFTEEN, NumericalPoints.LOVE);
        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void whenPlayerOneScoresIncrementScoreFromFifteenToThirty() throws Exception {
        Points points = new Points(NumericalPoints.FIFTEEN, NumericalPoints.LOVE);
        Score actual = points.ballFor(Player.ONE);

        Score expected = new Points(NumericalPoints.THIRTY, NumericalPoints.LOVE);
        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void whenPlayerOneScoresIncrementScoreFromThirtyToForty() throws Exception {
        Points points = new Points(NumericalPoints.THIRTY, NumericalPoints.LOVE);
        Score actual = points.ballFor(Player.ONE);

        Score expected = new Forty(Player.ONE, NumericalPoints.LOVE);
        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void whenPlayerTwoScoresIncrementScoreFromLoveToFifteen() throws Exception {
        Points points = new Points(NumericalPoints.LOVE, NumericalPoints.LOVE);
        Score actual = points.ballFor(Player.TWO);

        Score expected = new Points(NumericalPoints.LOVE, NumericalPoints.FIFTEEN);
        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void whenPlayerTwoScoresIncrementScoreFromFifteenToThirty() throws Exception {
        Points points = new Points(NumericalPoints.LOVE, NumericalPoints.FIFTEEN);
        Score actual = points.ballFor(Player.TWO);

        Score expected = new Points(NumericalPoints.LOVE, NumericalPoints.THIRTY);
        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void whenPlayerTwoScoresIncrementScoreFromThirtyToForty() throws Exception {
        Points points = new Points(NumericalPoints.LOVE, NumericalPoints.THIRTY);
        Score actual = points.ballFor(Player.TWO);

        Score expected = new Forty(Player.TWO, NumericalPoints.LOVE);
        assertThat(actual, is(equalTo(expected)));
    }
}