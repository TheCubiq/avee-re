package com.daaw;
/* renamed from: com.daaw.a */
/* loaded from: classes.dex */
public abstract class AbstractC0559a implements ae0 {

    /* renamed from: a */
    public float f2652a = 1.0f;

    /* renamed from: b */
    public float f2653b = 0.0f;

    /* renamed from: c */
    public float f2654c = 0.0f;

    /* renamed from: d */
    public float f2655d = 0.0f;

    /* renamed from: e */
    public float f2656e;

    @Override // com.daaw.zc0
    /* renamed from: a */
    public void mo2493a(C3239un c3239un) {
        this.f2652a = c3239un.m7953o("Speed", 100.0f);
        this.f2653b = c3239un.m7953o("speedRandom", 60.0f);
        this.f2655d = c3239un.m7953o("trailLength", 0.0f);
    }

    @Override // com.daaw.ae0
    /* renamed from: b */
    public float mo27516b() {
        return this.f2655d;
    }

    /* renamed from: c */
    public void m27787c(float f) {
        this.f2652a = f;
    }

    /* renamed from: j */
    public void m27786j(float f) {
        this.f2653b = f;
    }

    @Override // com.daaw.zc0
    /* renamed from: o */
    public void mo2492o(C3239un c3239un) {
        c3239un.m7990O("Speed", this.f2652a, "behaviour", -300.0f, 300.0f);
        c3239un.m7990O("speedRandom", this.f2653b, "behaviour", -300.0f, 300.0f);
        c3239un.m7990O("trailLength", this.f2655d, "appearance", 0.0f, 1.0f);
    }

    /* renamed from: q */
    public void m27785q(float f) {
        this.f2655d = f;
    }
}
