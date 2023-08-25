package com.daaw;

import android.graphics.RectF;
import java.util.Random;
/* loaded from: classes.dex */
public class v5 implements pc0 {
    public Random a = new Random();
    public float b = 0.0f;
    public float c = 1.0f;
    public ds1 d = new ds1(0.0f, 0.0f, 0.0f);
    public boolean e = false;
    public boolean f = false;

    public v5() {
        q(270.0f);
    }

    @Override // com.daaw.zc0
    public void a(un unVar) {
        this.f = unVar.n("use3dVectorInstead", this.f);
        this.e = unVar.n("useRandomVectorInstead", this.e);
        q(unVar.o("vectorAngle", c()));
        r(unVar.o("vectorAngleZ", j()));
    }

    public float c() {
        return this.b;
    }

    public float j() {
        return this.c;
    }

    @Override // com.daaw.pc0
    public void l(RectF rectF, ds1 ds1Var, ds1 ds1Var2, boolean z) {
        float nextFloat = this.a.nextFloat();
        float nextFloat2 = this.a.nextFloat();
        ds1Var.a = rectF.left + (rectF.width() * nextFloat);
        ds1Var.b = rectF.top + (rectF.height() * nextFloat2);
        ds1Var.c = 0.0f;
        ds1 ds1Var3 = this.d;
        ds1Var2.c = ds1Var3.c;
        if (this.f) {
            ds1Var2.a = (nextFloat * 2.0f) - 1.0f;
            ds1Var2.b = (nextFloat2 * 2.0f) - 1.0f;
        } else if (!this.e) {
            ds1Var2.a = ds1Var3.a;
            ds1Var2.b = ds1Var3.b;
        } else {
            float nextFloat3 = this.a.nextFloat();
            float nextFloat4 = this.a.nextFloat();
            ds1Var2.a = (nextFloat3 * 2.0f) - 1.0f;
            ds1Var2.b = (nextFloat4 * 2.0f) - 1.0f;
        }
    }

    @Override // com.daaw.zc0
    public void o(un unVar) {
        unVar.L("use3dVectorInstead", this.f, "misc");
        unVar.L("useRandomVectorInstead", this.e, "misc");
        unVar.O("vectorAngle", c(), "misc", 0.0f, 360.0f);
        unVar.O("vectorAngleZ", j(), "misc", -1.0f, 1.0f);
    }

    public v5 q(float f) {
        this.b = f;
        s();
        return this;
    }

    public v5 r(float f) {
        this.c = f;
        s();
        return this;
    }

    public final void s() {
        bs1 h = bs1.h(this.b);
        float abs = 1.0f - Math.abs(this.c);
        ds1 ds1Var = new ds1(h.a * abs, h.b * abs, this.c);
        this.d = ds1Var;
        ds1Var.c();
    }
}
