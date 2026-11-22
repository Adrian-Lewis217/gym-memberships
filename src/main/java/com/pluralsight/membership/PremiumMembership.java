package com.pluralsight.membership;

import java.math.BigDecimal;

public class PremiumMembership extends Membership{
    private int guestPasses;

    public PremiumMembership(String memberName, int months, BigDecimal baseRate, int guestPasses) {
        super(memberName, months, baseRate);
        this.guestPasses = guestPasses;
    }

    public int getGuestPasses() {
        return guestPasses;
    }

    public void setGuestPasses(int guestPasses) {
        this.guestPasses = guestPasses;
    }

    public void useGuestPass(){
        if (guestPasses > 0){
            guestPasses -= 1;

            System.out.println(getMemberName() + " used a guest pass. Passes left: " + guestPasses);
        } else {
            System.out.println("Sorry, " + getMemberName() + " has no guest passes left.");
        }
    }

    @Override
    public BigDecimal getMonthlyPrice(BigDecimal baseRate) {
        baseRate = baseRate.add(new BigDecimal("18.50"));
        return baseRate;
    }

    @Override
    public String toString() {
        return getMemberName() + ", " + getMonths() + " months" + ", $" + getMonthlyPrice(getBaseRate()) + " per month";
    }
}
