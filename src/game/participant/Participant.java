package game.participant;

import java.util.Set;

public class Participant {
    private int numberOfParticipant;
    private Set<Integer> ticket;
    private boolean isPlayer;
    private boolean isWinner;

    public Participant(int numberOfParticipant, Set<Integer> ticket) {
        this.numberOfParticipant = numberOfParticipant;
        this.ticket = ticket;
        this.isPlayer = false;
        this.isWinner = false;
    }

    public int getNumberOfParticipant() {
        return numberOfParticipant;
    }

    public Set<Integer> getTicket() {
        return ticket;
    }

    public boolean isPlayer() {
        return isPlayer;
    }

    public void setPlayer(boolean player) {
        isPlayer = player;
    }

    public boolean isWinner() {
        return isWinner;
    }

    public void setWinner(boolean winner) {
        isWinner = winner;
    }
}
