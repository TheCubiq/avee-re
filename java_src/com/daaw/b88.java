package com.daaw;

import android.util.Pair;
import java.io.IOException;
/* loaded from: classes.dex */
public final class b88 implements zr8, ln8 {
    public final h88 a;
    public yr8 b;
    public jn8 c;
    public final /* synthetic */ n88 d;

    public b88(n88 n88Var, h88 h88Var) {
        yr8 yr8Var;
        jn8 jn8Var;
        this.d = n88Var;
        yr8Var = n88Var.f;
        this.b = yr8Var;
        jn8Var = n88Var.g;
        this.c = jn8Var;
        this.a = h88Var;
    }

    @Override // com.daaw.zr8
    public final void K(int i, pr8 pr8Var, ar8 ar8Var, lr8 lr8Var) {
        if (a(i, pr8Var)) {
            this.b.k(ar8Var, lr8Var);
        }
    }

    @Override // com.daaw.zr8
    public final void N(int i, pr8 pr8Var, ar8 ar8Var, lr8 lr8Var, IOException iOException, boolean z) {
        if (a(i, pr8Var)) {
            this.b.i(ar8Var, lr8Var, iOException, z);
        }
    }

    @Override // com.daaw.zr8
    public final void V(int i, pr8 pr8Var, ar8 ar8Var, lr8 lr8Var) {
        if (a(i, pr8Var)) {
            this.b.g(ar8Var, lr8Var);
        }
    }

    @Override // com.daaw.zr8
    public final void W(int i, pr8 pr8Var, ar8 ar8Var, lr8 lr8Var) {
        if (a(i, pr8Var)) {
            this.b.e(ar8Var, lr8Var);
        }
    }

    public final boolean a(int i, pr8 pr8Var) {
        yr8 yr8Var;
        jn8 jn8Var;
        pr8 pr8Var2 = null;
        if (pr8Var != null) {
            h88 h88Var = this.a;
            int i2 = 0;
            while (true) {
                if (i2 >= h88Var.c.size()) {
                    break;
                } else if (((pr8) h88Var.c.get(i2)).d == pr8Var.d) {
                    pr8Var2 = pr8Var.c(Pair.create(h88Var.b, pr8Var.a));
                    break;
                } else {
                    i2++;
                }
            }
            if (pr8Var2 == null) {
                return false;
            }
        }
        int i3 = i + this.a.d;
        yr8 yr8Var2 = this.b;
        if (yr8Var2.a != i3 || !it5.t(yr8Var2.b, pr8Var2)) {
            yr8Var = this.d.f;
            this.b = yr8Var.a(i3, pr8Var2, 0L);
        }
        jn8 jn8Var2 = this.c;
        if (jn8Var2.a == i3 && it5.t(jn8Var2.b, pr8Var2)) {
            return true;
        }
        jn8Var = this.d.g;
        this.c = jn8Var.a(i3, pr8Var2);
        return true;
    }

    @Override // com.daaw.zr8
    public final void d(int i, pr8 pr8Var, lr8 lr8Var) {
        if (a(i, pr8Var)) {
            this.b.c(lr8Var);
        }
    }
}
