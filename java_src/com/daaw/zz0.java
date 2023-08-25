package com.daaw;
/* loaded from: classes2.dex */
public class zz0 implements yr1 {
    public boolean a = false;
    public boolean b = false;
    public q00 c;
    public final wz0 d;

    public zz0(wz0 wz0Var) {
        this.d = wz0Var;
    }

    public final void a() {
        if (this.a) {
            throw new cx("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
    }

    public void b(q00 q00Var, boolean z) {
        this.a = false;
        this.c = q00Var;
        this.b = z;
    }

    @Override // com.daaw.yr1
    public yr1 c(String str) {
        a();
        this.d.h(this.c, str, this.b);
        return this;
    }

    @Override // com.daaw.yr1
    public yr1 d(boolean z) {
        a();
        this.d.n(this.c, z, this.b);
        return this;
    }
}
