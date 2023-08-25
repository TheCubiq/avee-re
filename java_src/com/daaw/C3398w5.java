package com.daaw;

import android.graphics.RectF;
import java.util.Random;
/* renamed from: com.daaw.w5 */
/* loaded from: classes.dex */
public class C3398w5 implements pc0 {

    /* renamed from: a */
    public Random f30887a = new Random();

    /* renamed from: b */
    public float f30888b = 0.0f;

    /* renamed from: c */
    public float f30889c = 1.0f;

    /* renamed from: d */
    public bs1 f30890d = new bs1(0.0f, 0.0f);

    /* renamed from: e */
    public boolean f30891e = false;

    /* renamed from: f */
    public boolean f30892f = false;

    public C3398w5() {
        m6528q(270.0f);
    }

    @Override // com.daaw.zc0
    /* renamed from: a */
    public void mo2493a(C3239un c3239un) {
        this.f30892f = c3239un.m7955n("vectorRelativeToCenter", false);
        this.f30891e = c3239un.m7955n("useRandomVectorInstead", false);
        m6528q(c3239un.m7953o("vectorAngle", 270.0f));
        m6527r(c3239un.m7953o("vectorAngleZ", 1.0f));
    }

    /* renamed from: c */
    public float m6530c() {
        return this.f30888b;
    }

    /* renamed from: j */
    public float m6529j() {
        return this.f30889c;
    }

    @Override // com.daaw.pc0
    /* renamed from: l */
    public void mo5526l(RectF rectF, ds1 ds1Var, ds1 ds1Var2, boolean z) {
        float nextFloat = this.f30887a.nextFloat();
        float nextFloat2 = this.f30887a.nextFloat();
        ds1Var.f7696a = rectF.left + (rectF.width() * nextFloat);
        ds1Var.f7697b = rectF.top + (rectF.height() * nextFloat2);
        ds1Var.f7698c = 0.0f;
        ds1Var2.f7698c = 0.0f;
        if (this.f30891e) {
            float nextFloat3 = this.f30887a.nextFloat();
            float nextFloat4 = this.f30887a.nextFloat();
            ds1Var2.f7696a = (nextFloat3 * 2.0f) - 1.0f;
            ds1Var2.f7697b = (nextFloat4 * 2.0f) - 1.0f;
        } else if (this.f30892f) {
            bs1.m25854i(ds1Var2, ((float) Math.toRadians(this.f30888b)) + bs1.m25853j((nextFloat * 2.0f) - 1.0f, (nextFloat2 * 2.0f) - 1.0f));
        } else {
            bs1 bs1Var = this.f30890d;
            ds1Var2.f7696a = bs1Var.f5090a;
            ds1Var2.f7697b = bs1Var.f5091b;
        }
        if (z) {
            float abs = 1.0f - Math.abs(this.f30889c);
            ds1Var2.f7696a *= abs;
            ds1Var2.f7697b *= abs;
            ds1Var2.f7698c = this.f30889c;
            ds1Var2.m24011c();
        }
    }

    @Override // com.daaw.zc0
    /* renamed from: o */
    public void mo2492o(C3239un c3239un) {
        c3239un.add_Checkbox("vectorRelativeToCenter", this.f30892f, "misc");
        c3239un.add_Checkbox("useRandomVectorInstead", this.f30891e, "misc");
        c3239un.m7990O("vectorAngle", m6530c(), "misc", 0.0f, 360.0f);
        c3239un.m7990O("vectorAngleZ", m6529j(), "misc", -1.0f, 1.0f);
    }

    /* renamed from: q */
    public C3398w5 m6528q(float f) {
        this.f30888b = f;
        this.f30890d = bs1.m25855h(f);
        return this;
    }

    /* renamed from: r */
    public C3398w5 m6527r(float f) {
        this.f30889c = f;
        return this;
    }
}
