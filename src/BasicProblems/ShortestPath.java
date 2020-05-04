package BasicProblems;

//Shortest Path between source to destination Breadth First Search

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ShortestPath {
    static class Queuecell {
        int x, y, jumps;

        public Queuecell(int x, int y, int jumps) {
            this.x = x;
            this.y = y;
            this.jumps = jumps;
        }
    }

    public static boolean IsInside(int x, int y, int n) {
        if (x >= 0 && y >= 0 && x <= n - 1 && y <= n - 1) {
            return true;
        }
        return false;
    }

    public static int MLTE(int[] sp, int[] ep, int n) {
        int dx[] = {-2, -1, 1, 2, -2, -1, 1, 2};
        int dy[] = {-1, -2, -2, -1, 1, 2, 2, 1};
        boolean visit[][] = new boolean[n][n];
        for (boolean[] row : visit) {
            Arrays.fill(row, false);
        }
        ArrayList<Queuecell> queueList = new ArrayList<>();
        Queuecell queuecell = new Queuecell(sp[0], sp[1], 0);
        queueList.add(queuecell);
        visit[sp[0]][sp[1]] = true;
        Queuecell object;
        while (!queueList.isEmpty()) {
            int nx, ny;
            object = queueList.get(0);
            queueList.remove(0);
            if (object.x == ep[0] && object.y == ep[1])
                return object.jumps;
            for (int i = 0; i < 8; i++) {
                nx = object.x + dx[i];
                ny = object.y + dy[i];
                if (IsInside(nx, ny, n) && !visit[nx][ny]) {
                    queueList.add(new Queuecell(nx, ny, object.jumps + 1));
                    visit[nx][ny] = true;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp[] = {n - 1, 0};
        int ed[] = {0, n - 1};
        int k = MLTE(sp, ed, n);
        System.out.println(k);
    }
}
