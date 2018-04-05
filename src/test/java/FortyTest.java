import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

/**
 * Created by Marlon Suyo on 4/4/2018.
 */
public class FortyTest {
    @Test
    public void whenFortyScoresHeWins() throws Exception {
        Forty forty = new Forty(Player.ONE, NumericalPoints.LOVE);
        Score actual = forty.ballFor(Player.ONE);

        Score expected = new Win(Player.ONE);
        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void whenFortyDoesNotScoreIncrementOpponentScoreFromLoveToFifteen() throws Exception {
        Forty forty = new Forty(Player.ONE, NumericalPoints.LOVE);
        Score actual = forty.ballFor(Player.TWO);

        Score expected = new Forty(Player.ONE, NumericalPoints.FIFTEEN);
        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void whenFortyDoesNotScoreIncrementOpponentScoreFromFifteenToThirty() throws Exception {
        Forty forty = new Forty(Player.ONE, NumericalPoints.FIFTEEN);
        Score actual = forty.ballFor(Player.TWO);

        Score expected = new Forty(Player.ONE, NumericalPoints.THIRTY);
        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void whenFortyDoesNotScoreIncrementOpponentScoreFromThirtyToDeuce() throws Exception {
        Forty forty = new Forty(Player.ONE, NumericalPoints.THIRTY);
        Score actual = forty.ballFor(Player.TWO);

        Score expected = new Deuce();
        assertThat(actual, is(equalTo(expected)));
    }
}