package com.daaw;

import java.io.EOFException;
/* loaded from: classes.dex */
public final class tt0 {

    /* renamed from: l */
    public static final int f28045l = sq1.m9994v("OggS");

    /* renamed from: a */
    public int f28046a;

    /* renamed from: b */
    public int f28047b;

    /* renamed from: c */
    public long f28048c;

    /* renamed from: d */
    public long f28049d;

    /* renamed from: e */
    public long f28050e;

    /* renamed from: f */
    public long f28051f;

    /* renamed from: g */
    public int f28052g;

    /* renamed from: h */
    public int f28053h;

    /* renamed from: i */
    public int f28054i;

    /* renamed from: j */
    public final int[] f28055j = new int[255];

    /* renamed from: k */
    public final rv0 f28056k = new rv0(255);

    /* renamed from: a */
    public boolean m8830a(a00 a00Var, boolean z) {
        this.f28056k.m10925F();
        m8829b();
        if (!(a00Var.mo5859h() == -1 || a00Var.mo5859h() - a00Var.mo5862e() >= 27) || !a00Var.mo5863d(this.f28056k.f25637a, 0, 27, true)) {
            if (z) {
                return false;
            }
            throw new EOFException();
        } else if (this.f28056k.m10894z() != f28045l) {
            if (z) {
                return false;
            }
            throw new tv0("expected OggS capture pattern at begin of page");
        } else {
            int m10896x = this.f28056k.m10896x();
            this.f28046a = m10896x;
            if (m10896x != 0) {
                if (z) {
                    return false;
                }
                throw new tv0("unsupported bit stream revision");
            }
            this.f28047b = this.f28056k.m10896x();
            this.f28048c = this.f28056k.m10907m();
            this.f28049d = this.f28056k.m10906n();
            this.f28050e = this.f28056k.m10906n();
            this.f28051f = this.f28056k.m10906n();
            int m10896x2 = this.f28056k.m10896x();
            this.f28052g = m10896x2;
            this.f28053h = m10896x2 + 27;
            this.f28056k.m10925F();
            a00Var.mo5856k(this.f28056k.f25637a, 0, this.f28052g);
            for (int i = 0; i < this.f28052g; i++) {
                this.f28055j[i] = this.f28056k.m10896x();
                this.f28054i += this.f28055j[i];
            }
            return true;
        }
    }

    /* renamed from: b */
    public void m8829b() {
        this.f28046a = 0;
        this.f28047b = 0;
        this.f28048c = 0L;
        this.f28049d = 0L;
        this.f28050e = 0L;
        this.f28051f = 0L;
        this.f28052g = 0;
        this.f28053h = 0;
        this.f28054i = 0;
    }
}
