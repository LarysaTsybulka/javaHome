package game.participant;

import game.number_generator.NumberGenerator;

public class ParticipantFactory {
    public static Participant[] createParticipant( int countOfParticipant){
        Participant[] listPartisipant = new Participant[countOfParticipant];
        for (int i=0; i<countOfParticipant; i++){
            listPartisipant[i] = new Participant(i+1, NumberGenerator.generateNumbers(3));
        }
        return listPartisipant;
    }
}
