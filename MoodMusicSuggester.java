// Project by Twisha Aggarwal
import java.util.Scanner;

public class MoodMusicSuggester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Greeting
        System.out.println("Hello, I'm your Mood-Based Music Buddy!");
        System.out.print("How are you feeling today? (happy/sad/angry/tired/lonely): ");
        String mood = sc.nextLine().toLowerCase();

        System.out.println("\nBased on your mood, here's something for you:");

        switch (mood) {
            case "happy":
                System.out.println("Song: 'Happy' by Pharrell Williams");
                System.out.println("Quote: 'Happiness is contagious. Spread it!'");
                break;
            case "sad":
                System.out.println("Song: 'Someone Like You' by Adele");
                System.out.println("Quote: 'It’s okay to not be okay. You’ll get through it.'");
                break;
            case "angry":
                System.out.println("Song: 'Lose Yourself' by Eminem");
                System.out.println("Quote: 'Breathe. Let go. And remind yourself you’re in control.'");
                break;
            case "tired":
                System.out.println("Song: 'Fix You' by Coldplay");
                System.out.println("Quote: 'Rest if you must, but don’t quit.'");
                break;
            case "lonely":
                System.out.println("Song: 'Someone You Loved' by Lewis Capaldi");
                System.out.println("Quote: 'You are never really alone. You're just between meaningful connections.'");
                break;
            default:
                System.out.println("Sorry, I don't recognize that mood—but I still hope you have a great day!");
        }

        System.out.println("\nThank you for using the Mood Music Buddy!");
    }
}
