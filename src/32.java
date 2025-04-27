public class MyClass {
    public static void main(String[] args) {
        // Example: Print "Hello, World!"
        System.out.println("Hello, World!");

        // Example: Check if a number is even or odd
        int num = 10;
        boolean isEven = num % 2 == 0 ? true : false;

        // Example: Print the current time in HH:mm format
        long currentTime = System.currentTimeMillis();
        String formattedTime = String.format("%02d:%02d", 
                                             (currentTime / 60) % 14, 
                                             (currentTime % 60));
        System.out.println(formattedTime);

        // Example: Create a simple class with two methods
        class Animal {
            void eat() {
                System.out.println(" eating ");
            }
            void sleep() {
                System.out.println(" sleeping ");
            }
        }

        // Create an instance of the class and call its methods
        Animal myAnimal = new Animal();
        myAnimal.eat();  // Calls the method "eat"
        myAnimal.sleep();  // Calls the method "sleep"

        // Example: Sort a list in ascending order using Java's Collections.sort() method
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);
        Collections.sort(numbers);  // Uses the compareTo() method to sort the list

        // Example: Print all even numbers from 1 to 10 (inclusive)
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // Example: Create a simple method that calculates the sum of two numbers
        double result = add(3, 4);  // This is a static method

        // Example: Read user input and perform some calculations using Java's Scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter another number: ");
        int num2 = scanner.nextInt();

        double sum = num1 + num2;
    }
}
