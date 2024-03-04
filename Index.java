import java.util.Random;
import java.util.Scanner;

public class Index{
    public static int getRandomnumber(int MIN_NUMBER,int MAX_NUMBER){
        Random random=new Random();
        return random.ints(MIN_NUMBER,MAX_NUMBER).findFirst().getAsInt();
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("*************** NUMBER GUESSING GAME ***************\n");
        System.out.println("Hey What's your name?");
        String name=sc.nextLine();
        System.out.println("Hello "+name+"!");
        System.out.print("Welcome to the Number Guessing Game!\nI am thinking of a number between 1 and 100.\nGuess me the number "+name+"!");
        // int computer_guessnumber=getRandomnumber(1,101);
        
        int given_rounds=5;
        int given_attempts=5;
        int totalscore=0;

        for(int i=1;i<=given_rounds;i++){
            int computer_guessnumber=getRandomnumber(1,101);
            System.out.println("\n\n*********** Round"+i+" **********\n");
            int attempts=0;


            while(attempts<given_attempts){
            System.out.print("Take a Guess "+name+": ");
            Scanner sc2=new Scanner(System.in);
            int user_guessnumber=sc2.nextInt();
            attempts++;

            if(user_guessnumber==computer_guessnumber){
                int score=given_attempts-attempts;
                totalscore+=score;
                System.out.print("\nGuessed number is correct!\nHurrayy!! Your score of this round is: "+score);
                // System.out.println(" Your score of this round is: "+score);
                break;
            }else if(user_guessnumber<computer_guessnumber){
                System.out.println("The number is greater then your guessed number "+user_guessnumber+".");
            }else if(user_guessnumber>computer_guessnumber){
                System.out.println("The number is smaller then your guessed number "+user_guessnumber+".");
            }
        }

            if(attempts==given_attempts){
             System.out.println("\nRound "+i+" is Over!");
             System.out.println("You have attempted the maximum number of attempts for this round.");
             System.out.println("The Random Guessed number is: "+computer_guessnumber);
             System.out.println("Your Score of this round is: 0");
            }


        }
        System.out.println("\n\n*************** GAME OVER ***************");
        System.out.println("Your Total Score is "+totalscore +"\nThankyou For Playing!!\nBye Bye!");

    }

}
























// public class Index{
//     private static final int MIN_RANGE = 1;
//     private static final int MAX_RANGE = 100;
//     private static final int MAX_ATTEMPTS = 3;
//     private static final int MAX_ROUNDS = 5;

//     public static void main(String[] args) {
//         Random random = new Random();
//         Scanner scanner = new Scanner(System.in);
//         int totalScore = 0;

//         System.out.println("NUMBER GUESSING GAME");
//         System.out.println("Total Number Of Rounds : 5");
//         System.out.println("Attempts To Guess Number In Each Round : 3\n");
//         for (int i = 1; i <= MAX_ROUNDS; i++) {
//             int number = random.nextInt(MAX_RANGE) + MIN_RANGE;
//             int attempts = 0;

//             System.out.printf("Round %d: Guess the number between %d and %d in %d attempts.\n", i, MIN_RANGE, MAX_RANGE,
//                     MAX_ATTEMPTS);
//             while (attempts < MAX_ATTEMPTS) {
//                 System.out.println("Enter your guess : ");
//                 int guess_number = scanner.nextInt();
//                 attempts = attempts + 1;

//                 if (guess_number == number) {
//                     int score = MAX_ATTEMPTS - attempts;
//                     totalScore = totalScore + score;
//                     System.out.printf("Hurray! Number Guessed Successfully. Attempts = %d. Round Score = %d\n",
//                             attempts, score);
//                     break;
//                 }

//                 else if (guess_number < number) {
//                     System.out.printf("The number is greater than %d. Attempts Left = %d.\n", guess_number,
//                             MAX_ATTEMPTS - attempts);
//                 }

//                 else if (guess_number > number) {
//                     System.out.printf("The number is less than %d. Attempts Left = %d.\n", guess_number,
//                             MAX_ATTEMPTS - attempts);
//                 }

//             }

//             if (attempts == MAX_ATTEMPTS) {
//                 System.out.printf("\nRound = %d\n", i);
//                 System.out.println("Attempts = 0");
//                 System.out.printf("The Random Number Is : %d\n\n", number);
//             }
//         }
//         System.out.printf("Game Over. Total Score = %d\n", totalScore);
//         scanner.close();
//     }
// }