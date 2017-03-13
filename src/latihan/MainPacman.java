
import java.util.Scanner;
public class MainPacman {
    public static int x, y;
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        Pacman pacman = new Pacman();
        Score score = new Score();
        System.out.println("P A C M A N");
        System.out.println("============\n");
        pacman.setMaze();
        do {
            pacman.delete();
            System.out.print("type w/a/s/d to move : ");
            pacman.setPosition(masukan.next());
            score.setHp();
            pacman.move();
            System.out.println();
            pacman.setMaze();
            System.out.println("HP      : "+score.getHp());
            System.out.println("Score   : "+score.getScore());
            if (score.getScore()==4) {
                System.out.println("*YOU WIN*");
                break;
            }
        } while (score.hp != 0);
        if (score.getScore()!=4) System.out.println("*YOU LOSE*");
    }
}
