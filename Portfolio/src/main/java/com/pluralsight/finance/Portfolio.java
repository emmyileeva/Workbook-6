package com.pluralsight.finance;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    private String name;
    private String owner;
    private List<Valuable> assets;

    public Portfolio (String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.assets = new ArrayList<>();
    }

    public void add(Valuable asset) {
        assets.add(asset);
    }

    public double getValue() {
        double total = 0;
        for (Valuable asset : assets) {
            total += asset.getValue();
        }
        return total;
    }

    public Valuable getMostValuable() {
        if (assets.isEmpty()) return null;

        Valuable max = assets.get(0);
        for (Valuable asset : assets) {
            if (asset.getValue() > max.getValue()) {
                max = asset;
            }
        }
        return max;
    }

    public Valuable getLeastValuable() {
        if (assets.isEmpty()) return null;

        Valuable min = assets.get(0);
        for (Valuable asset : assets) {
            if (asset.getValue() < min.getValue()) {
                min = asset;
            }
        }
        return min;
    }
}
