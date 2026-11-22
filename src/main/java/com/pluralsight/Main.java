package com.pluralsight;

import com.pluralsight.membership.Membership;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Gym Membership ===");

        Membership membership = new Membership("Henry Clark",3,new BigDecimal("30.00"));

        System.out.println(membership);
    }
}
