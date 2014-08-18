package interview;

public class StringPermutation {

    /**
     * http://www.programmerinterview.com/index.php/recursion/permutations-of-a-
     * string/
     * 
     * @param args
     */
    void permute(String input) {
        int inputLength = input.length();
        boolean[] used = new boolean[inputLength];
        StringBuffer outputString = new StringBuffer();
        char[] in = input.toCharArray();

        doPermute(in, outputString, used, inputLength, 0);

    }

    void doPermute(char[] in, StringBuffer outputString, boolean[] used, int inputLength, int level) {
        
//        System.out.println(outputString.toString());
//        System.out.print("used: ");
//        for (boolean c : used) {
//            System.out.print(c + ",");
//        }
//        System.out.println();
//        
        
        if (level == inputLength) {
            System.out.println(outputString.toString());
            return;
        }

        for (int i = 0; i < inputLength; ++i) {
            if (used[i])
                continue;
            outputString.append(in[i]);
            used[i] = true;
            doPermute(in, outputString, used, inputLength, level + 1);
            used[i] = false;
            outputString.setLength(outputString.length() - 1);
        }
    }

    public static void main(String[] args) {
        StringPermutation sp = new StringPermutation();
        sp.permute("abc");
    }

}
