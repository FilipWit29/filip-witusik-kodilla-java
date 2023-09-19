package com.kodilla.stream.sand;

import java.math.BigDecimal;

public final class Africa implements SandStorage {
    @Override
    public BigDecimal getSandBeanQuantity() {
        BigDecimal sandQuantity = new BigDecimal("99999999999999231231");
        return sandQuantity;
    }
}
