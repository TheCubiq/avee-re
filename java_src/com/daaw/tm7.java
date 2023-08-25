package com.daaw;

import java.util.Objects;
/* loaded from: classes.dex */
public final class tm7 {

    /* renamed from: a */
    public final String f27875a;

    /* renamed from: b */
    public final f92 f27876b;

    /* renamed from: c */
    public final f92 f27877c;

    /* renamed from: d */
    public final int f27878d;

    /* renamed from: e */
    public final int f27879e;

    public tm7(String str, f92 f92Var, f92 f92Var2, int i, int i2) {
        boolean z = false;
        if (i != 0) {
            i2 = i2 == 0 ? 0 : i2;
            uo4.m7874d(z);
            uo4.m7875c(str);
            this.f27875a = str;
            Objects.requireNonNull(f92Var);
            this.f27876b = f92Var;
            Objects.requireNonNull(f92Var2);
            this.f27877c = f92Var2;
            this.f27878d = i;
            this.f27879e = i2;
        }
        z = true;
        uo4.m7874d(z);
        uo4.m7875c(str);
        this.f27875a = str;
        Objects.requireNonNull(f92Var);
        this.f27876b = f92Var;
        Objects.requireNonNull(f92Var2);
        this.f27877c = f92Var2;
        this.f27878d = i;
        this.f27879e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tm7.class == obj.getClass()) {
            tm7 tm7Var = (tm7) obj;
            if (this.f27878d == tm7Var.f27878d && this.f27879e == tm7Var.f27879e && this.f27875a.equals(tm7Var.f27875a) && this.f27876b.equals(tm7Var.f27876b) && this.f27877c.equals(tm7Var.f27877c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f27878d + 527) * 31) + this.f27879e) * 31) + this.f27875a.hashCode()) * 31) + this.f27876b.hashCode()) * 31) + this.f27877c.hashCode();
    }
}
