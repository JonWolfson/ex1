import java.util.Random;
import java.util.Scanner;

public class Prison {

  public static void main(String[] args){
    //delcare variables
    //True : the prisoner betrayed.
    //False : the prisoner stayed silent.
    boolean lastChoice1 = false;
    boolean lastChoice2 = false;
    int numRounds = 5;
    final int scoreWin = 0;
    final int scoreTie = 1;
    final int scoreTie2 = 3;
    final int scoreLose = 5;
    Scanner scan = new Scanner(System.in);

    //gets strategy
    System.out.print("Player 1 strategy: ");
    Player p1 = new Player(scan.next());
    System.out.print("\nPlayer 2 strategy: ");
    Player p2 = new Player(scan.next());

    //runs the simulation
    for(int i = 0; i < numRounds; i++) {
      System.out.println("Round " + (i + 1) + ":\nPlayer 1: " + p1.move(lastChoice1) + "\nPlayer 2: " + p2.move(lastChoice1));
      if(p1.getMove() && p2.getMove()) {
        p1.changeScore(scoreTie2);
        p2.changeScore(scoreTie2);
      }
      else {
        if(p1.getMove() && !p2.getMove()) {
          p1.changeScore(scoreWin);
          p2.changeScore(scoreLose);
        }
        else {
          if(!p1.getMove() && p2.getMove()) {
            p1.changeScore(scoreLose);
            p2.changeScore(scoreWin);
          }
          else {
            p1.changeScore(scoreTie);
            p2.changeScore(scoreTie);
          }
        }
      }

      lastChoice1 = p1.getMove();
      lastChoice2 = p2.getMove();
    }

    System.out.println("Final Score:\nPlayer 1: " + p1.getScore() + "\nPlayer 2: " + p2.getScore());
    if(p1.getScore() > p2.getScore()) {
      System.out.println("Congratulation Player 1 wins!");
    }
    else {
      if(p1.getScore() < p2.getScore()) {
        System.out.println("Congratulation Player 2 wins!");
      }
      else {
        System.out.println("Neither player wins!");
      }
    }
  }

  public static class Player {
    boolean move;
    int score;
    boolean otherSnitched;
    int otherSnitchedCount;
    char strategy;


    public Player(String strat) {
      score = 0;
      otherSnitched = false;
      otherSnitchedCount = 0;

      strategy = strat.toLowerCase().charAt(0);
    }

    public boolean move(boolean otherPlayer) {
      if(strategy == 'r') {
        move = rand();
      }
      else {
        if(strategy == 'b') {
          move = betray(otherPlayer);
        }
        else {
            if(strategy == 't') {
              move = trusting(otherPlayer);
            }
            else {
              if(strategy == 'o') {
                move = opposite(otherPlayer);
              }
              else {
                if(strategy == 's') {
                  move = same(otherPlayer);
                }
                else {
                  move = avenge(otherPlayer);
                }
              }
            }
        }
      }

      return move;
    }

    private boolean rand() {
      Random rand = new Random();
      return rand.nextBoolean();
    }

    private boolean betray(boolean otherPlayer) {
      if(otherPlayer) {
        otherSnitched = true;
      }

      if(otherSnitched) {
        return true;
      }
      else {
        return false;
      }
    }

    private boolean trusting(boolean otherPlayer) {
      if(otherPlayer) {
        otherSnitchedCount++;
      }

      if(otherSnitchedCount >= 2) {
        return true;
      }
      else {
        return false;
      }
    }

    private boolean opposite(boolean otherPlayer) {
      return !otherPlayer;
    }

    private boolean same(boolean otherPlayer) {
      return otherPlayer;
    }

    private boolean avenge(boolean otherPlayer) {
      if(otherPlayer) {
        return true;
      }
      else {
        return false;
      }
    }

    public void changeScore(int change) {
      score += change;
    }

    public int getScore() {
      return score;
    }

    public boolean getMove() {
      return move;
    }
  }
}
