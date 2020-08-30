package game.participant;

public class Participant {
    private int numberOfParticipant;
    private int[] ticket;
    private boolean isPlayer;
    private boolean isWinner;

    public Participant(int numberOfParticipant, int[] ticket) {
        this.numberOfParticipant = numberOfParticipant;
        this.ticket = ticket;
        this.isPlayer = false;
        this.isWinner = false;
    }

    public int getNumberOfParticipant() {
        return numberOfParticipant;
    }

    public void setNumberOfParticipant(int numberOfParticipant) {
        this.numberOfParticipant = numberOfParticipant;
    }

    public int[] getTicket() {
        return ticket;
    }

    public void setTicket(int[] ticket) {
        this.ticket = ticket;
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
    public void getInfo(){
        System.out.println("Номер игрока: "+ getNumberOfParticipant()+ " Билет с числами: " + getTicket());
    }
    public void getLuckyParticipants(){
        System.out.println("Номер игрока: "+ getNumberOfParticipant()+ " Билет с числами: " + getTicket()
        + " Выигрышный?: " + isWinner());
    }
}
