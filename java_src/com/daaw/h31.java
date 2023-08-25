package com.daaw;

import com.daaw.da1;
import com.google.android.exoplayer2.Format;
import java.io.IOException;
/* loaded from: classes.dex */
public final class h31 implements InterfaceC3919zz {

    /* renamed from: i */
    public static final int f11987i = sq1.m9994v("RCC\u0001");

    /* renamed from: a */
    public final Format f11988a;

    /* renamed from: c */
    public sm1 f11990c;

    /* renamed from: e */
    public int f11992e;

    /* renamed from: f */
    public long f11993f;

    /* renamed from: g */
    public int f11994g;

    /* renamed from: h */
    public int f11995h;

    /* renamed from: b */
    public final rv0 f11989b = new rv0(9);

    /* renamed from: d */
    public int f11991d = 0;

    public h31(Format format) {
        this.f11988a = format;
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: a */
    public void mo1762a() {
    }

    /* renamed from: b */
    public final boolean m21058b(a00 a00Var) {
        this.f11989b.m10925F();
        if (a00Var.mo5864c(this.f11989b.f25637a, 0, 8, true)) {
            if (this.f11989b.m10911i() == f11987i) {
                this.f11992e = this.f11989b.m10896x();
                return true;
            }
            throw new IOException("Input not RawCC");
        }
        return false;
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: c */
    public boolean mo1761c(a00 a00Var) {
        this.f11989b.m10925F();
        a00Var.mo5856k(this.f11989b.f25637a, 0, 8);
        return this.f11989b.m10911i() == f11987i;
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: d */
    public int mo1760d(a00 a00Var, iy0 iy0Var) {
        while (true) {
            int i = this.f11991d;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        m21057e(a00Var);
                        this.f11991d = 1;
                        return 0;
                    }
                    throw new IllegalStateException();
                } else if (!m21056g(a00Var)) {
                    this.f11991d = 0;
                    return -1;
                } else {
                    this.f11991d = 2;
                }
            } else if (!m21058b(a00Var)) {
                return -1;
            } else {
                this.f11991d = 1;
            }
        }
    }

    /* renamed from: e */
    public final void m21057e(a00 a00Var) {
        while (this.f11994g > 0) {
            this.f11989b.m10925F();
            a00Var.mo5861f(this.f11989b.f25637a, 0, 3);
            this.f11990c.mo10157c(this.f11989b, 3);
            this.f11995h += 3;
            this.f11994g--;
        }
        int i = this.f11995h;
        if (i > 0) {
            this.f11990c.mo10159a(this.f11993f, 1, i, 0, null);
        }
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: f */
    public void mo1759f(long j, long j2) {
        this.f11991d = 0;
    }

    /* renamed from: g */
    public final boolean m21056g(a00 a00Var) {
        long m10903q;
        this.f11989b.m10925F();
        int i = this.f11992e;
        if (i == 0) {
            if (!a00Var.mo5864c(this.f11989b.f25637a, 0, 5, true)) {
                return false;
            }
            m10903q = (this.f11989b.m10894z() * 1000) / 45;
        } else if (i != 1) {
            throw new tv0("Unsupported version number: " + this.f11992e);
        } else if (!a00Var.mo5864c(this.f11989b.f25637a, 0, 9, true)) {
            return false;
        } else {
            m10903q = this.f11989b.m10903q();
        }
        this.f11993f = m10903q;
        this.f11994g = this.f11989b.m10896x();
        this.f11995h = 0;
        return true;
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: i */
    public void mo1758i(d00 d00Var) {
        d00Var.mo11475d(new da1.C1069b(-9223372036854775807L));
        this.f11990c = d00Var.mo11478a(0, 3);
        d00Var.mo11470n();
        this.f11990c.mo10156d(this.f11988a);
    }
}
