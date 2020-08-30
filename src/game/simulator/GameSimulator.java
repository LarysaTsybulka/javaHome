package game.simulator;

import game.numbergenerator.NumberGenerator;
import game.participant.Participant;
import game.participant.ParticipantFactory;

import java.util.Set;

public class GameSimulator {
    private static final int SIZE_OF_COMBINATION = 6;

    private Set<Integer> combination;
    private Participant[] participants;

    public GameSimulator(int countOfParticipant) {
        this.participants = ParticipantFactory.createParticipant(countOfParticipant);
        combination = NumberGenerator.generateNumbers(SIZE_OF_COMBINATION);
    }

    public Set<Integer> getCombination() {
        return combination;
    }

    public Participant[] getParticipants() {
        return participants;
    }

    public void choosePlayer(int numberOfPlayer) {
        for (int i = 0; i < participants.length; i++) {
            if (participants[i].getNumberOfParticipant() == numberOfPlayer) {
                participants[i].setPlayer(true);
                break;
            }
        }
    }

    public void findLuckyParticipants() {
        for (Participant participant : participants) {
            if (combination.containsAll(participant.getTicket())) {
                participant.setWinner(true);
            }
        }
    }

    public Participant getActivePlayer() {
        for (Participant participant : participants) {
            if (participant.isPlayer()) {
                return participant;
            }
        }
        return null;
    }
}
