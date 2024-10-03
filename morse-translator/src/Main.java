public class Main {
    public static void main(String[] args) {
        MorseDecoder decoder = new MorseDecoder();
        String morseCode = ".... . .-.. .-.. ---";
        String decodedMessage = decoder.fromMorse(morseCode);
        System.out.println(decodedMessage);
    }
}