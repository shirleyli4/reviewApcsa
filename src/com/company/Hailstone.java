
package com.company;

public class Hailstone {


    /**
     * Returns the length of a hailstone sequence that starts with n,
     * as described in part (a).
     * Precondition: n > 0
     */
    /*
    3n+1
     */

    public static int hailstoneLength(int n) {
        /* to be implemented in part (a) */

        if (n == 1) {
            return 1;
        } else {
            int len = 1;
            while (n > 1) {
                if (n % 2 != 0) {
                    n = 3 * n + 1;
                    len++;
                } else {
                    n /= 2;
                    len++;
                }
            }
            return len;
        }
    }

        /** Returns true if the hailstone sequence that starts with n is considered long
         * and false otherwise, as described in part (b).
         * Precondition: n > 0
         */
        public static boolean isLongSeq(int n){
            /* to be implemented in part (b) */

            boolean ret = false;
            int length = hailstoneLength(n);
            if (length > n) {
                ret = true;
            }
            return ret;
        }


        /** Returns the proportion of the first n hailstone sequences that are considered long,
         * as described in part (c).
         * Precondition: n > 0
         */

        public static double propLong(int n){
            /* to be implemented in part (c) */

            double numLong = 0;
            for (int i = 1; i <= n; i++) {
                if (isLongSeq(i)) {
                    numLong++;
                }
            }
            double ret = numLong / n;
            return ret;
        }

        // There may be instance variables, constructors, and methods not shown.

    }






