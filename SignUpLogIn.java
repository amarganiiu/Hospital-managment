import java.util.Scanner;
public class SignUpLogIn {
        private static String registeredUsername = null; // Stores the registered username
        private static String registeredPassword = null; // Stores the registered password

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.println("\n=== Hospital Management System ===");
                System.out.println("1. Sign Up");
                System.out.println("2. Log In");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();
                sc.nextLine(); // Clear the input buffer

                switch (choice) {
                    case 1 -> signUp(sc);
                    case 2 -> logIn(sc);
                    case 3 -> {
                        System.out.println("Goodbye!");
                        sc.close();
                        return;
                    }
                    default -> System.out.println("Invalid choice. Please try again.");
                }
            }
        }

        // Method for Sign-Up
        private static void signUp(Scanner sc) {
            if (registeredUsername != null) {
                System.out.println("A user is already registered. Please log in.");
                return;
            }

            System.out.println("\n--- Sign Up ---");
            System.out.print("Enter a username: ");
            registeredUsername = sc.nextLine();

            System.out.print("Enter a password: ");
            registeredPassword = sc.nextLine();

            System.out.println("Sign-Up successful! You can now log in.");
        }

        // Method for Log-In
        private static void logIn(Scanner scanner) {
            if (registeredUsername == null) {
                System.out.println("No user registered yet. Please sign up first.");
                return;
            }

            System.out.println("\n--- Log In ---");
            System.out.print("Enter your username: ");
            String inputUsername = scanner.nextLine();

            System.out.print("Enter your password: ");
            String inputPassword = scanner.nextLine();

            if (inputUsername.equals(registeredUsername) && inputPassword.equals(registeredPassword)) {
                System.out.println("Log-In successful! Welcome, " + registeredUsername + "!");
            } else {
                System.out.println("Invalid username or password. Please try again.");
            }
        }
    }

