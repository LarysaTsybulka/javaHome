package game.number_generator;

public class NumberGenerator {
    public static int[] generateNumbers(int countOfNumbers){
        int[] ticket = new int[countOfNumbers];
        for (int i = 0; i < countOfNumbers; i++){
            ticket[i] = (int) (Math.random()*(49)+1);
        }
        return ticket;
    }
}
