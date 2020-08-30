package game.simulator;

import game.number_generator.NumberGenerator;
import game.participant.Participant;
import game.participant.ParticipantFactory;

import java.util.Scanner;

public class GameSimulator {
    private int[] combination;
    //   private Participant[] listOfParticipant;

    public static void generateCombination(int countOfNumbers) {
        int[] combination = NumberGenerator.generateNumbers(countOfNumbers);
    }

  /*  public static void showCombination() {
        System.out.println(combination);
    }*/

    public static int enterCountOfParticiant() {
        Scanner in = new Scanner(System.in);
        int countOfParticipant = in.nextInt();
        return countOfParticipant;
    }

    /*    public void generateOfParticipants (int countOfParticipant){
            listOfParticipant = ParticipantFactory.createParticipant(countOfParticipant);
        }*/
    public static void showParticipants(Participant[] listOfParticipant) {
        for (Participant participant : listOfParticipant) {
            participant.getInfo();
        }
    }

    public static void choosePlayer(Participant[] listOfParticipant) {
        Scanner in = new Scanner(System.in);
        int numberOfPlayer = in.nextInt();
        for (int i = 0; i < listOfParticipant.length; i++) {
            if (listOfParticipant[i].getNumberOfParticipant() == numberOfPlayer) {
                listOfParticipant[i].setPlayer(true);
            }
        }
    }

    public static void findLuckyParticipants(Participant[] listOfParticipant, int[] combination) {
        boolean condition = false;
        for (Participant participant : listOfParticipant) {
            for (int i = 0; i < participant.getTicket().length; i++) {
                for (int j = 0; j < combination.length; j++) {
                    if (participant.getTicket()[i] == combination[j]) {
                        condition = true;
                    } else {
                        condition = false;
                    }
                }
            }
            if (condition) {
                participant.setWinner(true);
            }
        }
    }

    public static void showResults(Participant[] listOfParticipant) {
        for (Participant participant : listOfParticipant) participant.getLuckyParticipants();
    }

    public static void checkPlayer(Participant[] listOfParticipant) {
        for (Participant participant : listOfParticipant) {
            if (participant.isPlayer()) {
                if (participant.isWinner()) {
                    System.out.println("Вы выиграли!");
                } else {
                    System.out.println("Вы проиграли!");
                }
            }
        }
    }
}
