package DynamicArray;

public class CountCharFrequency {
    private char[] inputChars;

    // Parameterized constructor
    public CountCharFrequency(char[] inputChars) {
        this.inputChars = inputChars;
    }

    // Method to count and display character frequency
    public void showCharFrequency() {
        // Create a frequency array to store the count of each character
        int[] charFrequency = new int[256]; // Assuming ASCII characters

        // Count the frequency of each character
        for (char ch : inputChars) {
            charFrequency[ch]++;
        }

        // Display the character frequency
        for (int i = 0; i < charFrequency.length; i++) {
            if (charFrequency[i] > 0) {
                System.out.print((char) i + "" + charFrequency[i]);
            }
        }

        System.out.println(); // Move to the next line after displaying frequencies
    }

    public static void main(String[] args) {
        // Example usage
        char[] inputArray = {'a', 'b', 'c', 'd', 'a', 'b', 'c', 'd', 'a', 'b', 'c', 'd'};
        CountCharFrequency counter = new CountCharFrequency(inputArray);

        System.out.println("Input: " + new String(inputArray));
        System.out.print("Output: ");
        counter.showCharFrequency();
}
}