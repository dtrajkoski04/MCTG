package application.model;

public class GameStats {
    private int gamesPlayed;
    private int elo;

    public GameStats() {
        this.gamesPlayed = 0;
        this.elo = 100; // Default starting ELO
    }

    public void updateStats(boolean won) {
        gamesPlayed++;
        if (won) {
            elo += 3; // Win increases ELO
        } else {
            elo -= 5; // Loss decreases ELO
        }
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public int getElo() {
        return elo;
    }

    @Override
    public String toString() {
        return String.format("Games Played: %d, ELO: %d", gamesPlayed, elo);
    }
}
