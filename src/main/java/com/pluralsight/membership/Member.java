package com.pluralsight.membership;

import java.math.BigDecimal;

public abstract class Member {
    private String memberName;
    private int months;
    private BigDecimal baseRate;

    public Member(String memberName, int months, BigDecimal baseRate) {
        this.memberName = memberName;
        this.months = months;
        this.baseRate = baseRate;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public BigDecimal getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(BigDecimal baseRate) {
        this.baseRate = baseRate;
    }

    public abstract BigDecimal getMonthlyPrice(BigDecimal baseRate);

    public BigDecimal getSignUpFee(){
        return BigDecimal.valueOf(49.00).setScale(2);
    }

    public BigDecimal getContractTotal(){
        return getMonthlyPrice(getBaseRate()).multiply(BigDecimal.valueOf(getMonths()))
                .add(getSignUpFee());
    }

    @Override
    public String toString() {
        return "Membership" + " | " + memberName + " | " + months + " months";
    }
}
