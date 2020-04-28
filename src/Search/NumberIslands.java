package Search;

/**
 * Created by edieye on 2020-04-25.
 */



/** 200. Number of Islands **/

public class NumberIslands {

    public int numIslands(char[][] grid) {
        int islands = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length;j++) {
                if (grid[i][j] == '1') {
                    islands++;
                    sink(grid, i, j);
                }
            }
        }
        return islands;
    }

    public void sink(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        sink(grid,i+1, j);
        sink(grid,  i-1, j);
        sink(grid,  i, j-1);
        sink(grid, i, j+1);
    }
    /*public int numIslands(char[][] grid) {
        ArrayDeque<Point> points =  new ArrayDeque<>();
        int islands = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    islands++;
                    points.add(new Point(i, j));
                }
                while (!points.isEmpty()) {
                    Point p = points.poll();
                    grid[p.i][p.j] = '9';
                    if (p.i - 1  >= 0 && grid[p.i - 1][p.j] == '1') points.add(new Point(p.i - 1, p.j));
                    if (p.i + 1  <= grid.length && grid[p.i + 1][p.j] == '1') points.add(new Point(p.i + 1, p.j));
                    if (p.j - 1 >= 0 && grid[p.i][p.j - 1] == '1') points.add(new Point(p.i, p.j - 1));
                    if (p.j + 1 <= grid[0].length && grid[p.i][p.j + 1] == '1') points.add(new Point(p.i, p.j + 1));
                }
            }
        }
        return islands;
    }

    private class Point {
        int i;
        int j;

        Point(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }*/

    public static void main(String[] args) {
        NumberIslands obj = new NumberIslands();
        char[][] test = {{'1','1','1','1','0'}, {'1','1','0','1','0'},
                {'1','1','0','0','0'}, {'0','0','0','0','0'}};
        char[][] test1 = {{'1','1','0','0','0'}, {'1','1','0','0','0'},
                {'0','0','1','0','0'}, {'0','0','0','1','1'}};
        //[["1","1","0","0","0"],["1","1","0","0","0"],["0","0","1","0","0"],["0","0","0","1","1"]
        System.out.println(obj.numIslands(test)); //1
        System.out.println(obj.numIslands(test1));


    }
}
