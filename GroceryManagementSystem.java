public class GroceryManagementSystem {

    public static void printInventory(String[] names, double[] prices, int[] stocks) {
        System.out.println("Inventory:");

        for (int i = 0; i < names.length; i++) {
            if (names[i] != null && !names[i].isEmpty()) {
                System.out.println("Item: " + names[i] + ", Price: $" + prices[i] + ", Stock: " + stocks[i]);
            }
        }
    }

    public static void main(String[] args) {
        // Main method implementation goes here
        String[] itemNames = new String[]{"produce", "dairy", "bakery", "meat", "beverages", "snacks", "frozen foods", "canned goods", "condiments", "cleaning supplies"};
        double[] itemPrices = new double[]{1.99, 2.99, 3.99, 4.99, 5.99, 6.99, 7.99, 8.99, 9.99, 10.99};
        int[] itemStocks = new int[10];

       
        
        printInventory(itemNames, itemPrices, itemStocks);
    }
}