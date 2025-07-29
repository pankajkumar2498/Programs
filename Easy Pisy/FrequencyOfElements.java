public class FrequencyOfElements {

    // find the maximum occured element
    static char findMaxOccurredChar(String str) {
        int[] freq = new int[256]; // ASCII size

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            freq[(int) str.charAt(i)]++; // str.charAt(i) gives ASCII value
        }

        // Find the character with the maximum frequency
        // int maxFreq = 0;
        // char maxChar = ' ';
        char maxChar = str.charAt(0);
        int maxFreq = freq[maxChar];

        for (int i = 0; i < 256; i++) {
            if (freq[i] > maxFreq) {    // if freuency of element is more than maxFreq
                maxFreq = freq[i];      // store the freq in maxfreq
                maxChar = (char) i;     // store character to maxchar
            }
        }
        return maxChar;
    }

    // find the occurence of every element
    static void findOccurrance(String str) {
        int[] freq = new int[256]; // ASCII size

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            freq[(int) str.charAt(i)]++; // (int) str.charAt(i) gives ASCII value
        }

        // print every character comes how much times
        for (int i = 0; i < freq.length - 1; i++) {
            if (freq[i] > 0) { // check for frequency array for every element
                System.out.println((char) i + " occurs " + freq[i] + " times");
            }
        }
    }

    public static void main(String[] args) {
        String str = "2345433333333333334444";
        char maxChar = findMaxOccurredChar(str);
        System.out.println("Max occurred character: '" + maxChar + "'");
        findOccurrance(str);
    }

}
