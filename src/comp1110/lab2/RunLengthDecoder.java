package comp1110.lab2;


/**
 * The following program has a bug somewhere in it. Please read through
 * the lab activity in README for instructions on how to proceed.
 * */
public class RunLengthDecoder {

    public static void main(String[] args) {
        String test_input = "0312010213";
        String output = decode(test_input);
        System.out.println(output);
    }

    // Given a run length encoded binary string sequence,
    // provide the decoded string
    public static String decode(String sequence) {
        return intToString(concatenate(groupedIntegers(stringToInteger(sequence))));
    }

    // Converts a string to an array of integers
    private static int[] stringToInteger(String sequence) {
        int[] output = new int[sequence.length()];
        int index = 0;
        for (char char_in_sequence : sequence.toCharArray()) {
            output[index] = Integer.parseInt("" + char_in_sequence);
            index++;
        }
        return output;
    }

    // Converts a run length encoded sequence of integers to
    // groups of integers grouped based on repetitions for example
    // [0,3,1,0,1,2] -> [[0,0,0],[1],[0],[1,1]]
    private static int[][] groupedIntegers(int[] sequence) {
        // Determine number of groups required (number of 0 or 1 characters)
        int count = 0;
        for (int sequence_int : sequence) {
            if (sequence_int == 0 || sequence_int == 1) {
                count++;
            }
        }

        // Create groups
        int[][] output = new int[count][];
        int outer_index = 0;
        for (int inner_index = 0; inner_index < sequence.length; inner_index++) {
            int current = sequence[inner_index];
            // Action taken if the value is 0 or 1
            if (current == 0 || current == 1) {
                // If we aren't at end of sequence and the next value is not a zero
                // or 1 then we need a repeated group
                if (inner_index != sequence.length - 1 && sequence[inner_index + 1] > 1) {
                    output[outer_index] = repeatInt(current, sequence[inner_index + 1]);
                    outer_index++;
                } else {
                    output[outer_index] = new int[]{current};
                    outer_index++;
                }
            } // otherwise ignore this value
        }
        return output;
    }

    // Concatenates/flattens an array of array of ints into an array of ints
    // preserving the natural depth first ordering
    private static int[] concatenate(int[][] grouped_sequence) {
        int total_length = 0;

        // Calculate the total length
        for (int outer_index = 0; outer_index < grouped_sequence.length; outer_index++) {
            total_length += grouped_sequence[outer_index].length;
        }

        // Proceed through the arrays depth first and place into output
        int[] output = new int[total_length];
        int output_index = 0;
        for (int outer_index = 0; outer_index < grouped_sequence.length; outer_index++) {
            for (int inner_index = 0; inner_index < grouped_sequence[outer_index].length; inner_index++) {
                output[output_index] = grouped_sequence[outer_index][inner_index];
            }
        }
        return output;
    }

    // Converts an array of integers into a string
    private static String intToString(int[] sequence) {
        StringBuilder outputBuilder = new StringBuilder();
        for (int i : sequence) {
            outputBuilder.append(i);
        }
        return outputBuilder.toString();
    }

    // Provides an array where the input int is repeated a given
    // number of times
    private static int[] repeatInt(int input_int, int repetitions) {
        int[] output = new int[repetitions];
        for (int i = 0; i < repetitions; i++) {
            output[i] = input_int;
        }
        return output;
    }
}

