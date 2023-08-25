package com.daaw;
/* renamed from: com.daaw.qo */
/* loaded from: classes2.dex */
public class C2743qo extends C2193ml {

    /* renamed from: a */
    public float f24209a = -1.0f;

    @Override // com.daaw.C2193ml
    /* renamed from: a */
    public void mo12316a(ic1 ic1Var, float f, float f2, float f3) {
        ic1Var.m19967o(0.0f, f3 * f2, 180.0f, 180.0f - f);
        double sin = Math.sin(Math.toRadians(f));
        double d = f3;
        Double.isNaN(d);
        double d2 = f2;
        Double.isNaN(d2);
        double sin2 = Math.sin(Math.toRadians(90.0f - f));
        Double.isNaN(d);
        Double.isNaN(d2);
        ic1Var.m19969m((float) (sin * d * d2), (float) (sin2 * d * d2));
    }
}
