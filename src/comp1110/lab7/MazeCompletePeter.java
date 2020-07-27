package comp1110.lab7;

import java.util.*;

/**
 * Lab material written by Josh Milthorpe.
 * Solution methods written by Peter Baker.
 */
public class MazeCompletePeter {
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
    MazeCompletePeter(List<Set<Integer>> neighbours) {
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
        List<Integer> pathFound = recursiveSearch(new HashSet<>(), start, Integer.MAX_VALUE, end);
        if (pathFound != null) {
            return pathFound;
        } else {
            return new ArrayList<>();
        }
    }

    /**
     * @param visitedPositions The positions visited so far (excluding current position)
     * @param currentPosition The current position of the search
     * @param currentShortest The shortest complete path found by a parent
     * @param end The end goal position
     * @return Path list of current prepended to children if strictly shorter path than current shortest, otherwise null.
     */
    private List<Integer> recursiveSearch(Set<Integer> visitedPositions, int currentPosition, int currentShortest, int end) {

        // Check end condition (at this point we are guaranteed to have found a shortest path because
        // the recursion is blocked before on the check below)
        if (currentPosition == end) {
            ArrayList<Integer> returnPath = new ArrayList<>();
            returnPath.add(end);
            return returnPath;
        }

        // Checking if we have exceeded (or equalled) the shortest path found so far (not worth exploring)
        // The best case scenario is that the next position we visit is the end, this path
        // would have a length of the visited + current + next
        if (visitedPositions.size() + 1 + 1 >= currentShortest) {
            return null;
        }

        // Initialize our best path search of the children
        List<Integer> bestPathFound = null;

        // For our children, don't return to the current position
        visitedPositions.add(currentPosition);

        // Still valid positions to search
        for (int neighbourPosition : neighbours.get(currentPosition)) {

            // Only traverse if we aren't looping back to a previously visited position
            if (!visitedPositions.contains(neighbourPosition)) {

                // Find the shortest path on this journey
                List<Integer> returnedPath = recursiveSearch(visitedPositions, neighbourPosition, currentShortest, end);
                if (returnedPath != null) {
                    // Update the shortest found and this path
                    currentShortest = returnedPath.size() + visitedPositions.size();
                    bestPathFound = returnedPath;
                }
            }
        }

        // When backtracking this position has not been explored
        visitedPositions.remove(currentPosition);

        // Did we find a shorter path? If so append it to visited and return it
        if (bestPathFound != null) {
            bestPathFound.add(0, currentPosition);
            return bestPathFound;
        } else {
            // No paths worth exploring found
            return null;
        }

    }

    /**
     * Search a maze for paths from position start to position end, and return
     * all shortest paths, or an empty list if there is no path.
     * For example, for
     */
    public Set<List<Integer>> findShortestPaths(int start, int end) {
        return recursiveSearchAll(new HashSet<>(), start, Integer.MAX_VALUE, end);
    }


    /**
     * @param visitedPositions Positions visited so far (excluding currentPosition)
     * @param currentPosition The current position of the search
     * @param currentShortest The shortest path found by any parent search
     * @param end The end goal position
     * @return A set of all paths which equal or beat the currentShortest path length (where each path is the
     *         current position prepended to the child's path)
     */
    private Set<List<Integer>> recursiveSearchAll(Set<Integer> visitedPositions, int currentPosition, int currentShortest, int end) {

        // Check end condition (at this point we are guaranteed to have found a shortest (or equal shortest) path because
        // the recursion is blocked before on the check below)
        if (currentPosition == end) {
            // Return this path as a unique element in a set
            ArrayList<Integer> returnPath = new ArrayList<>();
            returnPath.add(end);
            HashSet<List<Integer>> returnSet = new HashSet<>();
            returnSet.add(returnPath);
            return returnSet;
        }


        // Checking if we have exceeded the shortest path found so far (not worth exploring)
        // The best case scenario is that the next position we visit is the end, this path
        // would have a length of the visited + current + next
        if (visitedPositions.size() + 1 + 1 > currentShortest) {
            return new HashSet<>();
        }

        // Initialize our best path search of the children
        Set<List<Integer>> bestPathSetFound = new HashSet<>();

        // For our children, don't return to the current position
        visitedPositions.add(currentPosition);

        // Still valid positions to search
        for (int neighbourPosition : neighbours.get(currentPosition)) {

            // Only traverse if we aren't looping back to a previously visited position
            if (!visitedPositions.contains(neighbourPosition)) {

                // Find the shortest paths on this journey (all same length)
                Set<List<Integer>> returnedPathSet = recursiveSearchAll(visitedPositions, neighbourPosition, currentShortest, end);
                if (returnedPathSet.size() != 0) {
                    // Just pull one element out of set and set this as best length found
                    for (List<Integer> path : returnedPathSet) {
                        int pathLength = path.size() + visitedPositions.size();
                        if (pathLength < currentShortest) {
                            // If we have clearly beaten the shortest path,
                            // replace our path list with this one and update
                            currentShortest = pathLength;
                            bestPathSetFound = returnedPathSet;
                        } else {
                            // In this case, the shortest path must
                            // have been equalled, so we add these paths
                            // and don't need to update.
                            bestPathSetFound.addAll(returnedPathSet);
                        }
                        break;
                    }
                }
            }
        }

        // When backtracking this position has not been explored
        visitedPositions.remove(currentPosition);

        // To all shortest paths found (potentially empty), append the current position to the start
        for (List<Integer> pathFound : bestPathSetFound) {
            pathFound.add(0, currentPosition);
        }

        // Return this set.
        return bestPathSetFound;
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
