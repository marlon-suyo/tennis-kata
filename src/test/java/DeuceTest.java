import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

/**
 * Created by Marlon Suyo on 4/4/2018.
 */
public class DeuceTest {
    @Test
    public void whenPlayerScoresHeHasAdvantage() throws Exception {
        Deuce deuce = new Deuce();
        Score actual = deuce.ballFor(Player.TWO);

        Score expected = new Advantage(Player.TWO);
        assertThat(actual, is(equalTo(expected)));
    }
}