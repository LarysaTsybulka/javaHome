package game.simulator;

import game.participant.Participant;
import game.participant.ParticipantFactory;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StartGame {
    private static final String ENTER_NUMBER_OF_PARTICIPANTS = "Введите количество игроков:";
    private static final String LIST_OF_PARTICIPANTS = "Cписок игроков:";
    private static final String CHOOSE_OF_PLAYER = "Ввведите номер своего игрока:";
    private static final String GENERATE_OF_COMBINATION = "Выигрышная комбинация:";
    private static final String FIND_LUCKY_TICKETS = "Поиск выигрышных билетов";
    private static final String PARTICIPANT_INFO = "Номер игрока: %d, Билет с числами: %s";
    private static final String SHOW_RESULTS = "Номер игрока: %d, Билет с числами: %s, Выигрышный?: %b";


    public static void main(String[] args){
        System.out.println(ENTER_NUMBER_OF_PARTICIPANTS);
        GameSimulator gameSimulator = new GameSimulator(enterCountOfParticiant());
        System.out.println(LIST_OF_PARTICIPANTS);
        showParticipants(gameSimulator.getParticipants());
        System.out.println(CHOOSE_OF_PLAYER);
        gameSimulator.choosePlayer(enterPlayer());
        System.out.println(GENERATE_OF_COMBINATION);
        System.out.println(gameSimulator.getCombination().toString());
        System.out.println(FIND_LUCKY_TICKETS);
        gameSimulator.findLuckyParticipants();
        showResults(gameSimulator.getParticipants());
        showResultOfActivePlayer(gameSimulator.getActivePlayer());

    }
    private static int enterCountOfParticiant() {
        Scanner in = new Scanner(System.in);
        int countOfParticipant = in.nextInt();
        return countOfParticipant;
    }

    private static void showParticipants(Participant[] participants) {
        for (Participant participant : participants) {
            String info = String.format(PARTICIPANT_INFO,participant.getNumberOfParticipant(),
                    participant.getTicket().toString());
            System.out.println(info);
        }
    }

    private static int enterPlayer() {
        Scanner in = new Scanner(System.in);
        int player = in.nextInt();
        return player;
    }

    private static void showResults(Participant[] participants) {
        for (Participant participant : participants) {
            String info = String.format(PARTICIPANT_INFO,participant.getNumberOfParticipant(),
                    participant.getTicket().toString(), participant.isWinner());
            System.out.println(info);
        }
    }
    private static void showResultOfActivePlayer(Participant participant){
        if (participant!= null && participant.isWinner()){
            System.out.println(" Вы выиграли!");
        }else {
            System.out.println(" Вы програли!");
        }
    }
}
