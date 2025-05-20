package com.pluralsight.finance;

public abstract class FixedAsset implements Valuable {
    private String name;
    private double marketValue;

    public FixedAsset(String name, double value) {
        this.name = name;
        this.marketValue = value;
    }

    public double getMarketValue() {
        return marketValue;
    }

    @Override
    public double getValue() {
        return marketValue;
    }
}
