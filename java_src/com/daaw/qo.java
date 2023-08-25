package com.daaw;
/* loaded from: classes2.dex */
public class qo extends ml {
    public float a = -1.0f;

    @Override // com.daaw.ml
    public void a(ic1 ic1Var, float f, float f2, float f3) {
        ic1Var.o(0.0f, f3 * f2, 180.0f, 180.0f - f);
        double sin = Math.sin(Math.toRadians(f));
        double d = f3;
        Double.isNaN(d);
        double d2 = f2;
        Double.isNaN(d2);
        double sin2 = Math.sin(Math.toRadians(90.0f - f));
        Double.isNaN(d);
        Double.isNaN(d2);
        ic1Var.m((float) (sin * d * d2), (float) (sin2 * d * d2));
    }
}
