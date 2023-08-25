package com.daaw;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
/* loaded from: classes.dex */
public class de implements fe {
    public final RectF a = new RectF();

    @Override // com.daaw.fe
    public ColorStateList a(ee eeVar) {
        return n(eeVar).f();
    }

    @Override // com.daaw.fe
    public void b(ee eeVar, float f) {
        n(eeVar).p(f);
        o(eeVar);
    }

    @Override // com.daaw.fe
    public float c(ee eeVar) {
        return n(eeVar).j();
    }

    @Override // com.daaw.fe
    public void d(ee eeVar, float f) {
        n(eeVar).q(f);
        o(eeVar);
    }

    @Override // com.daaw.fe
    public void e(ee eeVar, ColorStateList colorStateList) {
        n(eeVar).o(colorStateList);
    }

    @Override // com.daaw.fe
    public float f(ee eeVar) {
        return n(eeVar).g();
    }

    @Override // com.daaw.fe
    public float g(ee eeVar) {
        return n(eeVar).k();
    }

    @Override // com.daaw.fe
    public void i(ee eeVar) {
    }

    @Override // com.daaw.fe
    public float j(ee eeVar) {
        return n(eeVar).l();
    }

    @Override // com.daaw.fe
    public float k(ee eeVar) {
        return n(eeVar).i();
    }

    @Override // com.daaw.fe
    public void l(ee eeVar, float f) {
        n(eeVar).r(f);
    }

    @Override // com.daaw.fe
    public void m(ee eeVar) {
        n(eeVar).m(eeVar.c());
        o(eeVar);
    }

    public final i61 n(ee eeVar) {
        return (i61) eeVar.e();
    }

    public void o(ee eeVar) {
        Rect rect = new Rect();
        n(eeVar).h(rect);
        eeVar.b((int) Math.ceil(g(eeVar)), (int) Math.ceil(c(eeVar)));
        eeVar.a(rect.left, rect.top, rect.right, rect.bottom);
    }
}
