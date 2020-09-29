package comp1110.lab7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CropRotation {
    /**
     * Each Vegetable is assigned to one of four groups.
     */
    public enum Group {
        LEGUME, BRASSICA, ALLIUM, FRUITING
    }

    public static class Vegetable {
        String name;
        Group group;

        public Vegetable(String name, Group group) {
            this.name = name;
            this.group = group;
        }

        @Override
        public String toString() {
            return name + " (" + group.name().toLowerCase() + ")";
        }
    }

    /**
     * Get all valid crop rotations that can be composed from the provided
     * set of vegetable crops for the given number of seasons.
     * A crop rotation is a sequence of vegetable crops to plant.
     *
     * One crop is planted per season, and any crop may be planted at most once.
     * Crops must be planted in order of their Group according to the following
     * rules:
     * - a LEGUME may only be followed by a BRASSICA;
     * - a BRASSICA may only be followed by an ALLIUM;
     * - an ALLIUM may only be followed by a FRUITING crop; and
     * - a FRUITING crop may only be followed by a LEGUME.
     * <p>
     * For example, the call
     * getAllRotations([Tomato (fruiting), Onion (allium)], 2)
     * returns a set containing a single rotation:
     * - [Onion (allium), Tomato (fruiting)]
     * because an ALLIUM may only be followed by a fruiting crop.
     * <p>
     * The call
     * getAllRotations([Tomato (fruiting), Kale (brassica), Onion (allium), Pea (legume)], 4)
     * returns a set containing four rotations:
     * - [Kale (brassica), Onion (allium), Tomato (fruiting), Pea (legume)]
     * - [Onion (allium), Tomato (fruiting), Pea (legume), Kale (brassica)]
     * - [Pea (legume), Kale (brassica), Onion (allium), Tomato (fruiting)]
     * - [Tomato (fruiting), Pea (legume), Kale (brassica), Onion (allium)]
     * <p>
     * If no valid crop rotation can be found, an empty list is returned.
     * For example, the call:
     * getAllRotations([Tomato (fruiting), Gai Lan (brassica)], 2)
     * returns an empty set, because a FRUITING crop cannot be followed by
     * a BRASSICA, and a BRASSICA cannot be followed by a FRUITING crop.
     *
     * @param crops   the set of vegetable crops from which to construct a rotation
     * @param seasons the number of seasons
     * @return the set of all possible rotations of the provided crops for the
     * given number of seasons.  If there are no crops or no seasons or the number
     * of seasons is greater than the number of crops, return empty list.
     */
    public static Set<List<Vegetable>> getAllRotations(Set<Vegetable> crops, int seasons) {
        List<Vegetable> used = new ArrayList<>();          // vegetables used so far in a given search
        Set<List<Vegetable>> rotations = new HashSet<>();  // rotations found so far
        if (seasons > crops.size() || crops.isEmpty() || seasons == 0){
            return rotations;
        }
        getFixedRotation(crops, seasons, used, rotations);
        return rotations;

        /* If there are no crops or no seasons or the number of seasons is
           greater than the number of crops, return an empty list. */

        // FIXME complete this method
    }

    /**
     * Recursive method to find all rotations given a starting crop.
     *
     * @param crops as above
     * @param seasons as above
     * @param used crops already used (in the order in which they are used)
     * @param rotations all rotations found so far.
     */
    private static void getFixedRotation(Set<Vegetable> crops, int seasons, List<Vegetable> used,
                                         Set<List<Vegetable>> rotations) {
        if (seasons == 0){
            System.out.println(used);
            List<Vegetable> box = new ArrayList<>(used);
            rotations.add(box);
        }
        else{
            for(Vegetable k: crops){
                if (used.isEmpty()){
                    used.add(k);
                    getFixedRotation(crops,seasons-1,used,rotations);
                    used.remove(k);
                }
                else{
                    if (canFollow(used.get(used.size()-1), k) && !used.contains(k)){
                        used.add(k);
                        getFixedRotation(crops,seasons-1,used,rotations);
                        used.remove(k);
                    }
                }
            }
        }
        // FIXME complete this method
    }

    /**
     * Determine whether one vegetable can follow another
     *
     * @param first the first vegetable
     * @param next the next vegetable
     * @return true if next can follow first
     */
    private static boolean canFollow(Vegetable first, Vegetable next) {
        switch (first.group){
            case LEGUME:
                return next.group == Group.BRASSICA && !next.name.equals(first.name);
            case BRASSICA:
                return next.group == Group.ALLIUM && !next.name.equals(first.name);
            case ALLIUM:
                return next.group == Group.FRUITING && !next.name.equals(first.name);
            case FRUITING:
                return next.group == Group.LEGUME && !next.name.equals(first.name);
            default:
                return false;
        } // FIXME complete this method
    }

    public static void main(String[] args) {
        Set<Vegetable> box = new HashSet<>();
        box.add(new Vegetable("Eggplant", Group.FRUITING));
        box.add(new Vegetable("Pea", Group.LEGUME));
        box.add(new Vegetable("Onion", Group.ALLIUM));
        box.add(new Vegetable("Kale", Group.BRASSICA));
        List<Vegetable> used = new ArrayList<>();
        Set<List<Vegetable>> rotations = new HashSet<>();
        getFixedRotation(box,4,used,rotations);
        System.out.println(rotations);
    }
}