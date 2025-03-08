public static int getRandomNumber() {
    Random rand = new Random();
    return rand.nextInt(6) + 1;
}
