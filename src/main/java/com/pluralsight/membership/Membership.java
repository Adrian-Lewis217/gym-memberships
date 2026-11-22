package com.pluralsight.membership;

import java.math.BigDecimal;

public class Membership extends Member{

    public Membership(String memberName, int months, BigDecimal baseRate) {
        super(memberName, months, baseRate);
    }

    public BigDecimal getMonthlyPrice(BigDecimal baseRate){
        return baseRate;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
