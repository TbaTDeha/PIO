package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.Rhymersfactory;

class RhymersDemo {

    public static void main(String[] args) {
        Rhymersfactory factory = new DefaultRhymersFactory();
        
        testRhymers(factory);
        
    }

    private static void method(DefaultCountingOutRhymer[] rhymers) {
        for (int i = 0; i < rhymers.length; i++) {
            while (!rhymers[i].callCheck())
                System.out.print(rhymers[i].countOut() + "  ");
            System.out.println();
        }
    }

    private static void method1(DefaultCountingOutRhymer[] rhymers) {
        System.out.println("total rejected is "
                + ((HanoiRhymer) rhymers[3]).reportRejected());
    }

    private static void method2(DefaultCountingOutRhymer[] rhymers) {
        java.util.Random rn = new java.util.Random();
        for (int i = 1; i < 15; i++)
            rhymers[3].countIn(rn.nextInt(20));
    }

    private static void method3(DefaultCountingOutRhymer[] rhymers) {
        for (int i = 1; i < 15; i++)
            for (int j = 0; j < 3; j++)
                rhymers[j].countIn(i);
    }

    private static void testRhymers(Rhymersfactory factory) {
        DefaultCountingOutRhymer[] rhymers = { factory.getStandardRhymer(), factory.getFalseRhymer(),
            factory.getFIFORhymer(), factory.getHanoiRhymer()};
        
        method3(rhymers);
        
        method2(rhymers);
        
        method(rhymers);
        
        method1(rhymers);
    }
    
}