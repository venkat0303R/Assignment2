public class OddPosition {
	public static void main(String[] args) {
        String text = "type here to search";
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ' && i % 2 == 0) {
                res.append(text.charAt(i));
            }
        }

        System.out.println("Characters at odd positions (ignoring white spaces): " + res.toString());
    }

}