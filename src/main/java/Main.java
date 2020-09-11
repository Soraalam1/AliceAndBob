import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {
    public static void AliceAndBob(){
        System.out.println("Please type in your name:");
        boolean AliceOrBob = false;
        String Alice = "Alice";
        String Bob = "Bob";


        while(AliceOrBob == false){
            Scanner scanner = new Scanner(System.in);
            String userName = scanner.nextLine();
            if(userName.equalsIgnoreCase(Alice))
            {
                System.out.println("Welcome to the party, Alice!");
                AliceOrBob = true;
            }
            if(userName.equalsIgnoreCase(Bob))
            {
                System.out.println("We've been expecting you, Bob!");
                AliceOrBob = true;
            }
            else{
                System.out.println("You're not who we are looking for.");
            }

        }
    }

    public static void main(String[] args ){
        AliceAndBob();
    }
}
