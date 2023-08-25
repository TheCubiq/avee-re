package com.daaw;

import android.graphics.RectF;
import java.util.Random;
/* renamed from: com.daaw.t5 */
/* loaded from: classes.dex */
public class C3013t5 implements pc0 {

    /* renamed from: a */
    public Random f27003a = new Random();

    /* renamed from: b */
    public float f27004b = 0.0f;

    /* renamed from: c */
    public float f27005c = 1.0f;

    /* renamed from: d */
    public bs1 f27006d = new bs1(0.0f, 0.0f);

    /* renamed from: e */
    public boolean f27007e = true;

    /* renamed from: f */
    public boolean f27008f = false;

    public C3013t5() {
        m9523r(270.0f);
    }

    @Override // com.daaw.zc0
    /* renamed from: a */
    public void mo2493a(C3239un c3239un) {
        m9521t(c3239un.m7955n("verticalOrientation", false));
        this.f27007e = c3239un.m7955n("useRandomVectorInstead", true);
        m9523r(c3239un.m7953o("vectorAngle", 270.0f));
        m9522s(c3239un.m7953o("vectorAngleZ", 1.0f));
    }

    /* renamed from: c */
    public float m9526c() {
        return this.f27004b;
    }

    /* renamed from: j */
    public float m9525j() {
        return this.f27005c;
    }

    @Override // com.daaw.pc0
    /* renamed from: l */
    public void mo5526l(RectF rectF, ds1 ds1Var, ds1 ds1Var2, boolean z) {
        float nextFloat = this.f27003a.nextFloat();
        ds1Var2.f7698c = 0.0f;
        if (this.f27008f) {
            ds1Var.f7696a = rectF.centerX();
            ds1Var.f7697b = rectF.top + (rectF.height() * nextFloat);
        } else {
            ds1Var.f7696a = rectF.left + (rectF.width() * nextFloat);
            ds1Var.f7697b = rectF.centerY();
        }
        ds1Var.f7698c = 0.0f;
        if (this.f27007e) {
            float nextFloat2 = this.f27003a.nextFloat();
            float nextFloat3 = this.f27003a.nextFloat();
            ds1Var2.f7696a = (nextFloat2 * 2.0f) - 1.0f;
            ds1Var2.f7697b = (nextFloat3 * 2.0f) - 1.0f;
        } else {
            bs1 bs1Var = this.f27006d;
            ds1Var2.f7696a = bs1Var.f5090a;
            ds1Var2.f7697b = bs1Var.f5091b;
        }
        if (z) {
            float abs = 1.0f - Math.abs(this.f27005c);
            ds1Var2.f7696a *= abs;
            ds1Var2.f7697b *= abs;
            ds1Var2.f7698c = this.f27005c;
            ds1Var2.m24011c();
        }
    }

    @Override // com.daaw.zc0
    /* renamed from: o */
    public void mo2492o(C3239un c3239un) {
        c3239un.add_Checkbox("verticalOrientation", m9524q(), "misc");
        c3239un.add_Checkbox("useRandomVectorInstead", this.f27007e, "misc");
        c3239un.m7990O("vectorAngle", m9526c(), "misc", 0.0f, 360.0f);
        c3239un.m7990O("vectorAngleZ", m9525j(), "misc", -1.0f, 1.0f);
    }

    /* renamed from: q */
    public boolean m9524q() {
        return this.f27008f;
    }

    /* renamed from: r */
    public C3013t5 m9523r(float f) {
        this.f27004b = f;
        this.f27006d = bs1.m25855h(f);
        return this;
    }

    /* renamed from: s */
    public C3013t5 m9522s(float f) {
        this.f27005c = f;
        return this;
    }

    /* renamed from: t */
    public C3013t5 m9521t(boolean z) {
        this.f27008f = z;
        return this;
    }
}
