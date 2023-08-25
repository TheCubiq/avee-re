package com.daaw;

import android.graphics.RectF;
import java.util.Random;
/* loaded from: classes.dex */
public class t5 implements pc0 {
    public Random a = new Random();
    public float b = 0.0f;
    public float c = 1.0f;
    public bs1 d = new bs1(0.0f, 0.0f);
    public boolean e = true;
    public boolean f = false;

    public t5() {
        r(270.0f);
    }

    @Override // com.daaw.zc0
    public void a(un unVar) {
        t(unVar.n("verticalOrientation", false));
        this.e = unVar.n("useRandomVectorInstead", true);
        r(unVar.o("vectorAngle", 270.0f));
        s(unVar.o("vectorAngleZ", 1.0f));
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
        ds1Var2.c = 0.0f;
        if (this.f) {
            ds1Var.a = rectF.centerX();
            ds1Var.b = rectF.top + (rectF.height() * nextFloat);
        } else {
            ds1Var.a = rectF.left + (rectF.width() * nextFloat);
            ds1Var.b = rectF.centerY();
        }
        ds1Var.c = 0.0f;
        if (this.e) {
            float nextFloat2 = this.a.nextFloat();
            float nextFloat3 = this.a.nextFloat();
            ds1Var2.a = (nextFloat2 * 2.0f) - 1.0f;
            ds1Var2.b = (nextFloat3 * 2.0f) - 1.0f;
        } else {
            bs1 bs1Var = this.d;
            ds1Var2.a = bs1Var.a;
            ds1Var2.b = bs1Var.b;
        }
        if (z) {
            float abs = 1.0f - Math.abs(this.c);
            ds1Var2.a *= abs;
            ds1Var2.b *= abs;
            ds1Var2.c = this.c;
            ds1Var2.c();
        }
    }

    @Override // com.daaw.zc0
    public void o(un unVar) {
        unVar.L("verticalOrientation", q(), "misc");
        unVar.L("useRandomVectorInstead", this.e, "misc");
        unVar.O("vectorAngle", c(), "misc", 0.0f, 360.0f);
        unVar.O("vectorAngleZ", j(), "misc", -1.0f, 1.0f);
    }

    public boolean q() {
        return this.f;
    }

    public t5 r(float f) {
        this.b = f;
        this.d = bs1.h(f);
        return this;
    }

    public t5 s(float f) {
        this.c = f;
        return this;
    }

    public t5 t(boolean z) {
        this.f = z;
        return this;
    }
}
