package com.fanzs.aop;

public class MathCalculator {

    public MathCalculator() {
        System.out.println("MathCalculator constructor");
    }

    public int div(int i, int j) {
        System.out.println("com.fanzs.aop.MathCalculator.div");
        return i / j;
    }

    @LogAnnotation
    public int multi(int i, int j) {
        System.out.println("com.fanzs.aop.MathCalculator.multi");
        return i * j;
    }
}
