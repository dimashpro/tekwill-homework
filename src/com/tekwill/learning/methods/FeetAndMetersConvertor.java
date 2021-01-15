package com.tekwill.learning.methods;

public class FeetAndMetersConvertor {

    public static final double METER_IN_A_FOOT = 0.305;
    public static final double FOOT_IN_A_METER = 3.279;

    public static double footToMeter(double foot) {
        return METER_IN_A_FOOT * foot;
    }

    public static double meterToFoot(double meter) {
        return FOOT_IN_A_METER * meter;
    }
}
