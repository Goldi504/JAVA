// public class Compression {
//     public static String compress(String str){
//         String neString = " ";
//         for(int i=0; i<str.length()-1; && str.charAt(i) == str.charAt(i+1)){
//             count++;
//             i++;
//         }
//         neString += str.charAt(i);
//         if(count>1){
//             neString += count.toString();
//         }
//     }
//     return neString;
//     public static void main(String[] args) {
//         String str = "aaabbccdd";
//         System.out.println(compress(str));
//     }
    
// }

public class Compression {
    public static String compress(String str) {
        String newString = "";
        
        for (int i = 0; i < str.length(); i++) {
            int count = 1;

            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            newString += str.charAt(i);
            if (count > 1) {
                newString += count;
            }
        }
        return newString;
    }

    public static void main(String[] args) {
        String str = "aaabbccdd";
        System.out.println(compress(str));
    }
}

