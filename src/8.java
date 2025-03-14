public class MyProject {
private static final int MAX_VALUE = 10;
private static final int MIN_VALUE = 5;
private static final Random RANDOM = new Random();

public static void main(String[] args) {
System.out.println("This is my project");
}

public static int getRandomValue() {
return RANDOM.nextInt(MAX_VALUE - MIN_VALUE + 1) + MIN_VALUE;
}

public static void setMaxValue(int maxValue) {
this.MAX_VALUE = maxValue;
}

public static void setMinValue(int minValue) {
this.MIN_VALUE = minValue;
}

public static int getMaxValue() {
return MAX_VALUE;
}

public static int getMinValue() {
return MIN_VALUE;
}
}