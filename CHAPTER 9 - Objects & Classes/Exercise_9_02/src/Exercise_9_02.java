public class Exercise_9_02 {
    public static void main(String[] args) {
        // Create new stock object
        Stock stock1 = new Stock("ORCL", "Oracle Corporation");
        // Set previous closing price
        stock1.setPreviousClosingPrice(34.5);
        // Set current closing price
        stock1.setCurrentPrice(34.35);
        // Display stock info
        System.out.println("Company: " + stock1.name);
        System.out.println("Symbol: " + stock1.symbol);
        System.out.println("Previous Closing Price: $" + stock1.getPreviousClosingPrice());
        System.out.println("Current Closing Price: $" + stock1.getCurrentPrice());
        System.out.printf("Price Percent Change: %5.2f%%", stock1.getChangePercent());
    }
}
// Stock class
class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;
    // no args constructor
    Stock() {
    }
    // stock constructor
    Stock(String newSymbol, String newName) {
        symbol = newSymbol;
        name = newName;
    }
    // percentage change method
    double getChangePercent() {
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }
    // getters
    double getPreviousClosingPrice() {
        return previousClosingPrice;
    }
    double getCurrentPrice() {
        return currentPrice;
    }
    // setters
    void setPreviousClosingPrice(double newPreviousClosingPrice) {
        previousClosingPrice = newPreviousClosingPrice;
    }
    void setCurrentPrice(double newCurrentPrice) {
        currentPrice =newCurrentPrice;
    }
}
