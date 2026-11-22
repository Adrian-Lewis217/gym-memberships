package com.pluralsight;

import com.pluralsight.membership.BasicMembership;
import com.pluralsight.membership.Membership;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Gym Membership ===");

        /*Membership membership = new Membership("Henry Clark",3,new BigDecimal("30.00"));

        System.out.println(membership);*/

        BasicMembership membership1 = new BasicMembership("Henry Clark",3
                ,new BigDecimal("30.00"),true);
        BasicMembership membership2 = new BasicMembership("Alice Johnson",6
                ,new BigDecimal("25.00"),false);
        BasicMembership membership3 = new BasicMembership("Bob Smith",2
                ,new BigDecimal("27.50"),true);

        System.out.println(membership1);
        System.out.println(membership1.getMonthlyPrice(membership1.getBaseRate()));
        System.out.println();
        System.out.println(membership2);
        System.out.println(membership2.getMonthlyPrice(membership2.getBaseRate()));
        System.out.println();
        System.out.println(membership3);
        System.out.println(membership3.getMonthlyPrice(membership3.getBaseRate()));
        System.out.println();
    }
}
