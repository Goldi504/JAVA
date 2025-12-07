public class uppercase {

    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder();
        
        // Convert first character
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        // Convert next characters
        for(int i = 1; i < str.length(); i++) {
            if(str.charAt(i - 1) == ' ') {
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "hi i m goldi";
        System.out.println(toUpperCase(str));
    }
}
