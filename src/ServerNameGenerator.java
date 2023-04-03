import java.util.Random;

public class ServerNameGenerator {
    public static void main (String[] args){
        String server = Adjectives() + " " + Nouns();

        System.out.println("Your new server name is " + server);


    }
    private static String Adjectives() {
        String[] adjectives = {"Breezy", "Puzzling", "Luminous", "Spicy", "Jaded", "Cozy", "Thunderous", "Mysterious", "Blissful", "Scattered"};
        Random random = new Random();
        String randAdjective = null;
        for (int i = 0; i < adjectives.length; i++) {
            randAdjective = adjectives[random.nextInt(adjectives.length)];

        }
        return randAdjective;

    }
    private static String Nouns(){
        String [] nouns = {"book", "tree", "river", "dog", "computer", "mountain", "ocean", "phone", "music", "painting"};
        Random random = new Random();
        String randNoun = null;
        for (int i = 0; i < nouns.length; i++) {
            randNoun = nouns[random.nextInt(nouns.length)];


        }
        return randNoun;
    }
}
