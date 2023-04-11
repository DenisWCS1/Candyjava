public class CandyCount {
    private static double money = 12.4;
    private static double price = 1.2;
    private static int candies = 0;

    public static void main(String[] args) {

        if (money > 0 && price > 0) {
            while ((money - price) >= 0) {
                candies++;
                money -= price;
            }
            System.out.println("candies " + candies);
        }
    }
}