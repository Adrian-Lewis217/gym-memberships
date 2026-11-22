package com.pluralsight.membership;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class FamilyMembership extends Membership{
    private int extraMembers;

    public FamilyMembership(String memberName, int months, BigDecimal baseRate, int extraMembers) {
        super(memberName, months, baseRate);
        this.extraMembers = extraMembers;
    }

    public int getExtraMembers() {
        return extraMembers;
    }

    public void setExtraMembers(int extraMembers) {
        this.extraMembers = extraMembers;
    }

    @Override
    public BigDecimal getMonthlyPrice(BigDecimal baseRate) {

        for (int i = 0; i < getExtraMembers(); i++) {
            baseRate = baseRate.add(BigDecimal.valueOf(12.50));
        }
        if (getExtraMembers() >= 3){
            baseRate = baseRate.multiply(BigDecimal.valueOf(0.90));
        }
        return baseRate.setScale(2, RoundingMode.HALF_UP);
    }

    @Override
    public String toString() {
        return "Family" + " | " + getMemberName() + " | " + getMonths() + " months" + " | extra members: "
                + getExtraMembers();
    }
}
