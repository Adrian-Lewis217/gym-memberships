package com.pluralsight;

import com.pluralsight.membership.BasicMembership;
import com.pluralsight.membership.Membership;
import com.pluralsight.membership.PremiumMembership;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Gym Membership ===");

        /*Membership membership = new Membership("Henry Clark",3,new BigDecimal("30.00"));

        System.out.println(membership);*/

        // Objects for Members
        BasicMembership membership1 = new BasicMembership("Henry Clark",3
                ,new BigDecimal("30.00"),false);
        BasicMembership membership2 = new BasicMembership("Alice Johnson",6
                ,new BigDecimal("30.00"),true);
        BasicMembership membership3 = new BasicMembership("Bob Smith",2
                ,new BigDecimal("27.50"),false);
        PremiumMembership membership4 = new PremiumMembership("Carol White",12
                ,new BigDecimal("30.00"),2);
        PremiumMembership membership5 = new PremiumMembership("Frank Miller",3
                ,new BigDecimal("30.00"),0);
        // ("Grace Lee",12,new BigDecimal("30.00"),3)
        // ("Emma Wilson",6,new BigDecimal("30.00"),1)

        // Display memberships
        System.out.println(membership1);
        System.out.println(membership2);
        System.out.println(membership3);
        System.out.println(membership4);
        System.out.println(membership5);
        System.out.println("--- Guest passes ---");
        membership4.useGuestPass();
        membership4.useGuestPass();
        membership4.useGuestPass();
        membership5.useGuestPass();

    }
}
