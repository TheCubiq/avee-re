package com.daaw;

import android.util.Pair;
import java.io.IOException;
/* loaded from: classes.dex */
public final class b88 implements zr8, ln8 {

    /* renamed from: a */
    public final h88 f4549a;

    /* renamed from: b */
    public yr8 f4550b;

    /* renamed from: c */
    public jn8 f4551c;

    /* renamed from: d */
    public final /* synthetic */ n88 f4552d;

    public b88(n88 n88Var, h88 h88Var) {
        yr8 yr8Var;
        jn8 jn8Var;
        this.f4552d = n88Var;
        yr8Var = n88Var.f19720f;
        this.f4550b = yr8Var;
        jn8Var = n88Var.f19721g;
        this.f4551c = jn8Var;
        this.f4549a = h88Var;
    }

    @Override // com.daaw.zr8
    /* renamed from: K */
    public final void mo1961K(int i, pr8 pr8Var, ar8 ar8Var, lr8 lr8Var) {
        if (m26325a(i, pr8Var)) {
            this.f4550b.m3362k(ar8Var, lr8Var);
        }
    }

    @Override // com.daaw.zr8
    /* renamed from: N */
    public final void mo1960N(int i, pr8 pr8Var, ar8 ar8Var, lr8 lr8Var, IOException iOException, boolean z) {
        if (m26325a(i, pr8Var)) {
            this.f4550b.m3364i(ar8Var, lr8Var, iOException, z);
        }
    }

    @Override // com.daaw.zr8
    /* renamed from: V */
    public final void mo1959V(int i, pr8 pr8Var, ar8 ar8Var, lr8 lr8Var) {
        if (m26325a(i, pr8Var)) {
            this.f4550b.m3366g(ar8Var, lr8Var);
        }
    }

    @Override // com.daaw.zr8
    /* renamed from: W */
    public final void mo1958W(int i, pr8 pr8Var, ar8 ar8Var, lr8 lr8Var) {
        if (m26325a(i, pr8Var)) {
            this.f4550b.m3368e(ar8Var, lr8Var);
        }
    }

    /* renamed from: a */
    public final boolean m26325a(int i, pr8 pr8Var) {
        yr8 yr8Var;
        jn8 jn8Var;
        pr8 pr8Var2 = null;
        if (pr8Var != null) {
            h88 h88Var = this.f4549a;
            int i2 = 0;
            while (true) {
                if (i2 >= h88Var.f12186c.size()) {
                    break;
                } else if (((pr8) h88Var.f12186c.get(i2)).f18808d == pr8Var.f18808d) {
                    pr8Var2 = pr8Var.m13184c(Pair.create(h88Var.f12185b, pr8Var.f18805a));
                    break;
                } else {
                    i2++;
                }
            }
            if (pr8Var2 == null) {
                return false;
            }
        }
        int i3 = i + this.f4549a.f12187d;
        yr8 yr8Var2 = this.f4550b;
        if (yr8Var2.f33991a != i3 || !it5.m19376t(yr8Var2.f33992b, pr8Var2)) {
            yr8Var = this.f4552d.f19720f;
            this.f4550b = yr8Var.m3372a(i3, pr8Var2, 0L);
        }
        jn8 jn8Var2 = this.f4551c;
        if (jn8Var2.f15251a == i3 && it5.m19376t(jn8Var2.f15252b, pr8Var2)) {
            return true;
        }
        jn8Var = this.f4552d.f19721g;
        this.f4551c = jn8Var.m18379a(i3, pr8Var2);
        return true;
    }

    @Override // com.daaw.zr8
    /* renamed from: d */
    public final void mo1957d(int i, pr8 pr8Var, lr8 lr8Var) {
        if (m26325a(i, pr8Var)) {
            this.f4550b.m3370c(lr8Var);
        }
    }
}
