
public class Score {
    Pacman pacman = new Pacman();
    public static int hp = 17, score = 0;
    public int setHp() {
        return hp--;
    }
    public int setScore() {
        return score++;
    }
    public int getHp() {
        return hp;
    }
    public int getScore() {
        return score;
    }
}
