import java.util.HashMap;
import java.util.Map;

// 2024664001 강모민
public class MorseDecoder {
    private static final String[] morseAlphabet = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
    };

    private static final Map<String, Character> morseCodeMap = new HashMap<>();

    static {
        char letter = 'a';
        for (String morse : morseAlphabet) {
            morseCodeMap.put(morse, letter);
            letter++;
        }
    }

    public String fromMorse(String morseInput) {
        StringBuilder decodedText = new StringBuilder();
        String[] letters = morseInput.split(" ");
        for (String letter : letters) {
            if (letter.isEmpty()) {
                decodedText.append(" ");
            } else if (morseCodeMap.containsKey(letter)) {
                decodedText.append(morseCodeMap.get(letter));
            }
        }
        return decodedText.toString().trim();
    }
}
