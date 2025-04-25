public class MyClass {
    public static void main(String[] args) {
        // Example of using arrays to store numbers
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;

        // Example of using a for loop to iterate over an array
        for (int i : array) {
            System.out.println(i);
        }

        // Example of using an if-else statement to check the contents of an array
        int size = array.length;
        boolean hasDuplicates = false;
        for (int i = 0; i < size - 1; i++) {
            if (array[i] == array[i + 1]) {
                hasDuplicates = true;
                break;
            }
        }

        // Example of using an if-else statement to check the contents of a string
        String str = "Hello, world!";
        if ("world!".equals(str)) {
            System.out.println("The string matches!");
        } else {
            System.out.println("The string does not match.");
        }
    }
}
