package com.pluralsight.membership;

import java.math.BigDecimal;

public class BasicMembership extends Membership{
    private boolean offPeakOnly = true;

    public boolean isOffPeakOnly() {
        return offPeakOnly;
    }

    public void setOffPeakOnly(boolean offPeakOnly) {
        this.offPeakOnly = offPeakOnly;
    }

    public BasicMembership(String memberName, int months, BigDecimal baseRate, boolean offPeakOnly) {
        super(memberName, months, baseRate);
        this.offPeakOnly = offPeakOnly;
    }

    public BasicMembership(String memberName, int months, BigDecimal baseRate) {
        super(memberName, months, baseRate);
    }

    @Override
    public BigDecimal getMonthlyPrice(BigDecimal baseRate) {
        if (isOffPeakOnly()){
            baseRate = baseRate.subtract(new BigDecimal("5.00"));
        }
        return baseRate;
    }

    @Override
    public String toString() {
        return "Basic" + " | " + getMemberName() + " | " + getMonths() + " months" + " | off-peak only: "
                + isOffPeakOnly();
    }
}
