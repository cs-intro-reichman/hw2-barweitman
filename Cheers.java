public class Cheers {
        public static void main(String[] args) {
            String word = args[0];
            int number = Integer.parseInt(args[1]); 
            String letter = "AEFHILMNORSX";
            int num = word.length(); 
            for (int give = 0; give < num; give++) {
                String char1 = String.valueOf(word.charAt(give)); 
                if (letter.indexOf(char1.toUpperCase()) != -1) {
                    System.out.println("Give me an " + char1 + ": " + char1 + "!");
                } else {
                    System.out.println("Give me a  " + char1 + ": " + char1 + "!");
                }
            }
            System.out.println("What does that spell?");
            for (int i = 0; i < number; i++) {
                System.out.println(word + "!!!");
            }
        }
    }
    