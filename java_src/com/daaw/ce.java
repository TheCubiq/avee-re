package com.daaw;

import android.content.res.ColorStateList;
/* loaded from: classes.dex */
public class ce implements fe {
    @Override // com.daaw.fe
    public ColorStateList a(ee eeVar) {
        return n(eeVar).b();
    }

    @Override // com.daaw.fe
    public void b(ee eeVar, float f) {
        n(eeVar).h(f);
    }

    @Override // com.daaw.fe
    public float c(ee eeVar) {
        return f(eeVar) * 2.0f;
    }

    @Override // com.daaw.fe
    public void d(ee eeVar, float f) {
        n(eeVar).g(f, eeVar.d(), eeVar.c());
        o(eeVar);
    }

    @Override // com.daaw.fe
    public void e(ee eeVar, ColorStateList colorStateList) {
        n(eeVar).f(colorStateList);
    }

    @Override // com.daaw.fe
    public float f(ee eeVar) {
        return n(eeVar).d();
    }

    @Override // com.daaw.fe
    public float g(ee eeVar) {
        return f(eeVar) * 2.0f;
    }

    @Override // com.daaw.fe
    public void h() {
    }

    @Override // com.daaw.fe
    public void i(ee eeVar) {
        d(eeVar, k(eeVar));
    }

    @Override // com.daaw.fe
    public float j(ee eeVar) {
        return eeVar.f().getElevation();
    }

    @Override // com.daaw.fe
    public float k(ee eeVar) {
        return n(eeVar).c();
    }

    @Override // com.daaw.fe
    public void l(ee eeVar, float f) {
        eeVar.f().setElevation(f);
    }

    @Override // com.daaw.fe
    public void m(ee eeVar) {
        d(eeVar, k(eeVar));
    }

    public final h61 n(ee eeVar) {
        return (h61) eeVar.e();
    }

    public void o(ee eeVar) {
        if (!eeVar.d()) {
            eeVar.a(0, 0, 0, 0);
            return;
        }
        float k = k(eeVar);
        float f = f(eeVar);
        int ceil = (int) Math.ceil(i61.c(k, f, eeVar.c()));
        int ceil2 = (int) Math.ceil(i61.d(k, f, eeVar.c()));
        eeVar.a(ceil, ceil2, ceil, ceil2);
    }
}
