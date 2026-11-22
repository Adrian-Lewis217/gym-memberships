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

    @Override
    public BigDecimal getMonthlyPrice(BigDecimal baseRate) {
        if (isOffPeakOnly()){
            baseRate = baseRate.subtract(new BigDecimal("5.00"));
        }
        return baseRate;
    }

    @Override
    public String toString() {
        return getMemberName() + ", " + getMonths() + " months" + ", $" + getMonthlyPrice(getBaseRate()) + " per month";
    }
}
