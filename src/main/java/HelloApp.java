public class HelloApp {
    public static void main(String[] args) {
        if (args.length > 0) {
            // Join all command-line arguments with space
            String names = String.join(" ", args);
            System.out.println("Hello " + names);
        } else {
            // Default message if no arguments provided
            System.out.println("Hello World");
        }
    }
}