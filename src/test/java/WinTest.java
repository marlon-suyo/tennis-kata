import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

/**
 * Created by Marlon Suyo on 4/4/2018.
 */
public class WinTest {
    @Test
    public void whenWinnerScoresDoNothing() throws Exception {
        Win winner = new Win(Player.ONE);
        Score actual = winner.ballFor(Player.ONE);

        Score expected = new Win(Player.ONE);
        assertThat(actual, is(equalTo(expected)));
    }
}