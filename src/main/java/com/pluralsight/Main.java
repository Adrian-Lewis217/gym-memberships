package com.pluralsight;

import com.pluralsight.membership.*;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Gym Memberships ===");
        ArrayList<Membership> memberships = new ArrayList<>();
        /*Membership membership = new Membership("Henry Clark",3,new BigDecimal("30.00"));

        System.out.println(membership);*/

        // Objects for Members
        // java: com.pluralsight.membership.Membership is abstract; cannot be instantiated
        /*Membership membership1 = new Membership("Henry Clark",3
                ,new BigDecimal("30.00"));*/
        BasicMembership membership2 = new BasicMembership("Alice Johnson",6
                ,new BigDecimal("30.00"),true);
        BasicMembership membership3 = new BasicMembership("Bob Smith",2
                ,new BigDecimal("27.50"),false);
        PremiumMembership membership4 = new PremiumMembership("Carol White",12
                ,new BigDecimal("30.00"),2);
        PremiumMembership membership5 = new PremiumMembership("Frank Miller",3
                ,new BigDecimal("30.00"),0);
        FamilyMembership membership6 = new FamilyMembership("Grace Lee",12
                ,new BigDecimal("30.00"),3);
        FamilyMembership membership7 = new FamilyMembership ("Emma Wilson",6
                ,new BigDecimal("30.00"),1);
        /*
        // Display memberships
        System.out.println(membership1);
        System.out.println(membership2);
        System.out.println(membership3);
        System.out.println(membership4);
        System.out.println(membership5);
        System.out.println(membership6);
        System.out.println(membership7);
        System.out.println("--- Guest passes ---");
        //
        membership4.useGuestPass();
        membership4.useGuestPass();
        membership4.useGuestPass();
        membership5.useGuestPass();
        System.out.println("--- Sign-up fee and contract total ---");
        // Displays Fee and Total for member
        System.out.println(membership1.getMemberName() +": Fee $" + membership1.getSignUpFee()
                +", Total $" + membership1.getContractTotal());

        System.out.println(membership4.getMemberName() +": Fee $" + membership4.getSignUpFee()
                +", Total $" + membership4.getContractTotal());

        System.out.println(membership5.getMemberName() +": Fee $" + membership5.getSignUpFee()
                +", Total $" + membership5.getContractTotal());

        System.out.println(membership6.getMemberName() +": Fee $" + membership6.getSignUpFee()
                +", Total $" + membership6.getContractTotal());
*/
        // add all memberships to list
        //memberships.add(membership1);
        memberships.add(membership2);
        memberships.add(membership3);
        memberships.add(membership4);
        memberships.add(membership5);
        memberships.add(membership6);
        memberships.add(membership7);

        // print the list
        printCosts(memberships);
    }
    public static void printCosts(ArrayList<Membership> members){
        BigDecimal monthlyIncome = BigDecimal.ZERO;
        BigDecimal allContracts = BigDecimal.ZERO;

        for (Membership member : members) {
            System.out.println(member);

            System.out.println("  Monthly Price: $" + member.getMonthlyPrice(member.getBaseRate()) +", Sign-Up Fee: $" + member.getSignUpFee()
                    +", Contract Total: $" + member.getContractTotal());

            monthlyIncome = monthlyIncome.add(member.getMonthlyPrice(member.getBaseRate()));
            allContracts = allContracts.add(member.getContractTotal());
        }
        System.out.println("--- Totals ---");
        System.out.println("Memberships: " + members.size());
        System.out.println("Monthly income: " + monthlyIncome);
        System.out.println("All contracts: " + allContracts);
        System.out.println("--- Front desk notes ---");

        for (Membership member : members) {
            if (member instanceof BasicMembership && ((BasicMembership) member).isOffPeakOnly()){
                System.out.println(member.getMemberName() + ": entry between 10:00 and 16:00 only");
            } else if (member instanceof PremiumMembership) {
                ((PremiumMembership) member).useGuestPass();
                /*System.out.println(member.getMemberName() + " used a guest pass. Passes left: " + ((PremiumMembership) member).getGuestPasses());*/
            } else if (member instanceof FamilyMembership) {
                int keyCards = ((FamilyMembership) member).getExtraMembers() + 1;
                System.out.println(member.getMemberName() + ": print " + keyCards + " key cards");
            }
        }

        // print the kinds for each membership
        System.out.println("--- Kinds ---");
        for (Membership member : members) {
            System.out.println(member.getMemberName() + ": " + member.getClass().getSimpleName());
        }

    }
}
