package com.kodilla.patterns.strategy.predictors;

public final class AggressivePredictor implements BuyPredictor {

    @Override
    public String predictWhatToBuy() {
        return "[Aggressive Predictor] Buy stock of XYZ";
    }
}
