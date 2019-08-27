package duplicateencoder;

public class Encoder {

    public String encode(String str) {
        if (str.isEmpty()) {
            return "";
        }
        String encoded = "";
        for (String character: str.split("")) {
            encoded += isDuplicate(character, str) ? ")" : "(";
        }
        return encoded;
    }

    private boolean isDuplicate(String character, String str) {
        return str.indexOf(character) != str.lastIndexOf(character);
    }
}
