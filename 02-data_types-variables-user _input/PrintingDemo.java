public class PrintingDemo {

    public static void main(String[] args) {

        // Using println (prints and moves to next line)
        System.out.println("Hello, Java!");
        System.out.println("Welcome to Core Java basics.");

        // Using print (stays on same line)
        System.out.print("This is ");
        System.out.print("printed on ");
        System.out.println("the same line.");

        // Escape characters
        System.out.println("\nNew line using \\n");
        System.out.println("Tab space example:\tJava");

        // Simple formatting
        String name = "Prateek";
        int age = 22;

        System.out.println("\nMy name is " + name + " and I am " + age + " years old.");
    }
}