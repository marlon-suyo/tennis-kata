/**
 * Created by Marlon Suyo on 4/4/2018.
 */
public class Advantage implements Score {
    private final Player advantaged;

    public Advantage(Player player) {
        advantaged = player;
    }

    public Score ballFor(Player player) {
        if(player.equals(advantaged))
            return new Win(advantaged);
        else
            return new Deuce();

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Advantage advantage = (Advantage) o;

        return advantaged == advantage.advantaged;
    }

    @Override
    public int hashCode() {
        return advantaged.hashCode();
    }
}
