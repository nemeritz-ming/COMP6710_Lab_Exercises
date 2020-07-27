package comp1110.lab7;

import java.util.*;

public class Maze {
    /* for each maze position, a set of all neighbouring positions */
    List<Set<Integer>> neighbours;

    /**
     * Create a maze given a list of neighbours for each position
     * in the maze. For each position, the list of neighbours
     * will contain the indices of all positions that are reachable in
     * a single step.
     *
     * @param neighbours a List containing, for each position in the maze,
     *                   the set of neighbouring positions
     */
    Maze(List<Set<Integer>> neighbours) {
        this.neighbours = neighbours;
    }

    /**
     * <pre>
     * Search a maze for paths from position start to position end, and return
     * the shortest such path, or an empty list if there is no path.
     *
     * A path is represented as a list of positions representing the nodes
     * that are traversed from the start to the end (inclusive).
     *
     * Consider a 2x2 maze.  In that case the points are numbered as
     * follows:
     *
     *     0 1
     *
     *     2 3
     *
     * Now, consider in a very trivial square maze:
     *
     *    +-+-+
     *    |0 1|
     *    + + +
     *    |2 3|
     *    +-+-+
     *
     * In this case each point is reachable by each vertical and horizontal
     * neighbour. The top left position (0) can reach its right (1) and
     * down (2) neighbours, position 1 can reach 0 and 3 and position 2
     * can also reach position 0 and 3. (3 cannot reach 0, 1 cannot reach 2.)
     * The neighbour array for that maze would look like:
     *     {{1,2}, {0,3}, {0,3}, {1,2}}
     * The array contains four elements, each of which is a list of neighbours
     * for the corresponding position in the maze, e.g. the first element
     * corresponds to the neighbours for position zero, the second element
     * corresponds to the neighbours for position one and so on.
     *
     * For this maze, findShortestPath(0, 3) would return [0,1,3] because
     * position 3 can be reached from 0 with two steps (0 -> 1 -> 3) and
     * also (0 -> 2 -> 3).
     *
     * For the same maze, findShortestPath(0, 1) would return [0,1] because
     * position 1 can be reached from 0 with one step (0 -> 1).
     * (It can also be reached in three steps (0 -> 2, 2 -> 3, 3 -> 1),
     * but this is not the shortest path.)
     *
     * @param start the starting position within the maze
     * @param end the ending position within the square maze
     * @return the shortest path from start to end, or an empty List if no such path exists
     */
    public List<Integer> findShortestPath(int start, int end) {
        // FIXME: complete this function
        return List.of(); // empty list
    }

    /**
     * Search a maze for paths from position start to position end, and return
     * all shortest paths, or an empty list if there is no path.
     * For example, for
     */
    public Set<List<Integer>> findShortestPaths(int start, int end) {
        // FIXME: complete this method
        return Set.of(); // empty set
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = (int) Math.sqrt(neighbours.size());

        sb.append("+--".repeat(size));
        sb.append("+").append(System.lineSeparator());

        for (int x = 0; x < size; x++) {
            sb.append("|");
            for (int y = 0; y < size; y++) {
                int node = x * size + y;
                sb.append(String.format("%2d", node));
                if (neighbours.get(node).contains(node + 1)) {
                    sb.append(" ");
                } else {
                    sb.append("|");
                }
            }
            sb.append(System.lineSeparator());
            for (int y = 0; y < size; y++) {
                int node = x * size + y;
                if (neighbours.get(node).contains((x + 1) * size + y)) {
                    sb.append("+  ");
                } else {
                    sb.append("+--");
                }
            }
            sb.append("+").append(System.lineSeparator());
        }
        return sb.toString();
    }
}
