import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;


public class AnalyseInput {
    public static char analyseInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the line we are supposed to read:");
        String line = scanner.nextLine();

        Queue<Character> queue = new LinkedList<>();
        boolean foundColon = false;
        int colonIndex = -1;

        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ':') {
                foundColon = true;
                colonIndex = i;
                break;
            }
            queue.add(line.charAt(i));
        }
        if (!foundColon) {
            return 'N';
        }

        StringBuilder leftPart = new StringBuilder();
        while (!queue.isEmpty()) {
            leftPart.append(queue.poll());
        }

        String rightPart = line.substring(colonIndex + 1);

        if (leftPart.toString().equals(rightPart)) {
            return 'S';
        } else if (leftPart.length() > rightPart.length()) {
            return 'L';
        } else if (leftPart.length() < rightPart.length()) {
            return 'R';
        } else {
            return 'D';
        }
    }


}