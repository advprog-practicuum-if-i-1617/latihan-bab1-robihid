
public class Pacman {

    public static int x = 1, y = 1;
    public int maze[][] = {{1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
    {1, 2, 0, 0, 0, 0, 0, 3, 3, 1},
    {1, 1, 0, 0, 0, 1, 1, 1, 1, 1},
    {1, 0, 0, 0, 3, 0, 0, 0, 1, 1},
    {1, 1, 0, 0, 3, 0, 0, 0, 0, 1},
    {1, 0, 0, 0, 0, 0, 0, 1, 1, 1},
    {1, 1, 0, 0, 0, 0, 0, 1, 1, 1},
    {1, 0, 0, 0, 0, 0, 1, 1, 1, 1},
    {1, 1, 1, 0, 0, 0, 0, 0, 0, 1},
    {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}};

    public int setPosition(String p) {
        if (p.equals("w")) {
            if (maze[x - 1][y] != 1) {
                return x--;
            } else {
                return x;
            }
        } else if (p.equals("a")) {
            if (maze[x][y - 1] != 1) {
                return y--;
            } else {
                return y;
            }
        } else if (p.equals("s")) {
            if (maze[x + 1][y] != 1) {
                return x++;
            } else {
                return x;
            }
        } else if (p.equals("d")) {
            if (maze[x][y + 1] != 1) {
                return y++;
            } else {
                return y;
            }
        } else {
            return x;
        }
    }

    public void delete() {
        if (maze[x][y] == 2) {
            maze[x][y] = 0;
        }
    }

    public void move() {
        Score score = new Score();
        if (maze[x][y] == 3) {
            score.setScore();
        }
        maze[x][y] = 2;
    }

    public void setMaze() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (maze[i][j] == 1) {
                    System.out.print("#");
                } else if (maze[i][j] == 2) {
                    System.out.print("c");
                } else if (maze[i][j] == 3) {
                    System.out.print("@");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}