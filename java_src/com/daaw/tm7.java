package com.daaw;

import java.util.Objects;
/* loaded from: classes.dex */
public final class tm7 {
    public final String a;
    public final f92 b;
    public final f92 c;
    public final int d;
    public final int e;

    public tm7(String str, f92 f92Var, f92 f92Var2, int i, int i2) {
        boolean z = false;
        if (i != 0) {
            i2 = i2 == 0 ? 0 : i2;
            uo4.d(z);
            uo4.c(str);
            this.a = str;
            Objects.requireNonNull(f92Var);
            this.b = f92Var;
            Objects.requireNonNull(f92Var2);
            this.c = f92Var2;
            this.d = i;
            this.e = i2;
        }
        z = true;
        uo4.d(z);
        uo4.c(str);
        this.a = str;
        Objects.requireNonNull(f92Var);
        this.b = f92Var;
        Objects.requireNonNull(f92Var2);
        this.c = f92Var2;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tm7.class == obj.getClass()) {
            tm7 tm7Var = (tm7) obj;
            if (this.d == tm7Var.d && this.e == tm7Var.e && this.a.equals(tm7Var.a) && this.b.equals(tm7Var.b) && this.c.equals(tm7Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.d + 527) * 31) + this.e) * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }
}
