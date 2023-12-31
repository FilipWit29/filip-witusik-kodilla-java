package com.kodilla.patterns.strategy.predictors;

public final class ConservativePredictor implements BuyPredictor {

    @Override
    public String predictWhatToBuy() {
        return "[Conservative Predictor] Buy debentures of XYZ";
    }
}
