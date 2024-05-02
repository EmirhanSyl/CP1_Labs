
/**
 *
 * @author emirs
 */
public class quiz2 {

    public static void main(String[] args) {
        char[] letters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        String message = "TYYZGUDZYATZYPPCD";
        StringBuilder decryptedMessage = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            int letterIndex = -1;
            for (int j = 0; j < letters.length; j++) {
                if (message.charAt(i) == letters[j]) {
                    letterIndex = j;
                    break;
                }
            }

            if (letterIndex != -1) {
                letterIndex = (letterIndex - 11 + letters.length) % letters.length;
                decryptedMessage.append(letters[letterIndex]);
            } else {
                decryptedMessage.append(message.charAt(i));
            }
        }
        System.out.println(decryptedMessage);
    }
}
