package com.daaw;

import com.google.android.exoplayer2.Format;
/* loaded from: classes.dex */
public final class ew1 implements zz {
    public static final e00 f = new a();
    public d00 a;
    public sm1 b;
    public fw1 c;
    public int d;
    public int e;

    /* loaded from: classes.dex */
    public static class a implements e00 {
        @Override // com.daaw.e00
        public zz[] a() {
            return new zz[]{new ew1()};
        }
    }

    @Override // com.daaw.zz
    public void a() {
    }

    @Override // com.daaw.zz
    public boolean c(a00 a00Var) {
        return gw1.a(a00Var) != null;
    }

    @Override // com.daaw.zz
    public int d(a00 a00Var, iy0 iy0Var) {
        if (this.c == null) {
            fw1 a2 = gw1.a(a00Var);
            this.c = a2;
            if (a2 == null) {
                throw new tv0("Unsupported or unrecognized wav header.");
            }
            this.b.d(Format.t(null, "audio/raw", null, a2.a(), 32768, this.c.f(), this.c.i(), this.c.d(), null, null, 0, null));
            this.d = this.c.c();
        }
        if (!this.c.j()) {
            gw1.b(a00Var, this.c);
            this.a.d(this.c);
        }
        int b = this.b.b(a00Var, 32768 - this.e, true);
        if (b != -1) {
            this.e += b;
        }
        int i = this.e / this.d;
        if (i > 0) {
            long b2 = this.c.b(a00Var.getPosition() - this.e);
            int i2 = i * this.d;
            int i3 = this.e - i2;
            this.e = i3;
            this.b.a(b2, 1, i2, i3, null);
        }
        return b == -1 ? -1 : 0;
    }

    @Override // com.daaw.zz
    public void f(long j, long j2) {
        this.e = 0;
    }

    @Override // com.daaw.zz
    public void i(d00 d00Var) {
        this.a = d00Var;
        this.b = d00Var.a(0, 1);
        this.c = null;
        d00Var.n();
    }
}
