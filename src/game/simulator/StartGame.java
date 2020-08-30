package game.simulator;

import game.participant.Participant;
import game.participant.ParticipantFactory;

public class StartGame {
    private static final String ENTER_NUMBER_OF_PARTICIPANTS = "Введите количество игроков:";
    private static final String LIST_OF_PARTICIPANTS = "Cписок игроков:";
    private static final String CHOOSE_OF_PLAYER = "Ввведите номер своего игрока:";
    private static final String GENERATE_OF_COMBINATION = "Выигрышная комбинация:";

    public static void main(String[] args){
        System.out.println(ENTER_NUMBER_OF_PARTICIPANTS);
        Participant[] listOfParticipant = ParticipantFactory.createParticipant(GameSimulator.enterCountOfParticiant());
        System.out.println(LIST_OF_PARTICIPANTS);
        GameSimulator.showParticipants(listOfParticipant);
        System.out.println(CHOOSE_OF_PLAYER);
        GameSimulator.choosePlayer(listOfParticipant);
        GameSimulator.generateCombination(6);
       // GameSimulator.showCombination();

    }
}
