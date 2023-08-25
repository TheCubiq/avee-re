package com.daaw;
/* loaded from: classes2.dex */
public class zz0 implements yr1 {

    /* renamed from: a */
    public boolean f35685a = false;

    /* renamed from: b */
    public boolean f35686b = false;

    /* renamed from: c */
    public q00 f35687c;

    /* renamed from: d */
    public final wz0 f35688d;

    public zz0(wz0 wz0Var) {
        this.f35688d = wz0Var;
    }

    /* renamed from: a */
    public final void m1757a() {
        if (this.f35685a) {
            throw new C1012cx("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f35685a = true;
    }

    /* renamed from: b */
    public void m1756b(q00 q00Var, boolean z) {
        this.f35685a = false;
        this.f35687c = q00Var;
        this.f35686b = z;
    }

    @Override // com.daaw.yr1
    /* renamed from: c */
    public yr1 mo1755c(String str) {
        m1757a();
        this.f35688d.m5696h(this.f35687c, str, this.f35686b);
        return this;
    }

    @Override // com.daaw.yr1
    /* renamed from: d */
    public yr1 mo1754d(boolean z) {
        m1757a();
        this.f35688d.m5690n(this.f35687c, z, this.f35686b);
        return this;
    }
}
