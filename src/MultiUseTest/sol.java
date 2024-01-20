package MultiUseTest;

import java.util.Scanner;

public class sol {
    public static String writeAsYouSpeak(int n) {
        if (n <= 0) {
            return ""; // Return an empty string for non-positive input
        }

        String output = "1";

        for (int k = 1; k < n; k++) {
            String newOutput = "";
            int count = 1;

            for (int i = 0; i < output.length() - 1; i++) {
                if (output.charAt(i) == output.charAt(i + 1)) {
                    count++;
                } else {
                    newOutput += count + "" + output.charAt(i);
                    count = 1;
                }
            }

            newOutput += count + "" + output.charAt(output.length() - 1);
            output = newOutput;
        }

        return output;
    }
}

