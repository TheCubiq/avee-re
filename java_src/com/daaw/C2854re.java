package com.daaw;

import com.daaw.C2716qj;
import java.util.ArrayList;
/* renamed from: com.daaw.re */
/* loaded from: classes.dex */
public class C2854re {

    /* renamed from: a */
    public C2716qj f25190a;

    /* renamed from: b */
    public C2716qj f25191b;

    /* renamed from: c */
    public C2716qj f25192c;

    /* renamed from: d */
    public C2716qj f25193d;

    /* renamed from: e */
    public C2716qj f25194e;

    /* renamed from: f */
    public C2716qj f25195f;

    /* renamed from: g */
    public C2716qj f25196g;

    /* renamed from: h */
    public ArrayList<C2716qj> f25197h;

    /* renamed from: i */
    public int f25198i;

    /* renamed from: j */
    public int f25199j;

    /* renamed from: k */
    public float f25200k = 0.0f;

    /* renamed from: l */
    public int f25201l;

    /* renamed from: m */
    public int f25202m;

    /* renamed from: n */
    public int f25203n;

    /* renamed from: o */
    public boolean f25204o;

    /* renamed from: p */
    public int f25205p;

    /* renamed from: q */
    public boolean f25206q;

    /* renamed from: r */
    public boolean f25207r;

    /* renamed from: s */
    public boolean f25208s;

    /* renamed from: t */
    public boolean f25209t;

    /* renamed from: u */
    public boolean f25210u;

    /* renamed from: v */
    public boolean f25211v;

    public C2854re(C2716qj c2716qj, int i, boolean z) {
        this.f25190a = c2716qj;
        this.f25205p = i;
        this.f25206q = z;
    }

    /* renamed from: c */
    public static boolean m11369c(C2716qj c2716qj, int i) {
        if (c2716qj.m12451M() != 8 && c2716qj.f24001M[i] == C2716qj.EnumC2718b.MATCH_CONSTRAINT) {
            int[] iArr = c2716qj.f24041n;
            if (iArr[i] == 0 || iArr[i] == 3) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void m11371a() {
        if (!this.f25211v) {
            m11370b();
        }
        this.f25211v = true;
    }

    /* renamed from: b */
    public final void m11370b() {
        int i = this.f25205p * 2;
        C2716qj c2716qj = this.f25190a;
        boolean z = true;
        this.f25204o = true;
        C2716qj c2716qj2 = c2716qj;
        boolean z2 = false;
        while (!z2) {
            this.f25198i++;
            C2716qj[] c2716qjArr = c2716qj.f24052s0;
            int i2 = this.f25205p;
            C2716qj c2716qj3 = null;
            c2716qjArr[i2] = null;
            c2716qj.f24050r0[i2] = null;
            if (c2716qj.m12451M() != 8) {
                this.f25201l++;
                C2716qj.EnumC2718b m12409q = c2716qj.m12409q(this.f25205p);
                C2716qj.EnumC2718b enumC2718b = C2716qj.EnumC2718b.MATCH_CONSTRAINT;
                if (m12409q != enumC2718b) {
                    this.f25202m += c2716qj.m12393y(this.f25205p);
                }
                int m16930b = this.f25202m + c2716qj.f23998J[i].m16930b();
                this.f25202m = m16930b;
                int i3 = i + 1;
                this.f25202m = m16930b + c2716qj.f23998J[i3].m16930b();
                int m16930b2 = this.f25203n + c2716qj.f23998J[i].m16930b();
                this.f25203n = m16930b2;
                this.f25203n = m16930b2 + c2716qj.f23998J[i3].m16930b();
                if (this.f25191b == null) {
                    this.f25191b = c2716qj;
                }
                this.f25193d = c2716qj;
                C2716qj.EnumC2718b[] enumC2718bArr = c2716qj.f24001M;
                int i4 = this.f25205p;
                if (enumC2718bArr[i4] == enumC2718b) {
                    int[] iArr = c2716qj.f24041n;
                    if (iArr[i4] == 0 || iArr[i4] == 3 || iArr[i4] == 2) {
                        this.f25199j++;
                        float[] fArr = c2716qj.f24048q0;
                        float f = fArr[i4];
                        if (f > 0.0f) {
                            this.f25200k += fArr[i4];
                        }
                        if (m11369c(c2716qj, i4)) {
                            if (f < 0.0f) {
                                this.f25207r = true;
                            } else {
                                this.f25208s = true;
                            }
                            if (this.f25197h == null) {
                                this.f25197h = new ArrayList<>();
                            }
                            this.f25197h.add(c2716qj);
                        }
                        if (this.f25195f == null) {
                            this.f25195f = c2716qj;
                        }
                        C2716qj c2716qj4 = this.f25196g;
                        if (c2716qj4 != null) {
                            c2716qj4.f24050r0[this.f25205p] = c2716qj;
                        }
                        this.f25196g = c2716qj;
                    }
                    if (this.f25205p != 0 ? !(c2716qj.f24039m == 0 && c2716qj.f24049r == 0 && c2716qj.f24051s == 0) : !(c2716qj.f24037l == 0 && c2716qj.f24043o == 0 && c2716qj.f24045p == 0)) {
                        this.f25204o = false;
                    }
                    if (c2716qj.f24005Q != 0.0f) {
                        this.f25204o = false;
                        this.f25210u = true;
                    }
                }
            }
            if (c2716qj2 != c2716qj) {
                c2716qj2.f24052s0[this.f25205p] = c2716qj;
            }
            C2041lj c2041lj = c2716qj.f23998J[i + 1].f17433d;
            if (c2041lj != null) {
                C2716qj c2716qj5 = c2041lj.f17431b;
                C2041lj[] c2041ljArr = c2716qj5.f23998J;
                if (c2041ljArr[i].f17433d != null && c2041ljArr[i].f17433d.f17431b == c2716qj) {
                    c2716qj3 = c2716qj5;
                }
            }
            if (c2716qj3 == null) {
                c2716qj3 = c2716qj;
                z2 = true;
            }
            c2716qj2 = c2716qj;
            c2716qj = c2716qj3;
        }
        C2716qj c2716qj6 = this.f25191b;
        if (c2716qj6 != null) {
            this.f25202m -= c2716qj6.f23998J[i].m16930b();
        }
        C2716qj c2716qj7 = this.f25193d;
        if (c2716qj7 != null) {
            this.f25202m -= c2716qj7.f23998J[i + 1].m16930b();
        }
        this.f25192c = c2716qj;
        if (this.f25205p == 0 && this.f25206q) {
            this.f25194e = c2716qj;
        } else {
            this.f25194e = this.f25190a;
        }
        this.f25209t = (this.f25208s && this.f25207r) ? false : false;
    }
}
