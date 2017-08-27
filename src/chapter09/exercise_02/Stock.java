package chapter09.exercise_02;

public class Stock {
    private String symbol, name;
    private double previousClosingPrice, currentPrice;

    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public double getChangePercent() {
        return Math.abs(100 - (currentPrice * 100 / previousClosingPrice));
    }
}
