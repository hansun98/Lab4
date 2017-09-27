/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */
/**
 * A class that Reclamation Project.
 */

public class ReclamationProject {
    /**
    * Complete the code for reclamation project.
    * @param a1 a string
    * @param b1 a string
    * @return r string
    */
    static String doit(final String a1, final String b1) {
        String a = a1;
        String b = b1;
        if (a.length() > b.length()) {
            String c = a;
            a = b;
            b = c;
            }
        String r;
        if (a.equals(b)) {
            r = "";
        } else {
            r = "";
        }
        /*
         * For loop with i
         */
        for (int i = 0; i < a.length(); i++) {
            for (int j = a.length() - i; j > 0; j--) {
                for (int k = 0; k < b.length() - j; k++) {
                    if (a.regionMatches(i, b, k, j) && j > r.length()) {
                        r = a.substring(i, i + j);
                    }
                 }
                }
        }
        return r;
        }

    /**
     * test doit.
     * @param args argument
     */
    public static void main(final String[] args) {
        System.out.print(doit("apple", "banana"));
    }
}
