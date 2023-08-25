package com.daaw;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class aq0 {
    public de0 a;
    public bq0 b = new bq0();
    public List<WeakReference<fe0>> c = new ArrayList();

    public aq0(de0 de0Var) {
        this.a = de0Var;
    }

    public void a(fe0 fe0Var) {
        this.c.add(new WeakReference<>(fe0Var));
    }

    public fe0 b(int i) {
        if (i < 0 || i >= this.c.size()) {
            return null;
        }
        return this.c.get(i).get();
    }

    public float c(float f, boolean z, float f2, float f3) {
        return (!z || f3 >= f2) ? f * f2 : f * f3;
    }

    public float d(float f, boolean z, float f2, float f3) {
        return (!z || f2 >= f3) ? f * f3 : f * f2;
    }

    public float e(float f) {
        return f(f, true);
    }

    public float f(float f, boolean z) {
        return f * ((!z || this.a.a() >= this.a.f()) ? this.a.f() : this.a.a());
    }

    public float g(float f, boolean z) {
        return f * ((!z || this.a.f() >= this.a.a()) ? this.a.a() : this.a.f());
    }

    public float h(float f) {
        return f * (this.a.a() < this.a.f() ? this.a.a() : this.a.f());
    }

    public float i(int i) {
        float f;
        if (i != 1) {
            if (i == 2) {
                f = 0.5f;
            } else if (i != 3) {
                return 0.0f;
            } else {
                f = 1.0f;
            }
            return this.a.f() * f;
        }
        return this.a.f() * 0.0f;
    }

    public float j(int i) {
        float f;
        if (i != 1) {
            if (i == 2) {
                f = 0.5f;
            } else if (i != 3) {
                return 0.0f;
            } else {
                f = 1.0f;
            }
            return this.a.a() * f;
        }
        return this.a.a() * 0.0f;
    }

    public float k(float f, boolean z) {
        return f * ((!z || this.a.a() >= this.a.f()) ? this.a.f() : this.a.a());
    }

    public float l(float f, boolean z) {
        return f * ((!z || this.a.f() >= this.a.a()) ? this.a.a() : this.a.f());
    }

    public String m(String str) {
        String d = this.a.b().b().d(str);
        if (d == null) {
            lz1.c("result null, " + str);
            return str;
        }
        return d;
    }

    public bs1 n(String str, bs1 bs1Var, bs1 bs1Var2) {
        bs1 a = this.a.b().b().a(str, bs1Var, bs1Var2, this.b, this.a);
        if (a == null) {
            lz1.c("result null, " + str);
            return new bs1(0.0f, 0.0f);
        }
        return a;
    }

    public void o() {
        this.c.clear();
    }

    public void p(float f) {
        this.b.a = f;
    }

    public void q(float f) {
        this.b.b = f;
    }
}
