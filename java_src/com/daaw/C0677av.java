package com.daaw;
/* renamed from: com.daaw.av */
/* loaded from: classes.dex */
public class C0677av {
    /* renamed from: a */
    public static double m26964a(double d) {
        double d2 = d * d;
        double d3 = d2 * d * d;
        double log = (Math.log((1.562339d * d3) / ((11589.0930520225d + d2) * (544440.6704605728d + d2))) * 10.0d) / Math.log(10.0d);
        double d4 = 424.31867740600904d + d2;
        double d5 = d2 + 1.4869900140839997E8d;
        double log2 = log + ((Math.log((d3 * 2.242881E16d) / (((d4 * d4) * d5) * d5)) * 10.0d) / Math.log(10.0d));
        if (Double.isNaN(log2) || Double.isInfinite(log2)) {
            return 0.0d;
        }
        return log2;
    }

    /* renamed from: b */
    public static double m26963b(double d, double d2, double d3) {
        return (d + 1.0d) * (d3 / d2);
    }

    /* renamed from: c */
    public static double m26962c(double d) {
        double min = Math.min(d, 1000.0d);
        double d2 = min * min;
        return (((d2 * min) * min) * 1.4884E8d) / ((((424.36000000000007d + d2) * (1.4884E8d + d2)) * Math.sqrt(11599.29d + d2)) * Math.sqrt(d2 + 544496.4099999999d));
    }
}
