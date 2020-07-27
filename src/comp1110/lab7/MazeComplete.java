package comp1110.lab7;

import java.security.cert.CertificateRevokedException;
import java.util.*;

public class MazeComplete {
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
    MazeComplete(List<Set<Integer>> neighbours) {
        this.neighbours = neighbours;
        checkNeighboursSymmetrical();
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
        // FIXME: complete this method
        //return List.of();
        List<Integer> visited = new ArrayList<>();
        visited.add(start);
        Set<List<Integer>> allPaths = new HashSet<>();
        findShortestPaths(allPaths, start, end, visited);
        List<Integer> shortest = null;
        boolean multipleShortest = false;
        for (List<Integer> path : allPaths) {
            if (shortest == null || path.size() < shortest.size()) {
                shortest = path;
                multipleShortest = false;
            } else if (shortest.size() == path.size()) {
                multipleShortest = true;

            }
        }
        if (multipleShortest) {
            System.err.println("Found more than one path of length " + shortest.size() + " from " + start + " to " + end);
            System.err.println(this.toString());
        }
        /*
        List<Integer> shortest = findShorterPath(start, end, visited, null);
        */
        if (shortest == null) return List.of();
        else return shortest;
    }

    public Set<List<Integer>> findShortestPaths(int start, int end) {
        // FIXME: complete this method
        //return Set.of();
        Set<List<Integer>> allPaths = new HashSet<>();
        List<Integer> visited = new ArrayList<>();
        visited.add(start);
        findShortestPaths(allPaths, start, end, visited);
        List<Integer> best = null;
        boolean multipleShortest = false;
        for (List<Integer> path : allPaths) {
            if (best == null || path.size() < best.size()) {
                best = path;
                multipleShortest = false;
            } else if (best.size() == path.size()) {
                multipleShortest = true;
            }
        }
        /*
        if (multipleShortest) {
            System.err.println("Found more than one path of length " + best.size() + " from " + start + " to " + end);
            System.err.println(this.toString());
        }
         */
        Set<List<Integer>> shortest = new HashSet<>();
        for (List<Integer> path : allPaths) {
            if (path.size() == best.size()) {
                shortest.add(path);
            }
        }

        return shortest;
    }

    private List<Integer> findShorterPath(int start, int end, List<Integer> visited, List<Integer> best) {
        if (start == end) {
            return visited;
        }
        if (best != null && visited.size() >= best.size()) return null;
        if (neighbours.get(start) != null) {
            for (int n : neighbours.get(start)) {
                if (!visited.contains(n)) {
                    visited.add(n);
                    List<Integer> path = findShorterPath(n, end, visited, best);
                    if (path != null) best = List.copyOf(path);
                    visited.remove(visited.indexOf(n));
                }
            }
        }
        return best;
    }

    // FIXME remove for labs repository
    private void findShortestPaths(Set<List<Integer>> paths, int start, int end, List<Integer> visited) {
        if (start == end) {
            paths.add(List.copyOf(visited));
            return;
        }
        if (neighbours.get(start) != null) {
            for (int n : neighbours.get(start)) {
                if (!visited.contains(n)) {
                    visited.add(n);
                    findShortestPaths(paths, n, end, visited);
                    visited.remove(visited.indexOf(n));
                }
            }
        }
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

    public static int[][] createMaze(int size, Random random) {
        int[][] n = new int[size * size][4];
        for (int i = 0; i < size * size; i++) {
            Arrays.fill(n[i], -1);
        }
        for (int i = 0; i < size * size; i++) {
            if ((i / size != 0) && random.nextBoolean()) {
                n[i][0] = i - size;
                n[i - size][1] = i;
            }
            if ((i / size != size - 1) && random.nextBoolean()) {
                n[i][1] = i + size;
                n[i + size][0] = i;
            }
            if ((i % size != 0) && random.nextBoolean()) {
                n[i][2] = i - 1;
                n[i - 1][3] = i;
            }
            if ((i % size != size - 1) && random.nextBoolean()) {
                n[i][3] = i + 1;
                n[i + 1][2] = i;
            }
        }
        for (int i = 0; i < size * size; i++) {
            int l = 0;
            for (int j = 0; j < 4; j++) {
                if (n[i][j] != -1) l++;
            }
            if (l > 0) {
                if (l != 4) {
                    int[] tmp = new int[l];
                    int v = 0;
                    for (int j = 0; j < 4; j++) {
                        if (n[i][j] != -1) tmp[v++] = n[i][j];
                    }
                    n[i] = tmp;
                }
            } else {
                n[i] = null;
            }
        }

        return n;
    }

    public static void main(String[] args) {
        Random r = new Random(0);
        for (int i = 2; i < 8; i++) {
            int[][] n = createMaze(i, r);
            System.out.print("{");
            for (int j = 0; j < i * i; j++) {
                System.out.print("{");
                if (n[j] != null) {
                    for (int k = 0; k < n[j].length; k++) {
                        System.out.print(n[j][k] + ((k < n[j].length - 1) ? "," : ""));
                    }
                }
                System.out.print("}" + ((j < (i * i) - 1) ? ", " : ""));
            }
            System.out.println("}");
            System.out.print("{");
            for (int j = 0; j < 4; j++) {
                int s = r.nextInt(i * i);
                int e = r.nextInt(i * i);
                List<Set<Integer>> neighbours = new ArrayList<>();
                for (int[] neighboursForPosition : n) {
                    Set<Integer> neighboursSet = new HashSet<>();
                    if (neighboursForPosition != null) {
                        for (int node : neighboursForPosition) {
                            neighboursSet.add(node);
                        }
                    }
                    neighbours.add(neighboursSet);
                }
                MazeComplete maze = new MazeComplete(neighbours);
                Set<List<Integer>> paths = maze.findShortestPaths(s, e);
                System.out.print("{" + s + ", " + e + ", " + paths + "}" + ((j < 3) ? ", " : ""));
            }
            System.out.println("}");
        }
    }

    private void checkNeighboursSymmetrical() {
        int size = (int)Math.sqrt(neighbours.size());
        for (int firstNode = 0; firstNode < neighbours.size(); firstNode++) {
            int x = firstNode / size;
            int y = firstNode % size;
            Set<Integer> firstNodeNeighbours = neighbours.get(firstNode);
            for (Integer secondNode : firstNodeNeighbours) {
                if (!neighbours.get(secondNode).contains(firstNode)) {
                    throw new IllegalStateException("Neighbours list contains link: " + firstNode + " -> " + secondNode + ", but not the other direction!\n" + neighbours);
                }
                int x2 = secondNode / size;
                int y2 = secondNode % size;
                if (Math.abs(x2-x) > 1 || Math.abs(y2-y) > 1) {
                    System.err.println("Found illegal connection between " + firstNode + " and " + secondNode);
                }
            }
        }
    }
}
