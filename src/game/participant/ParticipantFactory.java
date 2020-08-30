package game.participant;

import game.numbergenerator.NumberGenerator;

public class ParticipantFactory {
    public static Participant[] createParticipant(int countOfParticipant) {
        Participant[] participants = new Participant[countOfParticipant];
        for (int i = 0; i < countOfParticipant; i++) {
            participants[i] = new Participant(i + 1, NumberGenerator.generateNumbers(countOfParticipant));
        }
        return participants;
    }

    private ParticipantFactory() {
    }
}
