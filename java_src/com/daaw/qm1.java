package com.daaw;
/* loaded from: classes.dex */
public final class qm1 {

    /* renamed from: a */
    public C2749qr f24164a;

    /* renamed from: b */
    public long f24165b;

    /* renamed from: c */
    public long f24166c;

    /* renamed from: d */
    public long f24167d;

    /* renamed from: e */
    public int f24168e;

    /* renamed from: f */
    public int f24169f;

    /* renamed from: g */
    public long[] f24170g;

    /* renamed from: h */
    public int[] f24171h;

    /* renamed from: i */
    public int[] f24172i;

    /* renamed from: j */
    public int[] f24173j;

    /* renamed from: k */
    public long[] f24174k;

    /* renamed from: l */
    public boolean[] f24175l;

    /* renamed from: m */
    public boolean f24176m;

    /* renamed from: n */
    public boolean[] f24177n;

    /* renamed from: o */
    public pm1 f24178o;

    /* renamed from: p */
    public int f24179p;

    /* renamed from: q */
    public rv0 f24180q;

    /* renamed from: r */
    public boolean f24181r;

    /* renamed from: s */
    public long f24182s;

    /* renamed from: a */
    public void m12342a(a00 a00Var) {
        a00Var.mo5861f(this.f24180q.f25637a, 0, this.f24179p);
        this.f24180q.m10921J(0);
        this.f24181r = false;
    }

    /* renamed from: b */
    public void m12341b(rv0 rv0Var) {
        rv0Var.m10913g(this.f24180q.f25637a, 0, this.f24179p);
        this.f24180q.m10921J(0);
        this.f24181r = false;
    }

    /* renamed from: c */
    public long m12340c(int i) {
        return this.f24174k[i] + this.f24173j[i];
    }

    /* renamed from: d */
    public void m12339d(int i) {
        rv0 rv0Var = this.f24180q;
        if (rv0Var == null || rv0Var.m10916d() < i) {
            this.f24180q = new rv0(i);
        }
        this.f24179p = i;
        this.f24176m = true;
        this.f24181r = true;
    }

    /* renamed from: e */
    public void m12338e(int i, int i2) {
        this.f24168e = i;
        this.f24169f = i2;
        int[] iArr = this.f24171h;
        if (iArr == null || iArr.length < i) {
            this.f24170g = new long[i];
            this.f24171h = new int[i];
        }
        int[] iArr2 = this.f24172i;
        if (iArr2 == null || iArr2.length < i2) {
            int i3 = (i2 * x21.f31814L0) / 100;
            this.f24172i = new int[i3];
            this.f24173j = new int[i3];
            this.f24174k = new long[i3];
            this.f24175l = new boolean[i3];
            this.f24177n = new boolean[i3];
        }
    }

    /* renamed from: f */
    public void m12337f() {
        this.f24168e = 0;
        this.f24182s = 0L;
        this.f24176m = false;
        this.f24181r = false;
        this.f24178o = null;
    }
}
