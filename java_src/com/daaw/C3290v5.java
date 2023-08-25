package com.daaw;

import android.graphics.RectF;
import java.util.Random;
/* renamed from: com.daaw.v5 */
/* loaded from: classes.dex */
public class C3290v5 implements pc0 {

    /* renamed from: a */
    public Random f29869a = new Random();

    /* renamed from: b */
    public float f29870b = 0.0f;

    /* renamed from: c */
    public float f29871c = 1.0f;

    /* renamed from: d */
    public ds1 f29872d = new ds1(0.0f, 0.0f, 0.0f);

    /* renamed from: e */
    public boolean f29873e = false;

    /* renamed from: f */
    public boolean f29874f = false;

    public C3290v5() {
        m7453q(270.0f);
    }

    @Override // com.daaw.zc0
    /* renamed from: a */
    public void mo2493a(C3239un c3239un) {
        this.f29874f = c3239un.m7955n("use3dVectorInstead", this.f29874f);
        this.f29873e = c3239un.m7955n("useRandomVectorInstead", this.f29873e);
        m7453q(c3239un.m7953o("vectorAngle", m7455c()));
        m7452r(c3239un.m7953o("vectorAngleZ", m7454j()));
    }

    /* renamed from: c */
    public float m7455c() {
        return this.f29870b;
    }

    /* renamed from: j */
    public float m7454j() {
        return this.f29871c;
    }

    @Override // com.daaw.pc0
    /* renamed from: l */
    public void mo5526l(RectF rectF, ds1 ds1Var, ds1 ds1Var2, boolean z) {
        float nextFloat = this.f29869a.nextFloat();
        float nextFloat2 = this.f29869a.nextFloat();
        ds1Var.f7696a = rectF.left + (rectF.width() * nextFloat);
        ds1Var.f7697b = rectF.top + (rectF.height() * nextFloat2);
        ds1Var.f7698c = 0.0f;
        ds1 ds1Var3 = this.f29872d;
        ds1Var2.f7698c = ds1Var3.f7698c;
        if (this.f29874f) {
            ds1Var2.f7696a = (nextFloat * 2.0f) - 1.0f;
            ds1Var2.f7697b = (nextFloat2 * 2.0f) - 1.0f;
        } else if (!this.f29873e) {
            ds1Var2.f7696a = ds1Var3.f7696a;
            ds1Var2.f7697b = ds1Var3.f7697b;
        } else {
            float nextFloat3 = this.f29869a.nextFloat();
            float nextFloat4 = this.f29869a.nextFloat();
            ds1Var2.f7696a = (nextFloat3 * 2.0f) - 1.0f;
            ds1Var2.f7697b = (nextFloat4 * 2.0f) - 1.0f;
        }
    }

    @Override // com.daaw.zc0
    /* renamed from: o */
    public void mo2492o(C3239un c3239un) {
        c3239un.m7993L("use3dVectorInstead", this.f29874f, "misc");
        c3239un.m7993L("useRandomVectorInstead", this.f29873e, "misc");
        c3239un.m7990O("vectorAngle", m7455c(), "misc", 0.0f, 360.0f);
        c3239un.m7990O("vectorAngleZ", m7454j(), "misc", -1.0f, 1.0f);
    }

    /* renamed from: q */
    public C3290v5 m7453q(float f) {
        this.f29870b = f;
        m7451s();
        return this;
    }

    /* renamed from: r */
    public C3290v5 m7452r(float f) {
        this.f29871c = f;
        m7451s();
        return this;
    }

    /* renamed from: s */
    public final void m7451s() {
        bs1 m25855h = bs1.m25855h(this.f29870b);
        float abs = 1.0f - Math.abs(this.f29871c);
        ds1 ds1Var = new ds1(m25855h.f5090a * abs, m25855h.f5091b * abs, this.f29871c);
        this.f29872d = ds1Var;
        ds1Var.m24011c();
    }
}
