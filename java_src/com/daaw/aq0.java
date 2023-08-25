package com.daaw;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class aq0 {

    /* renamed from: a */
    public de0 f3427a;

    /* renamed from: b */
    public bq0 f3428b = new bq0();

    /* renamed from: c */
    public List<WeakReference<fe0>> f3429c = new ArrayList();

    public aq0(de0 de0Var) {
        this.f3427a = de0Var;
    }

    /* renamed from: a */
    public void m27224a(fe0 fe0Var) {
        this.f3429c.add(new WeakReference<>(fe0Var));
    }

    /* renamed from: b */
    public fe0 m27223b(int i) {
        if (i < 0 || i >= this.f3429c.size()) {
            return null;
        }
        return this.f3429c.get(i).get();
    }

    /* renamed from: c */
    public float m27222c(float f, boolean z, float f2, float f3) {
        return (!z || f3 >= f2) ? f * f2 : f * f3;
    }

    /* renamed from: d */
    public float m27221d(float f, boolean z, float f2, float f3) {
        return (!z || f2 >= f3) ? f * f3 : f * f2;
    }

    /* renamed from: e */
    public float m27220e(float f) {
        return m27219f(f, true);
    }

    /* renamed from: f */
    public float m27219f(float f, boolean z) {
        return f * ((!z || this.f3427a.mo2890a() >= this.f3427a.mo2885f()) ? this.f3427a.mo2885f() : this.f3427a.mo2890a());
    }

    /* renamed from: g */
    public float m27218g(float f, boolean z) {
        return f * ((!z || this.f3427a.mo2885f() >= this.f3427a.mo2890a()) ? this.f3427a.mo2890a() : this.f3427a.mo2885f());
    }

    /* renamed from: h */
    public float m27217h(float f) {
        return f * (this.f3427a.mo2890a() < this.f3427a.mo2885f() ? this.f3427a.mo2890a() : this.f3427a.mo2885f());
    }

    /* renamed from: i */
    public float m27216i(int i) {
        float f;
        if (i != 1) {
            if (i == 2) {
                f = 0.5f;
            } else if (i != 3) {
                return 0.0f;
            } else {
                f = 1.0f;
            }
            return this.f3427a.mo2885f() * f;
        }
        return this.f3427a.mo2885f() * 0.0f;
    }

    /* renamed from: j */
    public float m27215j(int i) {
        float f;
        if (i != 1) {
            if (i == 2) {
                f = 0.5f;
            } else if (i != 3) {
                return 0.0f;
            } else {
                f = 1.0f;
            }
            return this.f3427a.mo2890a() * f;
        }
        return this.f3427a.mo2890a() * 0.0f;
    }

    /* renamed from: k */
    public float m27214k(float f, boolean z) {
        return f * ((!z || this.f3427a.mo2890a() >= this.f3427a.mo2885f()) ? this.f3427a.mo2885f() : this.f3427a.mo2890a());
    }

    /* renamed from: l */
    public float m27213l(float f, boolean z) {
        return f * ((!z || this.f3427a.mo2885f() >= this.f3427a.mo2890a()) ? this.f3427a.mo2890a() : this.f3427a.mo2885f());
    }

    /* renamed from: m */
    public String m27212m(String str) {
        String mo2873d = this.f3427a.mo2889b().mo4184b().mo2873d(str);
        if (mo2873d == null) {
            lz1.m16363c("result null, " + str);
            return str;
        }
        return mo2873d;
    }

    /* renamed from: n */
    public bs1 m27211n(String str, bs1 bs1Var, bs1 bs1Var2) {
        bs1 mo2876a = this.f3427a.mo2889b().mo4184b().mo2876a(str, bs1Var, bs1Var2, this.f3428b, this.f3427a);
        if (mo2876a == null) {
            lz1.m16363c("result null, " + str);
            return new bs1(0.0f, 0.0f);
        }
        return mo2876a;
    }

    /* renamed from: o */
    public void m27210o() {
        this.f3429c.clear();
    }

    /* renamed from: p */
    public void m27209p(float f) {
        this.f3428b.f5036a = f;
    }

    /* renamed from: q */
    public void m27208q(float f) {
        this.f3428b.f5037b = f;
    }
}
