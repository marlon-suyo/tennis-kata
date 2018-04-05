/**
 * Created by Marlon Suyo on 4/4/2018.
 */
public enum Player {
    ONE("1"), TWO("2");

    private final String playerName;

    Player(String playerName) {
        this.playerName = playerName;
    }

    String showPlayerName() {
        return playerName;
    }
}
