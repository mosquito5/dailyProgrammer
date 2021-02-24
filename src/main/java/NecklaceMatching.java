public class  NecklaceMatching {
    /**
     * Imagine a necklace with lettered beads that can slide along the string.
     * In this example, you could take the N off NICOLE and slide it around to the other end to make ICOLEN.
     * Do it again to get COLENI, and so on. For the purpose of today's challenge, we'll say that the strings "nicole",
     * "icolen", and "coleni" describe the same necklace.
     * Generally, two strings describe the same necklace if you can remove some number of letters from the beginning of one,
     * attach them to the end in their original ordering, and get the other string.
     * Reordering the letters in some other way does not, in general, produce a string that describes the same necklace.
     *
     * Write a function that returns whether two strings describe the same necklace.
     */
    public boolean same_necklace(String str1, String str2) {

        if (str1.length() != str2.length())
            return false;

        if (str1.equals(str2))
            return true;

        for (int i = 0; i < str1.length(); i++) {
            char first = str1.charAt(0);
            str1 = str1.substring(1) + first;
            if (str1.equals(str2))
                return true;
        }
        return false;
    }

    /**
     If you have a string of N letters and you move each letter one at a time from the start to the end,
     you'll eventually get back to the string you started with, after N steps.
     Sometimes, you'll see the same string you started with before N steps. For instance,
     if you start with "abcabcabc", you'll see the same string ("abcabcabc") 3 times over the course of moving a letter 9 times.

     Write a function that returns the number of times you encounter the same starting string if you move each letter in the string from the start to the end, one at a time.
     */
    public int repeats(String str) {
        String tmp = str;
        int count = 0;

        if (str.length() == 1 || str.length() == 0)
            return 1;

        for (int i = 0; i < str.length(); i++) {
            char first = tmp.charAt(0);
            tmp = tmp.substring(1) + first;
            if (tmp.equals(str))
                count++;
        }
        return count;
    }
}
