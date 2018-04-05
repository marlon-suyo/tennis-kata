/**
 * Created by Marlon Suyo on 4/4/2018.
 */
public class Win implements Score {
    private final Player winner;

    public Win(Player player) {
        winner = player;
    }

    public Score ballFor(Player player) {
        return new Win(winner);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Win win = (Win) o;

        return winner == win.winner;
    }

    @Override
    public int hashCode() {
        return winner.hashCode();
    }
}
