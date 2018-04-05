import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

/**
 * Created by Marlon Suyo on 4/4/2018.
 */
public class AdvantageTest {
    @Test
    public void whenAdvantagedScoresHeWins() throws Exception {
        Advantage advantaged = new Advantage(Player.ONE);
        Score actual = advantaged.ballFor(Player.ONE);

        Score expected = new Win(Player.ONE);
        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void whenAdvantagedDoesNotScoreGoToDeuce() throws Exception {
        Advantage advantaged = new Advantage(Player.ONE);
        Score actual = advantaged.ballFor(Player.TWO);

        Score expected = new Deuce();
        assertThat(actual, is(equalTo(expected)));
    }
}