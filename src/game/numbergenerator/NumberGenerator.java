package game.numbergenerator;

import java.util.HashSet;
import java.util.Set;

public class NumberGenerator {
    public static Set<Integer> generateNumbers(int countOfNumbers) {
        HashSet<Integer> ticket = new HashSet<Integer>();
        while (ticket.size() != countOfNumbers) {
            ticket.add((int) (Math.random() * (49) + 1));
        }
        return ticket;
    }
    private NumberGenerator(){}
}
