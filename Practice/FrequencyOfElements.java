package Practice;

public class FrequencyOfElements {

    static char findMaximumOccuredElement(String str) {
        int[] freq = new int[256];

        // store frequency in freq array.
        for (int i = 0; i < str.length(); i++) {
            freq[(int) str.charAt(i)]++;
        }

        // Print how much time an element occured.
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + " ocurs " + freq[i] + " times.");
            }
        }


        // For finding maximum frequent element
        int maxFreq = freq[0];
        char maxChar = (char) freq[0];
        
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                maxChar = (char) i;
            }
        }
        return maxChar;
    }

    public static void main(String[] args) {
        String str = "yyttttttttttfhhhjyy44556566";

        System.out.println("Maximum Occured character: " + findMaximumOccuredElement(str));
    }

}
