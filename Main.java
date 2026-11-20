import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        int currentYear = 2026;

        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {

            System.out.println(getInputFromScanner(currentYear));
        }

        public static String getInputFromScanner ( int currentYear){
            return "";
        }
        public static String getInputFromConsole ( int currentYear){

            return "";
        }
    }

        public static String getInputFromScanner ( int currentYear){

            Scanner sc = new Scanner(System.in);
            System.out.println("hi,What's your name?");
            String name = sc.nextLine();
            System.out.println("Hi " + name + ",thanks for taking the course!");
            return "";
        }
    }

